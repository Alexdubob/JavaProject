package Orientierung;

import java.util.Scanner;

public class BetrunkenV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie alt bist du?");
        int age = sc.nextInt();

        System.out.println("Hast du deinen Führerschein dabei?");
        boolean license = sc.nextBoolean();

        System.out.println("Wie viel Bier hat du getrunken?");
        int beer = sc.nextInt();

        System.out.println("Wie viel Shots hast du getrunken?");
        int shots = sc.nextInt();


        if ((age >= 17 && license && beer + shots == 0)
            || (age >= 19 && license && beer + shots <= 2)){
            System.out.println("Du darfst Auto fahren");
        }
        else {
            System.out.println("Du darfst nicht Auto fahren");
        }


    }
}
