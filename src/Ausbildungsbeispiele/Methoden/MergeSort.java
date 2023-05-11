package Ausbildungsbeispiele.Methoden;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];

        //fill Array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        mergeSort(numbers);

        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void mergeSort(int[] numbers) {

        int numbersLength = numbers.length;
        if (numbersLength < 2) {
            return;
        }

        int midNumber = numbersLength / 2;
        int[] leftHalf = new int[midNumber];
        int[] rightHalf = new int[numbersLength - midNumber];

        //fill leftHalf with numbers from the Array
        for (int i = 0; i < midNumber; i++) {
            leftHalf[i] = numbers[i];
        }
        //fill rightHalft with numbers from the Array
        for (int i = midNumber; i < numbersLength; i++) {
            rightHalf[i - midNumber] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(numbers, leftHalf, rightHalf);
    }

    private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        //sorting the arrays from low to high
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;
            } else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }



    }
}

