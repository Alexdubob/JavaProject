import java.util.Arrays;
import java.util.Random;

public class GaudiMitStatistikV3 {
    public static void main(String[] args) {
        Random r = new Random();

        //unsorted urlist
        int[] urlist = new int[6];
        for (int x = 0; x < urlist.length; x++) {
            urlist[x] = r.nextInt(10);
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
        double average = 0;
        for (int i = 0; i < urlist.length; i++) {
            average = average + urlist[i];
        }
        System.out.println("Artithmetic average: " + average / urlist.length);

        //span
        int min = urlist[0];
        int max = urlist[urlist.length - 1];
        System.out.println("Span: " + (max - min));

        //median
        double median = 0;
        if (urlist.length % 2 == 0) {
            median = (((double) urlist[urlist.length / 2] + (double) urlist[urlist.length/2 - 1]) / 2);
        }
        else{
            median = ((double) urlist[urlist.length / 2]);
        }
        System.out.println("Median: "  + median );

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

        //average absolute deviation
        double absSum = 0;
        for (int i = 0;i < urlist.length; i++){
            absSum = (Math.abs(urlist[i] - average));
        }
        System.out.println("Average absolute deviation " + absSum / urlist.length);






    }

}















