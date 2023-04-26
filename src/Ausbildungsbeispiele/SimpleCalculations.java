package Ausbildungsbeispiele;
import java.text.*;

public class SimpleCalculations {
    public static void main(String[] args) {

        int a = 138;
        int b = 235;
        double c = 138.0;
        double d = 235.0;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(c + " * " + d + " = " + (c*d));
        System.out.println(c + " / " + d + " = " + (df.format(c/d)));
    }
}
