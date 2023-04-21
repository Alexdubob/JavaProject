import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class RPGV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Integer> viableChoices = new ArrayList<>();
        String[][] choices = {
                // {parentID, ID, choiceTxt, resultTxt, moveToID }
                {"-1", "0", "", "Du stehst in einer Bar."},

                {"0", "1", "Geh in die Wildnis", "Du bist in der Wildnis angekommen."},
                {"0", "2", "Trink ein Getränk", "Du lässt dir ein Getränk schmecken", "0"},

                {"1", "3", "Kämpf gegen das Monster", "Das Monster ist ein harter Gegner, aber du besiegst es.", "1"},
                {"1", "4", "Lauf vor dem Monster davon", "Du läufst wie ein Feigling zurück zur Bar.", "0"},
        };


        int currentChoice = 0;

        System.out.println(choices[currentChoice][3]);
        System.out.println("------------------------------");



        do {

            viableChoices.clear();                                                                                          // leert die Liste für jeden Schleifendurchlauf
            for (int i = 0; i < choices.length; i++) {
                if (choices[i][0].equals(Integer.toString(currentChoice))) {
                    System.out.println(choices[i][1] + ".) " + choices[i][2]);
                    viableChoices.add(Integer.parseInt(choices[i][1]));
                }
            }
            System.out.println("------------------------------");
            System.out.println("Was willst du als nächstes tun?");
            currentChoice = scanner.nextInt();
            System.out.println(choices[currentChoice][3]);
            System.out.println("");


            for (int i = 0; i < choices.length; i++) {
                if (choices[i][0].equals(Integer.toString(currentChoice))) {
                    System.out.println(choices[i][1] + ".) " + choices[i][2]);
                    viableChoices.add(Integer.parseInt(choices[i][1]));
                }
            }
            System.out.println("------------------------------");
            System.out.println("Was willst du als nächstes tun?");


        } while (true);


    //if (choices.length != 5){


    }
}




    /*for (int i = 0; i < choices.length; i++) {
        if (choices[i][currentChoice].equals(Integer.toString(currentChoice))) {
            System.out.println(choices[i][1] + ".) " + choices[i][2]);
*/








