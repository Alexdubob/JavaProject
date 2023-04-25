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
                map[y][x] = 5;
                gameEnd = true;

                //checks the direct neighbors
            } else if (map[y][x] == -2) {
                int k = x - 1;
                if (k < 0)
                    k = 0;
                for (; k <= x + 1 && k < map.length; k++) {
                    int l = y - 1;
                    if (l < 0)
                        l = 0;
                    for (; l <= y + 1 && l < map[k].length; l++) {
                        if (map[l][k] == 0) {
                            map[l][k] = 5;
                            mineCount--;
                            exploredFields++;
                        }
                        else {
                            map[l][k] = 1;
                            exploredFields++;
                        }

                    }
                }
            }
            //checks the next 2 neighbors

            else if (map[y][x] == -3) {
                int k = x - 2;
                if (k < 0)
                    k = 0;
                for (; k <= x + 2 && k < map.length; k++) {
                    int l = y - 2;
                    if (l < 0)
                        l = 0;
                    for (; l <= y + 2 && l < map.length; l++) {

                        if (map[l][k] == 0){
                            map[l][k] = 5;
                            mineCount--;
                            exploredFields++;
                            }
                        else {
                            map[l][k] = 1;
                            exploredFields++;
                        }
                    }
                }
            }

            else {
                map[y][x] = 1;
                exploredFields++;
            }

            // Prints the map
            System.out.println("  A  B  C  D  E  F  G  H  I  J");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 10; j++) {

                    if (map[i][j] == 1) {
                        System.out.print("[-]");
                    } else if (map[i][j] == 5) {
                        System.out.print("[*]");
                    } else {
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