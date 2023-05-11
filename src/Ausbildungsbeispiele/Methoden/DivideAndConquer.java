package Ausbildungsbeispiele.Methoden;
import java.util.Arrays;
import java.util.Random;

public class DivideAndConquer {
    public static void main(String[] args) {

        Random random = new Random();
        int [] numbers = new int [20];

        //fill Array with random numbers
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("unsorted Array: " + Arrays.toString(numbers));


        //splitting the Array into "left" and "right"
        int n = numbers.length;
        int [] left = Arrays.copyOfRange(numbers, 0,n/2);
        int [] right = Arrays.copyOfRange(numbers, n/2,n);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));















    }
}
