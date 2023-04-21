import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class MineSweeperV1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int[][] map = new int[10][10];
        int mineCount = 0;
        int unexploredCount = 0;

        boolean lost = false;
        ArrayList inputs = new ArrayList<>();
        boolean[] test = new boolean[map.length];


        // fill map with random numbers from 0 to -3 and count the number of zeros
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = random.nextInt(-3,1);
                if (map[i][j] == 0) {
                    mineCount++;
                }
            }
        }

        // print initial map
        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }

        int unminedCount = (100 - mineCount);
        while (!lost) {
            System.out.println("Du hast " + unexploredCount +  "/" + (unminedCount) +
                    /*" (" + ((double)(unexploredCount - unminedCount) / unexploredCount) * 100.0 + "%)*/ " des nicht verminten Gebiets auf Minen gecheckt");
            System.out.println("Es sind noch " + mineCount + " Minen versteckt");
            System.out.print("Wo willst du nach Minen suchen?");
            System.out.println("");
            String input = scanner.nextLine();

            if (inputs.contains(input) || input.length() != 2 || input.charAt(0) < 'A' || input.charAt(0) > 'J' || input.charAt(1) < '0' || input.charAt(1) > '9') {
            System.out.println("Falsche eingabe, bitte bleib auf dem Feld");
                System.out.println("");
            continue;
            }

            inputs.add(input);

            int x = input.charAt(0) - 'A';
            int y = input.charAt(1) - '0';
            if (map[y][x] == 0) {
                System.out.println("Das war leider eine Mine. Du hast verloren.");
                map[y][x] = -1;
                lost = true;
            } else {
                map[y][x] = -2;;
                unexploredCount++;
            }

            // print updated map
            System.out.println("  A  B  C  D  E  F  G  H  I  J");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 10; j++) {
                    if (map[i][j] == 0) {
                        System.out.print("[*]");
                    }  else {
                        System.out.print("[-]");
                    }
                }
                System.out.println();
            }

            if (unminedCount == 0) {
                System.out.println("Du hast gewonnen, du hast alle Minen gefunden");
            }
        }

    }
}