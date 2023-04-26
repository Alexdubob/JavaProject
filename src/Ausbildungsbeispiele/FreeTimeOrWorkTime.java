package Ausbildungsbeispiele;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.*;


public class FreeTimeOrWorkTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        LocalTime start = LocalTime.parse("08:30");
        LocalTime lunch = LocalTime.parse("12:00");
        LocalTime afternoon = LocalTime.parse("12:30");
        LocalTime end = LocalTime.parse("15:30");

        System.out.println("Enter a valid Time");
        String input = sc.nextLine();
        LocalTime time = LocalTime.parse(input);


        boolean validWorkTime = (!time.isAfter(start) && !time.isBefore(end) && !time.isBefore(lunch) && !time.isAfter(afternoon));
        System.out.println(validWorkTime);















    }
}
