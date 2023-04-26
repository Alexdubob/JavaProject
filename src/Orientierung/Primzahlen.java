package Orientierung;

public class Primzahlen {
    public static void main(String[] args) {


        boolean prim = true;
        int c = 2;
        int n =38;


        for (int k=2; k <= n && prim; c++) {
            if (n % k == 0)
                prim = false;
        }

            if (prim)
                System.out.println("Primzahl");
                else
                System.out.println("Keine Primzahl");
            }

        }




