public class KleinerAlgorithmusV1 {
    public static void main(String[] args) {


        int a = 1;
        int b = 1;
        int c = a + b;
        int counter = 5;

        for (int x = 1; x <= counter; x++) {

            System.out.println(a + "+" + b + "=" + c + "");
            a = b;
            b = c;
            c = a + b;


        }
    }
}