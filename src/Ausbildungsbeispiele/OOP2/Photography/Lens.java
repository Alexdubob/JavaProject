package Ausbildungsbeispiele.OOP2.Photography;

public class Lens {

    private static int lensCount = 0;
    private double minFocalLength;

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

    private double maxFocalLength;

    public Lens(double minFocalLength, double maxFocalLength) {

        if (maxFocalLength <= minFocalLength) {
            throw new IllegalArgumentException("Maximum focal length must be greater than minimum focal length.");
        }

        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        lensCount++;
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




    @Override
    public String toString() {
        return "Lens {" +
                "minFocalLength = " + minFocalLength +
                ", maxFocalLenght = " + maxFocalLength +

                "}";
    }
}

