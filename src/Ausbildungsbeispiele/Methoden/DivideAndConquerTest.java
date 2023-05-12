package Ausbildungsbeispiele.Methoden;

import java.util.Arrays;
import java.util.Random;

public class DivideAndConquerTest {
       static Random random = new Random();
        public static int findMax(int[] arr){

            return findMaxHelper(arr, 0, arr.length - 1);
        }

        private static int findMaxHelper(int[] numbers, int left, int right) {
            if (left == right) {
                return numbers[left];
            }
            else{

                int mid = (left + right) / 2;
                int maxLeft = findMaxHelper(numbers, left, mid);
                int maxRight = findMaxHelper(numbers, mid + 1, right);
                if (maxLeft > maxRight) {
                    return maxLeft;
                } else {
                    return maxRight;
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = new int[20];
            for(int i =0; i < arr.length; i++)
                arr[i] = random.nextInt(100);

            int max = findMax(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("Maximum: " + max);

        }
    }



