public class EinMalEinsV3_Verschachtelte_Schleifen {
    public static void main(String[] args) {


        for (int b = 1; b <= 10; b++) {
            for (int a = 1; a <= 10; a++) {
                System.out.println(a + "x" + b + "=" + (a * b));
            }
       }
    }
}