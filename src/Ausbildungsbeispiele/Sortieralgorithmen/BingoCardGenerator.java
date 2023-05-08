package Ausbildungsbeispiele.Sortieralgorithmen;

import java.util.ArrayList;
import java.util.Random;

public class BingoCardGenerator {
    public static void main(String[] args) {
        Random random = new Random();


        int[][] map = new int[5][5];
        ArrayList<Integer> randomNumbers = new ArrayList();



        //roll again when the randomNumbers.contain random
        while(randomNumbers.contains(random)) {
            randomNumbers.add(random.nextInt(1, 15));

            System.out.println(randomNumbers);
        }


        }
    }




