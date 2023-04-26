package Ausbildungsbeispiele;

import java.util.Random;
import java.util.Scanner;

public class PropertiesOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int luckyNumber = 17;
        int number = 0;

        System.out.println("Please enter a  valid number ");
        number = sc.nextInt();

        System.out.println("My lucky Number is: " + luckyNumber);

        if (number % 10 == 0) {
            System.out.println("Your number  is a round Number ");
        }
        if (number % 2 == 0) {
            System.out.println("Your number is a even Number");
        }
        if (number == luckyNumber) {
            System.out.println("Your number matches the Lucky Number");
        }
        if (number > 9 && number < 100) {
            System.out.println("Your number got 2 digits");
        }


    }
}
