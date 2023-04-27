package Ausbildungsbeispiele.Basic;

public class OachkatzlSchwoaf {
    public static void main(String[] args) {

        int[] numbers = new int[101];

        for (int x = 1; x < numbers.length; x++) {
            numbers[x] = x;
            System.out.println(numbers[x]);

            if (numbers[x] % 15 == 0){
                System.out.println("OachkatzlSchwoaf"+"("+ numbers[x]+")");
            }
            else if(numbers[x] % 5 == 0){
                System.out.println("Schwoaf"+"("+ numbers[x]+")");
            }
            else if(numbers[x]% 3 == 0) {
                System.out.println("Oachkatzl " + "(" + numbers[x] + ")");
            }
        }


    }
}
