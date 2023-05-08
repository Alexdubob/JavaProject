package Ausbildungsbeispiele.Basic;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Leetspeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to translate to Leetspeak: ");
        String input = sc.nextLine().toUpperCase();

        Map<Character, Character> leetMap = new HashMap<>();
        leetMap.put('A', '@');
        leetMap.put('B', '8');
        leetMap.put('C', '(');
        leetMap.put('D', 'D');
        leetMap.put('E', '3');
        leetMap.put('F', 'F');
        leetMap.put('G', '6');
        leetMap.put('H', '#');
        leetMap.put('I', '!');
        leetMap.put('J', 'J');
        leetMap.put('K', 'K');
        leetMap.put('L', '1');
        leetMap.put('M', 'M');
        leetMap.put('N', 'N');
        leetMap.put('O', '0');
        leetMap.put('P', 'P');
        leetMap.put('Q', 'Q');
        leetMap.put('R', 'R');
        leetMap.put('S', '$');
        leetMap.put('T', '7');
        leetMap.put('U', 'U');
        leetMap.put('V', 'V');
        leetMap.put('W', 'W');
        leetMap.put('X', 'X');
        leetMap.put('Y', 'Y');
        leetMap.put('Z', '2');

        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            output.append(leetMap.getOrDefault(c, c));
        }

        System.out.println("Leetspeak translation: " + output);











    }
}
