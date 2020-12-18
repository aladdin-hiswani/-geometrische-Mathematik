
package ahtechnomathematik;



public class Parallelogram extends Kreis{

    public Parallelogram() {
    }



public void parallelogram(){
    System.out.println("Parallelogram: \nSeitelange a eingeben: ");
                    seitelangeA = Scan.getScan().nextDouble(); 
                    System.out.println("Seitelange b eingeben: ");
                    seitelangeB = Scan.getScan().nextDouble();
                    
                    System.out.println("Hohe von a eingeben: ");
                    hohe = Scan.getScan().nextDouble();
                    System.out.println("die Fläche ist: " + ((seitelangeA * hohe )));
                    System.out.println("der Umfang ist " + (((seitelangeA + seitelangeB)* 2)));
}    
}
