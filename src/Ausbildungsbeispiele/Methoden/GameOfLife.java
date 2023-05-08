package Ausbildungsbeispiele.Methoden;

import java.util.Random;
import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Initialisierung
        System.out.print("Feldgröße eingeben: ");
        int n = scanner.nextInt();
        boolean[][] field = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = random.nextBoolean();
            }
        }

        // Generationen durchlaufen
        int generation = 0;
        while (true) {
            // Spielfeld visualisieren
            System.out.println("Generation " + generation + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(field[i][j] ? "#" : ".");
                }
                System.out.println();
            }

            // Neue Generation berechnen
            boolean[][] newField = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int neighbors = countLivingNeighbors(field, i, j);
                    if (field[i][j] && (neighbors == 2 || neighbors == 3)) {
                        // Zelle bleibt am Leben
                        newField[i][j] = true;
                    } else if (!field[i][j] && neighbors == 3) {
                        // Zelle wird geboren
                        newField[i][j] = true;
                    } else {
                        // Zelle stirbt
                        newField[i][j] = false;
                    }
                }
            }
            field = newField;

            // Warten auf Benutzereingabe oder automatisch weitermachen
            System.out.print("Weiter mit Enter, Abbruch mit q: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            generation++;
        }
    }

    // Hilfsmethode, die die Anzahl der lebenden Nachbarn einer Zelle zählt
    private static int countLivingNeighbors(boolean[][] field, int i, int j) {
        int count = 0;
        for (int di = -1; di <= 1; di++) {
            for (int dj = -1; dj <= 1; dj++) {
                if (di == 0 && dj == 0) {
                    continue;
                }
                int ni = i + di;
                int nj = j + dj;
                if (ni < 0 || ni >= field.length || nj < 0 || nj >= field[0].length) {
                    continue;
                }
                if (field[ni][nj]) {
                    count++;
                }
            }
        }
        return count;

    }
}
