package Ausbildungsbeispiele.Heredity;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cant be negativ");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}