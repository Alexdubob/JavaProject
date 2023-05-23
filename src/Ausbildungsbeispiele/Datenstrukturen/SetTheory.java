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

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Set C: " + setC);

        System.out.println("union" + union(union(setA, setB), setC));

        System.out.println("difference" + difference(union(setA,setB),setC));

        System.out.println("intersect" + intersect(setA, intersect(setB,setC)));

    }
    private static Set<Integer> setOf(Integer... values) {
        return new HashSet<Integer>(Arrays.asList(values));
    }


    static Set<Integer> union(Set<Integer> x, Set<Integer> y) {
        Set<Integer> uni_temp = new HashSet<>();
        uni_temp.addAll(x);
        uni_temp.addAll(y);
        return uni_temp;
    }

    static Set<Integer> difference(Set<Integer> x, Set<Integer> y) {
        Set<Integer> differenceSetA = new HashSet<>(x);
        differenceSetA.removeAll(y);
        assertEquals(setOf(), differenceSetA);
        return differenceSetA;
    }

    static Set<Integer> intersect(Set<Integer> x, Set<Integer> y) {
        Set<Integer> intersectSet = x.stream()
                .filter(y::contains)
                .collect(Collectors.toSet());
        assertEquals(setOf(), intersectSet);
        return intersectSet;
    }
    private static void assertEquals(Set<Integer> setOf, Set<Integer> differenceSet) {
    }


}
