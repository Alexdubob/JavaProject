package Ausbildungsbeispiele.OOP2.Photography;

import java.util.ArrayList;

public class Photography {
    ArrayList<Camera> cameraList = new ArrayList();


    public void createCamera(String brand, int megaPixels, double displaySize, boolean colored, Lens lens){
        Camera camera = new Camera(brand, megaPixels, displaySize, colored, lens);
        cameraList.add(camera);
    }
    public String toString() {
        String s = "";
        for (Camera p : cameraList) {
            s += p.toString()+"\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Photography p = new Photography();

        p.createCamera("samsung",1000,32,true,new Lens(100,400));
        p.createCamera("abcc",5000,24.5,false,new Lens(500,1000));
        p.createCamera("sadff",10,2.5,true,new Lens(100,400));

        System.out.println(p);
    }





}

