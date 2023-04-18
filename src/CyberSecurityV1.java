import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class CyberSecurityV1 {
    public static void main(String[] args) {
        Random r = new Random();

        Character[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '!'};
        ArrayList<String> generatedPasswords = new ArrayList<>();
        ArrayList<Integer> totalGuesses = new ArrayList<>();

        int currentGuess = 0;
        int numGuesses=0;
        String guessedPassword;
        boolean test ;

        for (int v = 0; v < 1000; v++) {
            String password = "";
            for (int i = 0; i < 4; i++) {
                int index = r.nextInt(characters.length);
                password += characters[index];
            }
            totalGuesses.add(currentGuess);
            currentGuess =0;
            System.out.println("Password: " + password);

            test = false;
            for (int z = 0; z < characters.length && !test; z++) {
                for (int y = 0; y < characters.length && !test; y++) {
                    for (int x = 0; x < characters.length && !test; x++) {
                        for (int w = 0; w < characters.length && !test; w++) {
                            currentGuess++;
                            numGuesses++;
                            guessedPassword = characters[z] + "" + characters[y] + "" + characters[x] + "" + characters[w] + "";
                            if (guessedPassword.equals(password)) {
                                System.out.println(guessedPassword + " == " + password);
                                //generatedPasswords.add(characters[z] + "" + characters[y] + "" + characters[x] + "" + characters[w]);
                                test = true;

                            }
                        }
                    }
                }
            }
            System.out.println("took " + currentGuess + " guesses");
        }
        Collections.sort(totalGuesses);
        System.out.println("best guess is " + totalGuesses.get(1));
        System.out.println("worst guess is " + totalGuesses.get(999));
        System.out.println("average guess is " + numGuesses / 1000);
    }
}















