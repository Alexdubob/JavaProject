package Orientierung;

import java.util.Random;

public class BetrunkenV1 {
    public static void main(String[] args) {
        Random r = new Random();

        int beer  = r.nextInt();
        int shots = r.nextInt();

        System.out.println("Wieviel Bier hast du getrunken? ");
        System.out.println(beer);

        System.out.println("Wieviel Shots hast du getrunken? ");
        System.out.println(shots);

        if (beer + shots ==0){
            System.out.println("Du bist gar nicht betrunken");
            }
            else if (beer + shots <=2){
            System.out.println("Du bist leicht betrunken");
            }
            else if (beer <=6 && shots ==0){
            System.out.println("Du bist Betrunken");
            }

            else{
                System.out.println("Du bist Hoffnungslos betrunken");
            }

        }



    }




