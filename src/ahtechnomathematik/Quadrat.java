package ahtechnomathematik;

import java.util.Scanner;

public class Quadrat extends Display{

//Attr. 


//Kons
    public Quadrat() {
    }

//Method


    public void quadrat() {
        System.out.println("Quadrat: \nLänge eingeben: ");

        länge = (Scan.getScan().nextDouble());
        System.out.println("die Fläche des Quadrates ist " + Math.pow(länge, 2));
        System.out.println("der Umfang des Quadrates ist " + länge * 4);
    }

}
