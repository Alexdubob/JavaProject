package Ausbildungsbeispiele.Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        Random random = new Random();

        int [] numbers = new int [10000];

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("unsorted Array: " + Arrays.toString(numbers));

        for(int k=0; k<numbers.length; k++) {
            int temp = numbers[k];
            int j = k - 1;
            while (j >= 0 && temp <= numbers[j]) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = temp;



        }
        System.out.println("sorted Array: " + Arrays.toString(numbers));


    }
}
