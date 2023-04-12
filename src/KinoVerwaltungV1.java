import java.util.Scanner;
import java.util.ArrayList;
public class KinoVerwaltungV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList liste = new ArrayList();

        String [] movies = {"Batman, Matrix, Matrix2"};
        boolean seatsLeft = true;

        char cancel = '0';
        while(seatsLeft && cancel !=0 ) {
            System.out.println("Welchen (nicht ausgebuchten) Film möchtest du sehen? (0 zum abbrechen)");
            cancel = sc.nextLine().charAt(0);
        }








       /* System.out.println("Wieviel Geld hast du mit?");
        int howMuchMoney = sc.nextInt();
        System.out.println("Welchen (nicht ausgebuchten) Film möchtest du sehen? (0 zum abbrechen)");
        String [] movies = sc.next();*/






    }
}
