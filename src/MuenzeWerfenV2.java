import java.util.Scanner;
import java.util.Random;

public class MuenzeWerfenV2 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie oft soll gewürfelt werden?");
        int wieOft = sc.nextInt();
        int k = 0;
        int z = 0;


        for (int würfeln = 1; würfeln <= wieOft; würfeln++) {
            boolean Kopf = r.nextBoolean();
            if (Kopf) {
                System.out.println("Werfe Münze....Kopf");
                k++;
            }
            else {
                System.out.println("Werfe Münze....Zahl");
                z++;
            }
        }
        System.out.println("Summe Kopf:" +  k);
        System.out.println("Summe Zahl:" + z);

        if (k<z) {
            System.out.println("Ich gewinne das Ticket");
        }
        else if (k>z){
            System.out.println("Stefan bekommt das Ticket");
        }
        else if (k==z){
            System.out.println("Es ist unentschieden");
        }
    }

}
