import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class GaudiMitStatistikV3 {
    public static void main(String[] args) {
        Random r = new Random();

        //unsorted urlist
        int[] urlist = new int[10];
        for (int x = 0; x < urlist.length; x++) {
            urlist[x] = r.nextInt(100);
        }
        System.out.println("Unsorted urlist ");
        System.out.println(Arrays.toString(urlist));

        // sorting algorithm
        for (int x = 0; x < urlist.length; x++) {
            int current = urlist[x];
            int j = x - 1;
            while (j >= 0 && urlist[j] > current) {
                urlist[j + 1] = urlist[j];
                j--;
            }
            urlist[j + 1] = current;
        }
        System.out.println("Sorted urlist ");
        System.out.println(Arrays.toString(urlist));

        //arithmetic average
        int sum = 0;
        for (int i = 0; i < urlist.length; i++) {
            sum = sum + urlist[i];
        }
        System.out.println("Artithmetic average: " + sum / 2);

        //span
        int min = urlist[0];
        int max = urlist[9];
        System.out.println("Span: " + (max - min));

        //median
        System.out.println("Median: " + (urlist[4] + urlist[5]) / 2);

        //modal value
        int maxValue = 0;
        int maxCount = 0;


        for (int i = 0; i < urlist.length; i++) {
            int count = 0;

            for (int j = 0; j < urlist.length; j++) {
                if (urlist[j] == urlist[i])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = urlist[i];
            }
        }

        System.out.println("Modal value " + maxValue + " with " + maxCount);






    }

}















