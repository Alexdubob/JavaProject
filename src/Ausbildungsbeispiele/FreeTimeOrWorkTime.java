package Ausbildungsbeispiele;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.*;


public class FreeTimeOrWorkTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //setting worktimes
        LocalTime start = LocalTime.parse("08:30");
        LocalTime lunch = LocalTime.parse("12:00");
        LocalTime afternoon = LocalTime.parse("12:30");
        LocalTime end = LocalTime.parse("15:30");

        //Userinput
        System.out.println("Enter a valid Time");
        String input = sc.nextLine();
        LocalTime time = LocalTime.parse(input);

        //check if the input is withing the worktime
        boolean validWorkTime = (time.isAfter(start) && time.isBefore(lunch) || time.isAfter(afternoon) && time.isBefore(end));
        System.out.println(validWorkTime);















    }
}
