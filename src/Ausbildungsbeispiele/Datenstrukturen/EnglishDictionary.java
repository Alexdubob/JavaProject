package Ausbildungsbeispiele.Datenstrukturen;

import java.security.Key;
import java.util.*;

public class EnglishDictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> dictionaryEng = new HashMap<>();
        Map<String, String> dictionaryGer = new HashMap<>();

        dictionaryEng.put("hello", "hallo");
        dictionaryGer.put("hallo", "hello");


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
                dictionaryEng.put(addEnglish, addGerman);
                dictionaryGer.put(addGerman, addEnglish);
            }
            String deleteWord = "";
            if (option == 2) {
                    System.out.println("What word would you like to delete from the dictionary? ");
                deleteWord = scanner.next();
                if (!dictionaryEng.containsKey(deleteWord) && !dictionaryGer.containsKey(deleteWord)) {
                    System.out.println("there is no such word in the dictionary");
                }
                String value = dictionaryEng.get(deleteWord);
                if (value != null){
                    dictionaryEng.remove(deleteWord);
                    dictionaryGer.remove(value);
                }
                else {
                    value = dictionaryGer.get(deleteWord);
                    if(value != null){
                        dictionaryEng.remove(value);
                        dictionaryGer.remove(deleteWord);
                    }
                }
            }

            if (option == 3) {
                System.out.println("What word are you lookig for? ");
                String getWord = scanner.next();

                if(dictionaryGer.containsKey(getWord))
                System.out.println(dictionaryGer.get(getWord));

                else if (dictionaryEng.containsKey(getWord))
                System.out.println(dictionaryEng.get(getWord));

                if (!dictionaryEng.containsKey(getWord) && !dictionaryGer.containsKey(getWord)) {
                    System.out.println("there is no such word in the dictionary");
                }

            }

        }
        System.out.println(dictionaryEng);
        System.out.println(dictionaryGer);





    }
}