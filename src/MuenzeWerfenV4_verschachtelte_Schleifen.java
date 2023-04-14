import java.util.Scanner;
import java.util.Random;

public class MuenzeWerfenV4_verschachtelte_Schleifen {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int howOften = 0;
        boolean happy;



            do {

                do {
                    System.out.println("Wie oft soll die Münze geworfen werden (INSGESAMT ungerade neue Zahl 1-10)?");
                    howOften = sc.nextInt();
                }
                while (howOften < 1 || howOften > 10 || (howOften + x +y) % 2 ==0);


                for (int roll = 1; roll <= howOften; roll++) {
                    boolean head = r.nextBoolean();
                    if (head) {
                        System.out.println("Werfe Münze....Kopf");
                        x++;
                    }
                    else {
                        System.out.println("Werfe Münze....Zahl");
                        y++;
                    }
                }
                System.out.println("Summe Kopf:" + x);
                System.out.println("Summe Zahl:" + y);

                if (x < y) {
                    System.out.println("Ich gewinne das Ticket");
                } else if (x > y) {
                    System.out.println("Stefan bekommt das Ticket");
                }

                System.out.println("Bist du mit dem Ergebnis zufriedn");
                happy = sc.nextBoolean();
            } while (!happy);






    }


}


