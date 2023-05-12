package Ausbildungsbeispiele.Datenstrukturen;

import java.util.*;

public class EnglishDictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "hallo");


        int option = 0;
        System.out.println("");
        System.out.println("What would you like to do ?");
        System.out.println("1. Add a new word into the dictionary.");
        System.out.println("2. Delete a word from the dictionary.");
        System.out.println("3. Look for a word in the dictionary.");
        option = scanner.nextInt();


        if (option == 1) {
            System.out.println("What word would you like to add ?");
        }
        if (option == 2) {
            System.out.println("What word would you like to delete from the dictionary? ");
        }
        if (option == 3) {
            System.out.println("What word are you lookig for? ");
        }


        System.out.println(dictionary);


    }
}
