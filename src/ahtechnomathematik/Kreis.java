
package ahtechnomathematik;




public class Kreis extends Display{
//Attr. 
    double radius; 
    
    public Kreis() {
    }
    
    
    public void kreis(){
        System.out.println("Kreis: \nRadius eingeben: ");
                    radius = Scan.getScan().nextDouble();
                    
                    
                    
                    System.out.println("die Fläche des kreises ist: " + (Math.pow(radius, 2) * Math.PI ));
                    System.out.println("der Umfang des Kreises ist: " + (radius * 2 * Math.PI ));
    }
}
