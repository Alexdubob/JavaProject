package Ausbildungsbeispiele;
import java.util.Random;
import java.util.Scanner;
public class PropertiesOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int luckyNumber = 17;
        int randomNumber = random.nextInt(20);

        System.out.println("My lucky Number is: " + luckyNumber);
        System.out.println("The random Number is: " + randomNumber);
        if (randomNumber % 2 ==0){
            System.out.println("The random Number is a round Number");
        }
        else{
            System.out.println("The random Number is not a round Number");
        }
        if (randomNumber == luckyNumber){
            System.out.println("The random Number matches the Lucky Number");
        }
        if (randomNumber >9){
            System.out.println("The random Number got more then 1 digit");
        }












    }
}
