import java.util.Arrays;
import java.util.Random;

public class GaudiMitStatistikV2 {
    public static void main(String[] args) {
        Random r = new Random();


        //generate random integer x array defined
        int[] b = new int[100];
        for (int x = 0; x < b.length; x++) {
            b[x] = r.nextInt(b.length);

            // sorting algorithm
                int current = b[x];
                int j = x - 1;
                while (j >= 0 && b[j] > current) {
                    b[j + 1] = b[j];
                    j--;
                }
                b[j + 1] = current;




        }
        System.out.println(Arrays.toString(b));


    }
}
