package Ausbildungsbeispiele.Basic;
import java.util.Scanner;

public class Leetspeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String leet[] = {"@", "8", "(", "D", "3", "F", "6", "#", "!", "J", "K", "1", "M,", "N", "0", "P", "Q", "2", "$", "7", "M", "V", "W", "X", "J", "2"};
        String speak[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String leetSpeak = "";

        System.out.println("Write something.");
        String input = sc.next().toUpperCase();


        for (int i = 0; i < leet.length-1; i++){
            leetSpeak += leet[input.charAt(i) - 'A'];

            System.out.println(leetSpeak);
        }


    }
}
