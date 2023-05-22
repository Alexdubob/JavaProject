package Ausbildungsbeispiele.Sortieralgorithmen;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BingoCardGenerator {
    public static void main(String[] args) {
        int[][] card = new int[5][5];

        // Fülle die B-Spalte mit 5 zufälligen Nummern aus dem Bereich 1-15
        Set<Integer> usedNumbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number;
            do {
                number = random.nextInt(15) + 1;
            } while (usedNumbers.contains(number));
            usedNumbers.add(number);
            card[i][0] = number;
        }
        card[2][2] = 0;

        // Fülle die I-Spalte mit 5 zufälligen Nummern aus dem Bereich 16-30
        usedNumbers.clear();
        for (int i = 0; i < 5; i++) {
            int number;
            do {
                number = random.nextInt(15) + 16;
            } while (usedNumbers.contains(number));
            usedNumbers.add(number);
            card[i][1] = number;
        }

        // Fülle die N-Spalte mit 4 zufälligen Nummern aus dem Bereich 31-45
        usedNumbers.clear();
        for (int i = 0; i < 4; i++) {
            int number;
            do {
                number = random.nextInt(15) + 31;
            } while (usedNumbers.contains(number));
            usedNumbers.add(number);
            card[i][2] = number;
        }

        // Fülle die G-Spalte mit 5 zufälligen Nummern aus dem Bereich 46-60
        usedNumbers.clear();
        for (int i = 0; i < 5; i++) {
            int number;
            do {
                number = random.nextInt(15) + 46;
            } while (usedNumbers.contains(number));
            usedNumbers.add(number);
            card[i][3] = number;
        }

        // Fülle die O-Spalte mit 5 zufälligen Nummern aus dem Bereich 61-75
        usedNumbers.clear();
        for (int i = 0; i < 5; i++) {
            int number;
            do {
                number = random.nextInt(15) + 61;
            } while (usedNumbers.contains(number));
            usedNumbers.add(number);
            card[i][4] = number;
        }

        // Gib die Bingo-Karte formatiert auf der Konsole aus
        System.out.println("B  I  N  G  O");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", card[i][j]);
            }
            System.out.println();
        }
    }
}

