package ahtechnomathematik;

import static ahtechnomathematik.Scan.scan;
import java.util.Scanner;

public class Display {

    public boolean weiter = false;
    public int wahl;
    public double länge, breit, hohe, seitelangeA, seitelangeB, seitelangeC;
    

    public void display() {

        System.out.println("Technomathitik");
        System.out.println("Wählen Sie bitte aus: ");

        Integer[] menuNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] menuTitle = {"\u001B[34m" + "Quadrat", "\u001B[34m" + "Rechtecke", "\u001B[34m" + "Dreieck", "\u001B[34m" + "Kreis", "\u001B[34m" + "Trapez", "\u001B[34m" + "Parallelogramm", "\u001B[34m" + "Raute", "\u001B[34m" + "Zylinder", "\u001B[34m" + "Kugel", "\u001B[34m" + "beenden"};
        for (int i = 0; i < menuNumber.length; i++) {
            System.out.println(menuNumber[i] + ". " + menuTitle[i]);
        }

        do {
            wahl = Scan.getScan().nextInt(); 
            switch (wahl) {
                case 1:
                    new Quadrat().quadrat();
                    System.out.println("Wieder auswählen oder beenden");
                    weiter = false;
                    break;
                case 2:
                    new Rechtecke().rechtecke();
                    System.out.println("Wieder auswählen oder beenden");
                    weiter = false;
                    break;
                case 3:
                    new Dreieck().dreieck();
                    System.out.println("Wieder auswählen oder beenden");
                    weiter = false;
                    break;
                case 4:
                    new Kreis().kreis();
                    System.out.println("Wieder auswählen oder beenden");
                    weiter = false;
                    break;
                case 5:
                    new Trapez().trapez();
                    System.out.println("Wieder auswählen oder beenden");
                    weiter = false;
                    break;
                case 6:
                    new Parallelogram().parallelogram();
                    System.out.println("Wieder auswählen oder beenden");

                    weiter = false;
                    break;
                case 7:
                    new Raute().raute();
                    System.out.println("Wieder auswählen oder beenden");
                    weiter = false;
                    break;
                case 8:
                    new Zylinder().zylinder();
                    System.out.println("Wieder auswählen oder beenden");
                    weiter = false;
                    break;
                case 9:
                    new Kugel().kugel();
                    weiter = false;
                    break;
                case 10:
                    System.out.println("Programm wird beendet");
                    weiter = true;
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    break;

            }

        } while (!weiter);
    }

    

        

}
