package Ausbildungsbeispiele.OOP2.Photography;

public class Camera {

    private int cameraCount = 0;
        private String brand;

    public int getCameraCount() {
        return cameraCount;
    }

    public void setCameraCount(int cameraCount) {
        this.cameraCount = cameraCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    private int megaPixels;
        private double displaySize;
        private boolean colored;

        private Lens lens;

    public Camera(String brand, int megaPixels, double displaySize, boolean colored,Lens lens){
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        cameraCount++;
    }

    @Override
    public String toString() {
        return "Camera {" +
                "Brand = " + brand +
                ", Megapixels = " + megaPixels +
                ", Displaysize = " + displaySize +
                ", Colored = " + colored +
                ", Lens = " + lens +
                "}";


    }
}
