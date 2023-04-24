import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class MineSweeperV2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int[][] map = new int[10][10];
        int mineCount = 0;
        int exploredFields = 0;
        boolean gameEnd = false;

        // fill map with random numbers from 0 to -3 and count the number of zeros
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = random.nextInt(-3, 1);
                if (map[i][j] == 0) {
                    mineCount++;
                }
            }
        }

        // Calculates the amount of free fields
        int amountFields = (100 - mineCount);

        // Prints the map initially
        System.out.println("  A  B  C  D  E  F  G  H  I  J");
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }
        String input;

        // Creates Object of DecimalFormat, makes use of "format" function to cut off the irrelevant numbers at end of percentage
        DecimalFormat df = new DecimalFormat("0.00");

        // Gameloop
        while (!gameEnd) {
            // Calculates the percentage of explored Fields in relation to all Fields
            double percentage = ((double) amountFields) / 100 * exploredFields;

            // Prints the status of the game
            System.out.println("Du hast " + exploredFields + "/" + (amountFields) +
                    " (" + df.format(percentage) + "%) " + " des nicht verminten Gebiets auf Minen gecheckt");
            System.out.println("Es sind noch " + mineCount + " Minen versteckt");
            System.out.print("Wo willst du nach Minen suchen?\n");

            // Checks if user input is within bounds
            input = scanner.nextLine();
            if (input.length() != 2 || input.charAt(0) < 'A' || input.charAt(0) > 'J' || input.charAt(1) < '0' || input.charAt(1) > '9') {
                System.out.println("Falsche eingabe, bitte bleib auf dem Feld\n");
                continue;
            }

            // Corrects the user input, so that 'A' 'O' is in the top-left corner
            int x = input.charAt(0) - 'A';
            int y = input.charAt(1) - '0';

            // Evaluates the user input
            if (map[y][x] == 0) {
                System.out.println("Das war leider eine Mine. Du hast verloren.");
                map[y][x] = 0;
                gameEnd = true;
            }
            else if (map[y][x] == -1) {
                map[y][x] = 1;
                exploredFields++;
            }
            else if (map[y][x] == -2){
                map[y][x] = 2;
                exploredFields++;
            }
            else if (map[y][x] == -3){
                map[y][x] = 3;
                exploredFields++;
            }


            // Prints the map
            System.out.println("  A  B  C  D  E  F  G  H  I  J");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 10; j++) {

                    if (map[i][j] == 1) {
                        System.out.print("[-]");
                        exploredFields++;
                    }
                    //checks the direct neighbors
                    else if (map[i][j] == 2) {
                        for (int k = x - 1; k <= x + 1; k++){
                            for (int l = y - 1; l <= y + 1; l++) {
                                //System.out.print("[-]");
                                if (map[k][l] == 0) {
                                    mineCount--;
                                    (map[k][l]) = 0;
                                    //System.out.print("[*]");
                                } else {
                                    exploredFields++;
                                    map[k][l] = 1;
                                }
                            }
                        }
                    }
                    //checks the next 2 neighbors
                    else if (map[i][j]==3){
                        for (int k = x - 2; k <= x + 2; k++){
                            for (int l = y - 2; l <= y + 2; l++) {
                                //System.out.print("[-]");
                                if (map[k][l] == 0) {
                                    mineCount--;
                                    map[k][l] = 0;
                                } else {
                                    exploredFields++;
                                    map[k][l] = 3;
                                }
                            }
                        }
                    }
                    else
                    {
                        System.out.print("[ ]");
                    }
                }
                System.out.println();
            }

            // if the user has won the game
            if (amountFields == 0) {
                System.out.println("Du hast gewonnen, du hast alle Minen gefunden");
                gameEnd = true;
            }
        }
    }
}
