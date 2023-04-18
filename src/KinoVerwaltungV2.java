import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class KinoVerwaltungV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        ArrayList<Integer> chosenMovies = new ArrayList();
        ArrayList<Integer> chosenSnacks = new ArrayList();

        String[][] movies = {{"leerer Film"}, {"Batman", "20:15", "1", "0"}, {"Matrix", "22:00", "2", "10"}, {"Matrix2", "17:00", "3", "10"}};
        String[][] snacks = {{"leere snacks"}, {"Popcorn", "1.00", "0"}, {"Chips", "2.00", "10"}, {"Schokolade", "3.50", "10"}};


        double howMuchMoney = 1;
        do {
            System.out.println("Wieviel Geld hast du mit? ");
            howMuchMoney = sc.nextDouble();
            if (howMuchMoney < 15)
                System.out.println("Du hast zu wenig Geld.");
        } while (howMuchMoney <= 0);

        int option = 1;
        while (option != 6) {
            System.out.println("");
            System.out.println("Was willst du als nächstes tun?(Du hast noch " + howMuchMoney + " €)");
            System.out.println("1. Ticket kaufen");
            System.out.println("2. Snacks kaufen");
            System.out.println("3. Film ansehen");
            System.out.println("4. Snacks essen");
            System.out.println("5. Beim Gewinnspiel mitmachen(kostet 5€)");
            System.out.println("6 Kino verlassen");
            option = sc.nextInt();


            if (option == 1) {
                for (int i = 1; i < movies.length; i++) {                                                                               //Display panel movies
                    String status;
                    if (movies[i][3].equals("0")) {
                        status = "ausgebucht";
                    } else
                        status = "verfügbar";
                    System.out.println(movies[i][0] + " " + movies[i][1] + " " + status);
                }

                int whichMovie;
                do {
                    System.out.println("Welchen (nicht ausgebuchten) Film möchtest du sehen (0 zum abbrechen)");                        //choosing a movie
                    whichMovie = sc.nextInt();
                } while ( whichMovie !=0 && whichMovie >= movies.length || movies[whichMovie][3].equals("0"));


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
                } while (howMuchMoney - (tickets * 15) < 0 || tickets > movieSeats);


                int seats = Integer.parseInt(movies[whichMovie][3]);
                seats = (seats - tickets);
                movies[whichMovie][3] = String.valueOf(seats);
                System.out.println("Du kaufst " + tickets + " um " + (tickets * 15) + "€ und hast jetzt noch " + (howMuchMoney - (tickets * 15)) + "€");
                howMuchMoney = (howMuchMoney - (tickets * 15));


                for (int x = 0; x < tickets; x++) {
                    chosenMovies.add(whichMovie);
                }
                System.out.println("Du hast bereits diese Tickets " + chosenMovies);
            }

                                                                                                                                        //Snacks
            else if (option == 2) {
                for (int j = 1; j < snacks.length; j++) {                                                                               //Display panel snacks
                    String statusSnacks;
                    if (snacks[j][2].equals("0")) {
                        statusSnacks = "ausverkauft";
                    } else
                        statusSnacks = "auf Lager";
                    System.out.println(snacks[j][0] + " " + snacks[j][1] + " " + statusSnacks);
                }


                int whichSnack;
                do {
                    System.out.println("Welchen (noch vorhandenen) Snack möchtest du kaufen? (0 zum abbrechen)");                       //choosing a Snack
                    whichSnack = sc.nextInt();
                } while (whichSnack != 0 || whichSnack >= snacks.length || snacks[whichSnack][2].equals("0") || whichSnack < 0);

                int howMuchSnacks;
                int snacksAvailable = Integer.parseInt(snacks[whichSnack][2]);
                double snackPrice = Double.parseDouble(snacks[whichSnack][1]);                                                           //snacks available
                do {
                    System.out.println("Es sind noch " + snacks[whichSnack][2] + " " + snacks[whichSnack][0] + " um jeweils " + snacks[whichSnack][1] + "€ verfügbar. Wie viele möchtest du kaufen");
                    howMuchSnacks = sc.nextInt();

                    if ((howMuchMoney - snackPrice) < snackPrice) {
                        System.out.println("Du hast zu wenig Geld.");
                    } else if (howMuchSnacks > snacksAvailable) {
                        System.out.println("zu wenig" + snacks[whichSnack][1]);
                    }
                } while ((howMuchMoney - snackPrice) < snackPrice || howMuchSnacks > snacksAvailable);

                double calculatedSnacks = (howMuchSnacks * Double.parseDouble(snacks[whichSnack][1]));
                System.out.println("Du kaufst " + snacks[whichSnack][2] + " " + snacks[whichSnack][0] + " um je " + snacks[whichSnack][1] + "€ und hast jetzt noch " + (howMuchMoney - calculatedSnacks) + "€");
                howMuchMoney = (howMuchMoney - calculatedSnacks);

                int buyedSnacks = Integer.parseInt(movies[whichSnack][3]);
                buyedSnacks = (buyedSnacks - howMuchSnacks);
                snacks[whichSnack][2] = String.valueOf(buyedSnacks);

                for (int x = 0; x < howMuchSnacks; x++) {
                    chosenSnacks.add(whichSnack);
                }
                System.out.println("Du hast bereits diese Snacks " + chosenSnacks);


            } else if (option == 3) {
                int pickedMovie;
                do {
                    System.out.println("Welchen Film (für den du noch ein Ticket hast) möchtest du sehen? (0 für abbrechen)");                  //pick a movie
                    for (int y = 0; y < chosenMovies.size(); y++) {
                        System.out.println(chosenMovies.get(y));
                    }
                    pickedMovie = sc.nextInt();
                } while (pickedMovie != 0 || !chosenMovies.contains(pickedMovie));
                chosenMovies.remove(pickedMovie);
                System.out.println("Du schaust dir den Film " + movies[pickedMovie][0] + " an.");
            } else if (option == 4) {
                int pickedSnack;
                do {
                    System.out.println("Welchen deiner Snacks willst du essen? (0 für abbrechen)");                                             //pick a snack
                    for (int y = 0; y < chosenSnacks.size(); y++) {
                        System.out.println(chosenSnacks.get(y));
                    }
                    pickedSnack = sc.nextInt();
                } while (pickedSnack != 0 || !chosenSnacks.contains(pickedSnack));
                chosenSnacks.remove(pickedSnack);
                System.out.println("Du verspeist 1" + snacks[pickedSnack][0] + " . Mjam!");
            } else if (option == 5) {
                int a = 1;
                int b = 1;
                int c = a + b;
                int counter = 10;
                int randomNumber = r.nextInt(201);
                boolean checkRandom = false;
                System.out.println("Deine Glückszahl ist :" + randomNumber);

                for (int x = 1; x <= counter; x++) {
                    System.out.println(a + "+" + b + "=" + c + "");
                    a = b;
                    b = c;
                    c = a + b;
                    if (c == randomNumber) {
                        checkRandom = true;
                    }
                }
                if (checkRandom || randomNumber % 10 == 0) {
                    howMuchMoney = howMuchMoney + 20;
                    System.out.println(randomNumber + " ist eine Fibonacci-Nummer! Du gewinnst 20€");
                } else {
                    howMuchMoney = howMuchMoney - 5;
                    System.out.println(randomNumber + " ist KEINE Fibonacci-Nummer! Leider nicht gewonnen.");
                }
            } else if (option == 6) {
                System.out.println("Du verlässt das Kino. Auf wiedersehen!");
            }


        }

    }

}
