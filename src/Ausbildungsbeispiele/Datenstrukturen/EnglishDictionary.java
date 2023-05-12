package Ausbildungsbeispiele.Datenstrukturen;

import java.util.*;

public class EnglishDictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "hallo");


        int option = 0;
        while(option != 4) {
            System.out.println("");
            System.out.println("What would you like to do ?");
            System.out.println("1. Add a new word into the dictionary.");
            System.out.println("2. Delete a word from the dictionary.");
            System.out.println("3. Look for a word in the dictionary.");
            System.out.println("4. Leave the Dictionary.");
            option = scanner.nextInt();


            if (option == 1) {
                System.out.println("What English word would you like to add ?");
                String addEnglish = scanner.next();
                System.out.println("Whats the translation of your word?");
                String addGerman = scanner.next();
                dictionary.put(addEnglish, addGerman);
            }
            String deleteWord = "";
            if (option == 2) {
                    System.out.println("What word would you like to delete from the dictionary? ");
                deleteWord = scanner.next();
                dictionary.remove(deleteWord);
                if (!dictionary.containsKey(deleteWord)) {
                    System.out.println("there is no such word in the dictionary");
                }
            }

            if (option == 3) {
                System.out.println("What word are you lookig for? ");
                String getWord = scanner.next();

                String key = null;
                String valueToFind = getWord;
                for(Map.Entry<String,String>entry:dictionary.entrySet()){
                    if(entry.getValue().equals(valueToFind)) {
                        key = entry.getKey();
                        System.out.println(key);
                    }
                    else {
                        System.out.println(dictionary.get(getWord));
                    }

                }


            }

        }
        System.out.println(dictionary);


    }
}
