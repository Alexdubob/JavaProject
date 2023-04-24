import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class RPGV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> viableChoices = new ArrayList<>();
        String[][] choices = {
                // {parentID, ID, choiceTxt, resultTxt, moveToID }
                {"-1", "0", "", "Du stehst in einer Bar."},

                {"0", "1", "Geh in die Wildnis", "Du bist in der Wildnis angekommen."},
                {"0", "2", "Trink ein Getränk", "Du lässt dir ein Getränk schmecken", "0"},

                {"1", "3", "Kämpf gegen das Monster", "Das Monster ist ein harter Gegner, aber du besiegst es.", "1"},
                {"1", "4", "Lauf vor dem Monster davon", "Du läufst wie ein Feigling zurück zur Bar.", "0"},
        };
        boolean playAgain = true;
        do {
            int count = 0;
            int currentChoice = 0;


            for (String[] choice : choices) {
                if (currentChoice == Integer.parseInt(choice[0])) {
                    count++;
                }
            }
            for (int i = 0; i < choices.length; i++) {

                if (currentChoice == Integer.parseInt(choices[i][0])) {
                    System.out.println(choices[currentChoice][3]);
                    System.out.println("-------------------------");

                    for (int j = 0; j < count; j++) {
                        System.out.println(choices[i + j][1] + ".)" + choices[i + j][2]);
                        viableChoices.add(Integer.parseInt(choices[i + j][1]));
                    }
                    System.out.println("-------------------------");

                    if (choices[currentChoice].length != 5) {

                        do {
                            System.out.println("Was möchtest du als nächstes tun?");
                            currentChoice = scanner.nextInt();
                        } while (!viableChoices.contains(currentChoice));
                        i = 0;
                    }
                    viableChoices.clear();

                    if (choices[currentChoice].length == 5) {
                        System.out.println(choices[currentChoice][3]);
                        System.out.println("-------------------------");
                        //i = 0;
                        currentChoice = Integer.parseInt(choices[currentChoice][4]);
                    }
                }
            }
        } while (playAgain);


    }
}








