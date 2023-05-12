package Ausbildungsbeispiele.Datenstrukturen;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetTheory {
    public static void main(String[] args) {

        Set<Integer> setA = setOf(1, 3, 5);
        Set<Integer> setB = setOf(3, 5, 7);
        Set<Integer> setC = setOf(5, 7, 9);

        System.out.println(setA);
        System.out.println(setB);
        System.out.println(setC);


        Set<Integer> differenceSetA = new HashSet<>(setA);
        differenceSetA.removeAll(setB);
        differenceSetA.removeAll(setC);
        assertEquals(setOf(), differenceSetA);
        System.out.println("The unique number from A " + differenceSetA);

        Set<Integer> differenceSetB = new HashSet<>(setB);
        differenceSetB.removeAll(setA);
        differenceSetB.removeAll(setC);
        assertEquals(setOf(), differenceSetB);
        System.out.println("The unique number from B " + differenceSetB);

        Set<Integer> differenceSetC = new HashSet<>(setC);
        differenceSetC.removeAll(setA);
        differenceSetC.removeAll(setB);
        assertEquals(setOf(), differenceSetC);
        System.out.println("The unique number from C " + differenceSetC);

        Set<Integer> intersectSet = setA.stream()
                .filter(setB::contains)
                .filter(setC::contains)
                .collect(Collectors.toSet());
        assertEquals(setOf(), intersectSet);
        System.out.println("Die gemeinsamen Zahlen von allen Sets " + intersectSet);


        Set<Integer> uni_temp = new HashSet<>();
        uni_temp.addAll(setA);
        uni_temp.addAll(setB);
        uni_temp.addAll(setC);
        System.out.println("Die vereinigungsmenge aller Sets " + uni_temp);


    }

    private static void assertEquals(Set<Integer> setOf, Set<Integer> differenceSet) {
    }

    private static Set<Integer> setOf(Integer... values) {
        return new HashSet<Integer>(Arrays.asList(values));


    }
}
