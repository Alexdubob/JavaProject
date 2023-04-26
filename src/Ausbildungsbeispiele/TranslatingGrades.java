package Ausbildungsbeispiele;
import java.util.Scanner;


public class TranslatingGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String gradeMeaning [] = {"Very good","Good","Satisfactory","Sufficient","Not Sufficient"};

        System.out.println("Which grade do i get ");
        int gradeNumber = scanner.nextInt();

        if (gradeNumber >0 && gradeNumber <6) {
            System.out.println(gradeMeaning[gradeNumber - 1]);
        }
        else{
            System.out.println("Wrong input!");
        }






    }
}
