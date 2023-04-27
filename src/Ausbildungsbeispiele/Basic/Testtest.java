package Ausbildungsbeispiele.Basic;

public class Testtest {
    public static void main(String[] args) {

        int a = 9;
        int b = 12;
        int x;
        System.out.println(a + " " + b);
        for (int i = 0; i <= a; i++) {
            a = a / 2;
            b = b * 2;

            if (a % 2 == 0) {
                System.out.println(b + b);
                x = b;
                b = x + b;

                System.out.println(x);
            } else {
                System.out.println(a + " " + b);
            }
        }




        /*int a [] = {2,4,6,8,7,3};
        for (int i = a.length ; i >= 0; i--){
            System.out.println(a[i -1]);
        }*/


    }
}