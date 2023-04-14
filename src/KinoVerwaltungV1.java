import java.util.Scanner;
import java.util.ArrayList;

public class KinoVerwaltungV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> chosenMovies = new ArrayList();

        String[][] movies = {{"leerer Film"}, {"Batman", "20:15", "1", "10"}, {"Matrix", "22:00", "2", "10"}, {"Matrix2", "17:00", "3", "10"}};


        System.out.println("Wieviel Geld hast du mit? ");
        int howMuchMoney = sc.nextInt();


        do {
            for (int i = 1; i < movies.length; i++) {                   //Display panel
                String status;
                if (movies[i][3].equals("0")) {
                    status = "ausgebucht";
                } else
                    status = "verfügbar";
                System.out.println(movies[i][0] + " " + movies[i][1] + " " + status);
            }
            int wichMovie;
            do {
                System.out.println("Welchen (nicht ausgebuchten) Film möchtest du sehen (0 zum abbrechen)");
                wichMovie = sc.nextInt();
            }while (wichMovie < 0||wichMovie > movies.length);
            chosenMovies.add(wichMovie);
            System.out.println("Du hast bereits Film " + chosenMovies + " geschaut");
            if (wichMovie == 0) {
                System.out.println("Tschüss");
                System.exit(0);
            }

            System.out.println("Es sind noch " + movies[wichMovie][3] + " verfügbar. Wie viele möchtest du kaufen");
            int tickets = sc.nextInt();
            int seats = Integer.parseInt(movies[wichMovie][3]);
            seats = (seats - tickets);
            movies[wichMovie][3] = String.valueOf(seats);


            System.out.println("Du kaufst " + tickets + " um " + (tickets * 15) + "€ und hast jetzt noch " + (howMuchMoney - (tickets * 15)) + "€");
            howMuchMoney = (howMuchMoney - (tickets * 15));

        } while (howMuchMoney > 15);
        System.out.println("Du hast zu wenig Geld.");


    }
}
