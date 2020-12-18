
package ahtechnomathematik;


public class Trapez extends Kreis {
 double seitelangeD; 
    public Trapez() {
    }



public void trapez(){
    System.out.println("Trapez: \nSeite Länge a eingeben: ");
                    
                    seitelangeA = Scan.getScan().nextDouble(); 
                    System.out.println("Seite Länge b eingeben: ");
                    seitelangeB = Scan.getScan().nextDouble(); 
                    System.out.println("Seite Länge c eingeben: ");
                    seitelangeC = Scan.getScan().nextDouble(); 
                    System.out.println("Seite Länge d eingeben: ");
                    seitelangeD = Scan.getScan().nextDouble(); 
                   System.out.println("Hohe eingeben: ");
                   hohe = Scan.getScan().nextDouble(); 
                    
                    System.out.println("\u001B[30m" + "die Fläche des Trapez ist " + (((seitelangeA+ seitelangeC)/2)*hohe));
                    System.out.println("\u001B[30m" + "der Umfang des Trapez ist " + (seitelangeA + seitelangeB + seitelangeC + seitelangeD));
}    
}
