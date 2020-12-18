package ahtechnomathematik;

public class Raute extends Kreis {
//Attr.

    double diagonaleE;
    double diagonaleF;

    public Raute() {
    }

    public void raute() {
        System.out.println("Raute: \nSeite Länge a eingeben ");
        seitelangeA = Scan.getScan().nextDouble();
        System.out.println("Diagonale e eingeben: ");
        diagonaleE = Scan.getScan().nextDouble();
        System.out.println("Diagonale f eingeben: ");
        diagonaleF = Scan.getScan().nextDouble();

        System.out.println("die Fläche ist: " + ((diagonaleE * diagonaleF) / 2));
        System.out.println("der Umfang ist " + (seitelangeA * 4));
    }
}
//((Math.pow(seitelangeA, 2))*()))
