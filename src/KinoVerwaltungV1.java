import java.util.Scanner;
import java.util.ArrayList;

public class KinoVerwaltungV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> chosenMovies = new ArrayList();

        String[][] movies = {{"leerer Film"}, {"Batman", "20:15", "1", "0"}, {"Matrix", "22:00", "2", "10"}, {"Matrix2", "17:00", "3", "10"}};


        double howMuchMoney = 1;
        do {

            System.out.println("Wieviel Geld hast du mit? ");
            howMuchMoney = sc.nextDouble();
            if (howMuchMoney < 15)
                System.out.println("Du hast zu wenig Geld.");
        } while (howMuchMoney < 15);

        do {
            for (int i = 1; i < movies.length; i++) {                                                                               //Display panel movies
                String status;
                if (movies[i][3].equals("0")) {
                    status = "ausgebucht";
                } else
                    status = "verfügbar";
                System.out.println(movies[i][0] + " " + movies[i][1] + " " + status);
            }


            int whichMovie = 10;
            do {
                System.out.println("Welchen (nicht ausgebuchten) Film möchtest du sehen (0 zum abbrechen)");                        //choosing a movie
                whichMovie = sc.nextInt();
               /* if (whichMovie == 0) {
                    System.out.println("Tschüss");
                    System.exit(0);
                }*/
            } while (whichMovie < 0 || whichMovie >= movies.length || (movies[whichMovie][3].equals("0")));


            int movieSeats = Integer.parseInt(movies[whichMovie][3]);
            int tickets = 0;
            do {
                System.out.println("Es sind noch " + movies[whichMovie][3] + " Tickets verfügbar. Wie viele möchtest du kaufen");     //tickets available
                tickets = sc.nextInt();
                if (howMuchMoney - (tickets * 15) < 0) {
                    System.out.println("Du hast zu wenig Geld.");
                    //System.exit(0);
                } else if (tickets > movieSeats) {
                    System.out.println("zu wenig Sitze");
                }
            } while (howMuchMoney - tickets * 15 < 0 || tickets > movieSeats);


            int seats = Integer.parseInt(movies[whichMovie][3]);
            seats = (seats - tickets);
            movies[whichMovie][3] = String.valueOf(seats);
            System.out.println("Du kaufst " + tickets + " um " + (tickets * 15) + "€ und hast jetzt noch " + (howMuchMoney - (tickets * 15)) + "€");
            howMuchMoney = (howMuchMoney - (tickets * 15));


            for (int x = 0; x < tickets; x++) {
                chosenMovies.add(whichMovie);
            }
            System.out.println("Du hast bereits diese Tickets " + chosenMovies);

        } while (howMuchMoney > 15);


    }
}

