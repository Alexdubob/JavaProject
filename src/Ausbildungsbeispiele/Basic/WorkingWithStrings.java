package Ausbildungsbeispiele.Basic;

public class WorkingWithStrings {
    public static void main(String[] args) {

        String world = " Hello World! ";
        System.out.println(world);
        System.out.println(world.toLowerCase());
        System.out.println(world.toUpperCase());
        System.out.println(world.stripLeading());
        System.out.println(world.replace("World","Codersbay"));
        System.out.println((world+ "\n").repeat(15));

    }
}
