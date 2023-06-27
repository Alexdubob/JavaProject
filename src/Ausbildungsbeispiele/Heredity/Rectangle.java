package Ausbildungsbeispiele.Heredity;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle (String color, boolean isFilled,double width, double length){
        super (color, isFilled);

        if (width <= 0 || length <= 0){
            throw new IllegalArgumentException("Length/Width cant be negative");
        }
        this.length = length;
        this.width = width;

    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
}
