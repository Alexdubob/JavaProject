package Ausbildungsbeispiele.Basic2;

import java.util.ArrayList;
import java.util.Random;

public class BingoCardGenerator {
    public static void main(String[] args) {
        Random random = new Random();


        int[][] map = new int[5][5];
        ArrayList<Integer> randomNumbers = new ArrayList();

        for (int i = 1; i < 76; i++) {
            randomNumbers.add(i);
        }

        System.out.println(randomNumbers);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {


            }
        }





        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map[i][j] = random.nextInt(1, 15);
            }
        }

        System.out.println("  B  I  N  G  O");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }*/
    }
}



