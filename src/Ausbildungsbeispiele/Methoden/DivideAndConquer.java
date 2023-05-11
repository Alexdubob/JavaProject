package Ausbildungsbeispiele.Methoden;

import java.util.Random;
import java.util.Arrays;

public class DivideAndConquer {
    public static void main(String[] args) {
        Random random = new Random();


        int[] numbers = new int[21];
        int numbersLength = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int midNumber = numbersLength / 2;
        int[] leftHalf = new int[midNumber];
        int[] rightHalf = new int[numbersLength - midNumber];

        //fill leftHalft with numbers from the Array
        for (int i = 0; i < midNumber; i++) {
            leftHalf[i] = numbers[i];
        }
        //fill rightHalft with numbers from the Array
        for (int i = midNumber; i < numbersLength; i++) {
            rightHalf[i - midNumber] = numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(leftHalf));
        System.out.println(Arrays.toString(rightHalf));


        int leftMax = numbers[0];
        for (int i = 0; i < midNumber; i++) {
            if (numbers[i] > leftMax) leftMax = numbers[i];
        }
        System.out.println("The maximum from left side: " + leftMax);

        int rightMax = numbers[0];
        for (int i = midNumber; i < numbers.length; i++) {
            if (numbers[i] > rightMax) rightMax = numbers[i];
        }

        System.out.println("The maximum from the right side: " + rightMax);
        int max = 0;
        if (rightMax > leftMax) {
            max = rightMax;
        } else {
            max = leftMax;
        }

        System.out.println("The total maximum is: " + max);


    }
}

