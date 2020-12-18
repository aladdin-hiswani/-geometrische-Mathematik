
package ahtechnomathematik;

public class Kugel extends Zylinder{

    public Kugel() {
    }

    
    
    public void kugel (){
        System.out.println("Zylinder: \nRadius eingeben: ");
                    super.radius = Scan.getScan().nextDouble(); 
                    System.out.println("Hohe eingeben: ");
                    super.hohe = Scan.getScan().nextDouble();
                    
                    System.out.println("die Grundfläche des Zylinders ist: " + super.grundFläche );
                    System.out.println("der Umfang des Zylinders  ist " + super.kreisUmfang);    
                    System.out.println("die Mantelfläche des Zylinders  ist " + super.mantelFläche);    
                    System.out.println("die Oberfläche des Zylinders  ist " + super.oberFläche);    
                    System.out.println("das Volumen des Zylinders  ist " + super.volumen); 
    }

    
}
