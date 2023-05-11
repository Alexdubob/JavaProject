package Ausbildungsbeispiele.Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random random = new Random();


        int [] numbers = new int [20];

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("unsorted Array: " + Arrays.toString(numbers));


        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = 0; j < numbers.length - i - 1; j++)
                if (numbers[j] > numbers[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;


                    System.out.println("sorted Array: " + Arrays.toString(numbers));

                }


    }
}
