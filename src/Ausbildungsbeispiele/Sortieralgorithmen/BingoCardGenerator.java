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
            for (int j = 0; j < 5; j++) {
                int number;
                do {
                    number = random.nextInt(15) + 1  + 15  * j;
                } while (usedNumbers.contains(number));
                usedNumbers.add(number);
                card[i][j] = number;
            }
        }
        card[2][2] = 0;


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

