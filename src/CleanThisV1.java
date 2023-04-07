import java.util.Scanner;
public class CleanThisV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie alt bist du?");
        int age = sc.nextInt();
        System.out.println("Hast du ein VIP-Ticket gekauft?");
        boolean vip = sc.nextBoolean();
        boolean access = true;

        if (age >= 18) {
            System.out.println("grünes Band");
        } else if (age >= 16) {
            System.out.println("gelbes Band");
        } else if (age > 4) {
            System.out.println("Hast du eine Begleitperson dabei");
            boolean withAdult = sc.nextBoolean();
            if (withAdult)
                System.out.println("rotes Band");
            else {
                System.out.println("Kein zutritt");
                access = false;
            }
        }
        else {
            System.out.println("Kein zutritt");
            access = false;
        }

        if (vip && access)
            System.out.println("Du bekommst noch ein goldenes Band");


    }

}



