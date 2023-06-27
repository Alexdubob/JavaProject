package Ausbildungsbeispiele.Heredity;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("red",true,2);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Shape rectangle = new Rectangle("blue",true, 5, 2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Shape square = new Square("yellow", false, 4);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());


    }
}
