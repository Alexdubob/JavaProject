public class GaudiMitArraysV2 {
    public static void main(String[] args) {

        char[] abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int howMuch = 3;
        int size = abc.length;

        for(int i=1; i<=howMuch; i++){
            char last = abc[size-1];

            for (int j=size-1 ;j>0; j--){

                abc[j] = abc[j-1];
            }

            abc[0] = last;
        }

        System.out.println(abc);

















    }
}
