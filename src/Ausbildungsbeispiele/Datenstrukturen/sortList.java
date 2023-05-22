package Ausbildungsbeispiele.Datenstrukturen;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class sortList {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer>intList = new ArrayList<>();
        for (int i = 0; i <10;i++) {
            int j = random.nextInt(20);
            intList.add(j);
        }
        System.out.println("unsorted List: " + intList);


        for (int i = 0; i < intList.size(); i++) {

            for (int j = intList.size() - 1; j > i; j--) {
                if (intList.get(i) > intList.get(j)) {

                    int tmp = intList.get(i);
                    intList.set(i,intList.get(j));
                    intList.set(j,tmp);

                }

            }

        }
        for (int i: intList) {
            System.out.println(i);
        }

    }
}
