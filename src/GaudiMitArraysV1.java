import java.util.Random;
public class GaudiMitArraysV1 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[100];
        boolean[] cold = new boolean[10];


        /*for (int y = 0; y < a.length; y++) {                  //muss nicht sein, da schon definiert
            a[y] = r.nextInt(a.length);
            System.out.println(a[y]);
        }*/

        for (int x = 0; x < b.length; x++) {
            b[x] = r.nextInt(b.length);
            System.out.println(b[x]);
        }
        for (int i = 0; i < cold.length; i++) {
            cold[i] = i%2 == 0;
            System.out.println(cold[i]);
        }

    }
}

