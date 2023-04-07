import java.util.Scanner;

public class TaschenrechnerV3_while_Schleife {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = -1;
        int b = -1;

        char operator = 'ä';
        while (operator != 'x') {
            System.out.println("Gib einen Operator ein");
            operator = sc.nextLine().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.println("Gib die erste Zahl ein:");
                a = sc.nextInt();

                System.out.println("Gib die zweite Zahl ein:");
                b = sc.nextInt();

                switch (operator) {
                    case '+':
                        System.out.println(a + "+" + b + "=" + (a + b));
                        break;
                    case '-':
                        System.out.println(a + "-" + b + "=" + (a - b));
                        break;
                    case '*':
                        System.out.println(a + "*" + b + "=" + (a * b));
                        break;
                    case '/':
                        System.out.println(a + "/" + b + "=" + ((double) a / b));
                        break;
                    case '%':
                        System.out.println(a + "%" + b + "=" + (a % b));
                        break;
                }

                sc.nextLine();
            }
        }
    }
}