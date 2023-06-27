package Ausbildungsbeispiele.Heredity;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}