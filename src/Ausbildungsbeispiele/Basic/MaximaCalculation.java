package Ausbildungsbeispiele.Basic;
import java.util.Scanner;
import java.util.Random;

public class MaximaCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int input = 0 ;
        int temp = 0 ;

        System.out.println("Enter some Numbers. ");

       do{
           input = sc.nextInt();

       if (input > temp){
           temp = input;
       }

       }while (!sc.hasNext("q"));

        System.out.println("The highest number is: " + temp);














      /*  do {
            System.out.println("Enter a Number");
            input = sc.nextInt();
            count++;
        }while(input!='q');*/


    }
}
