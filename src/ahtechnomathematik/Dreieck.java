
package ahtechnomathematik;



public class Dreieck extends Display{

    public Dreieck() {
    }



public void dreieck ( ){
                    System.out.println("Dreieck: \nSeitelange a eingeben: ");
                    seitelangeA = Scan.getScan().nextDouble(); 
                    System.out.println("Seitelange b eingeben: ");
                    seitelangeB = Scan.getScan().nextDouble();
                    System.out.println("Seitelange c eingeben: ");
                    seitelangeC = Scan.getScan().nextDouble();
                    System.out.println("Hohe eingeben: ");
                    hohe = Scan.getScan().nextDouble();
                    System.out.println("die Fläche ist: " + (seitelangeA*hohe)/2);
                    System.out.println("der Umfang ist " + (seitelangeA + seitelangeB+ seitelangeC));
}    
}
