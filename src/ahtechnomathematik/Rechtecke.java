
package ahtechnomathematik;

public class Rechtecke extends Display{
//Attr
    Display scan = new Display(); 
    
    public Rechtecke() {
    }


public void rechtecke (){
                    System.out.println("Rechecke: \nLänge eingeben: ");
                    länge = Scan.getScan().nextDouble(); 
                    System.out.println("Breit eingeben: ");
                    breit = Scan.getScan().nextDouble(); 
                    
                    System.out.println("\u001B[30m" + "die Fläche des Rechecks ist " + länge * breit);
                    System.out.println("\u001B[30m" + "der Umfang des Rechecks ist " + (länge*2 + breit*2));
}    
}
