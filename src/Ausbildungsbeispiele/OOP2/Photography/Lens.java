package Ausbildungsbeispiele.OOP2.Photography;

public class Lens {

    private static int lensCount = 0;
    private double minFocalLength;
    private double maxFocalLength;


    public static int getLensCount() {
        return lensCount;
    }

    public static void setLensCount(int lensCount) {
        Lens.lensCount = lensCount;
    }

    public double getMinFocalLength() {
        return minFocalLength;
    }

    public double getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMinFocalLength(double minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public void setMaxFocalLength(double maxFocalLength) {
        if (maxFocalLength <= minFocalLength) {
            throw new IllegalArgumentException("Maximum focal length must be greater than minimum focal length.");
        }
        this.maxFocalLength = maxFocalLength;
    }

    public Lens(double minFocalLength, double maxFocalLength) {

        if (maxFocalLength <= minFocalLength) {
            throw new IllegalArgumentException("Maximum focal length must be greater than minimum focal length.");
        }

        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        lensCount++;
    }




    @Override
    public String toString() {
        return "Lens {" +
                "minFocalLength = " + minFocalLength +
                ", maxFocalLenght = " + maxFocalLength +

                "}";
    }
}

