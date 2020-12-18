
package ahtechnomathematik;




public class Zylinder extends Kreis{
//Attr. 
    
    double grundFläche ; 
    double kreisUmfang ; 
    double mantelFläche; 
    double oberFläche ; 
    double volumen ; 
    
    public Zylinder() {
    }

public void zylinder(){
    

System.out.println("Zylinder: \nRadius eingeben: ");
                    radius = Scan.getScan().nextDouble(); 
                    System.out.println("Hohe eingeben: ");
                    hohe = Scan.getScan().nextDouble();
    grundFläche = Math.pow(radius, 2) * Math.PI; 
    kreisUmfang = radius *2 * Math.PI; 
    mantelFläche = 2 * radius * hohe * Math.PI; 
    oberFläche = (2 * grundFläche) + mantelFläche; 
    volumen = grundFläche * hohe;
                    System.out.println("die Grundfläche des Zylinders ist: " + grundFläche );
                    System.out.println("der Umfang des Zylinders  ist " + kreisUmfang);    
                    System.out.println("die Mantelfläche des Zylinders  ist " + mantelFläche);    
                    System.out.println("die Oberfläche des Zylinders  ist " + oberFläche);    
                    System.out.println("das Volumen des Zylinders  ist " + volumen);    
                    
                    
                    
}
}
