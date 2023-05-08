package Ausbildungsbeispiele.Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random random = new Random();


        int [] numbers = new int [20];

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("unsorted Array: " + Arrays.toString(numbers));


        // Find the minimum element
        for (int i = 0; i < numbers.length; i++) {
            int min = i;
            for (int j = i+1; j < numbers.length; j++)
                if (numbers[j] < numbers[min])
                    min = j;
            // Swap the found minimum element with the first element
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;

            System.out.println("sorted Array: " + Arrays.toString(numbers));
        }


    }
}
