import java.util.Random;
public class GaudiMitArraysV1 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int [] b = new int[100];
        boolean [] truth;

        for (int x = 0; x < b.length; x++){
            b[x] = r.nextInt(100);
            System.out.println(b[x]);
        }
        for (int y = 0; y < a.length; y++) {
            b[y] = r.nextInt(10);
            System.out.println(a[y]);

        }









    }
}
