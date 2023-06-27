package Ausbildungsbeispiele.Heredity;

public class Square extends Rectangle {
    public Square(String color,boolean isFilled, double sideLength){
        super (color, isFilled, sideLength, sideLength);

        if (sideLength <= 0){
            throw new IllegalArgumentException("Length/Width cant be negative");
        }
    }



}
