import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ZahlenRatenV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        ArrayList<Integer> guesses = new ArrayList();
        int[] numberList = new int[101];

        int level = 1;
        do {
            System.out.println("Willkommen beim Zahlenraten-Spiel! Bitte wähle ein Level: (1, 2, 3  oder 0 zum Beenden)");
            level = scanner.nextInt();
            guesses.clear();

            if (level == 1) {
                guesses.clear();
                System.out.println("Level 1 - Zufallszahl zwischen 0 und 100:");
                int randomNumber = random.nextInt(101);
                int trys = 9;
                int guess;
                int answer = 1;
                do {
                    System.out.println("Bitte geben Sie einen Tipp ab:");
                    guess = scanner.nextInt();
                    guesses.add(guess);
                    trys--;
                    if (guess == randomNumber) {
                        trys = 9;
                        System.out.println("Du hast richtig geraten die Zahl war: " + randomNumber + " Willst du noch einmal spielen (1 = ja/2 = nein) ?");
                        answer = scanner.nextInt();
                    } else if (guess < randomNumber) {
                        System.out.println("Größer! Du hast noch " + trys + " übrig.");
                    } else if (guess > randomNumber) {
                        System.out.println("Kleiner! Du hast noch " + trys + "übrig. ");
                    }
                    if (trys == 0) {
                        System.out.println(trys + " Versuche, Du hast verloren! ");
                    }
                } while (trys != 0 && answer != 2);
            }

            if (level == 2) {

                System.out.println("Level 2 - Zufallszahl zwischen 0 und 100:");
                int randomNumber = random.nextInt(101);
                int trys = 9;
                int answer = 1;

                do {
                    System.out.println("Du hast " + trys + " versuche übrig.");
                    System.out.println("Deine bisherigen Tipps " + guesses);
                    System.out.println("Bitte geben Sie einen Tipp ab:");
                    int guess = scanner.nextInt();
                    guesses.add(guess);
                    trys--;
                    int diff = Math.abs(guess - randomNumber);


                    if (guess == randomNumber) {
                        trys = 9;
                        System.out.println("Du hast richtig geraten die Zahl war: " + randomNumber + " Willst du noch einmal spielen (1 = ja/2 = nein) ?");
                        answer = scanner.nextInt();
                        guesses.clear();
                    } else if (diff <= 3) {
                        System.out.println("„fast da“: zwischen 1 und 3 daneben.");
                    } else if (diff <= 10) {
                        System.out.println("relativ nahe“: zwischen 4 und 10 daneben ");
                    } else if (diff <= 20) {
                        System.out.println("Nicht ganz so weit weg“: zwischen 11 und 20 daneben");
                    } else {
                        System.out.println("Weit weg“: über 20 daneben");
                    }
                    if (trys == 0) {
                        System.out.println(trys + " Versuche, Du hast verloren! ");
                        guesses.clear();
                    }

                } while (trys != 0 && answer != 2);
            }
            if (level == 3) {
                guesses.clear();
                System.out.println("Level 3 - Zufallszahl zwischen 0 und 100 gegen Computer.");
                int randomNumber = random.nextInt(101);
                int guess = 50;
                int answer = 1;
                int trys = 18;
                boolean humanTurn;
                int min = 0;
                int max = 100;
                humanTurn = random.nextBoolean();


                do {
                    System.out.println("Die bisherigen abgegebenen Tipps " + guesses);


                    if (humanTurn) {
                        System.out.println("Bitte geben Sie einen Tipp ab:");
                        guess = scanner.nextInt();
                        guesses.add(guess);
                        humanTurn = false;
                        trys--;

                    } else if (!humanTurn) {
                        guess = (min + max) / 2;
                        System.out.println("Der Computer wählt " + guess);
                        guesses.add(guess);
                        humanTurn = true;
                        trys--;
                    }
                    if (!humanTurn){
                        if (guess == randomNumber) {
                            System.out.println("Du hast richtig geraten die Zahl war: " + randomNumber + " Willst du noch einmal spielen (1 = ja/2 = nein) ?");
                            answer = scanner.nextInt();
                        }
                    }
                    if (humanTurn){
                        if (guess == randomNumber){
                            System.out.println("Du hast verloren, der Computer hat die Zufallszahl " + randomNumber + " erraten. ");
                        }
                    }
                    if (guess < randomNumber ) {
                        System.out.println("Größer! Es sind noch " + trys + " versuche übrig.");
                        System.out.println("");
                        if (guess > min) {
                            min = guess + 1;
                        }
                    }
                    else if (guess > randomNumber) {
                        System.out.println("Kleiner! Es sind noch " + trys + " versuche übrig. ");
                        System.out.println("");
                        if (guess < max) {
                            max = guess - 1;
                        }
                    }
                    if (trys == 0) {
                        System.out.println("Du hast verloren! Du hat keine versuche mehr. ");
                    }
                } while (answer != 2 && trys != 0 && guess != randomNumber);
            }


        } while (level != 0);

    }
}


