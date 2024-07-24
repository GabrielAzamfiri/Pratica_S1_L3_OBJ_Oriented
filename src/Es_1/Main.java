package Es_1;

import static Es_1.Rettangolo.stampaDueRettangoli;

public class Main {
    public static void main(String[] args) {

        Rettangolo primoRettangolo = new Rettangolo(10, 15);
        System.out.println("Il Perimetro del primo Rettangolo è: " + primoRettangolo.getPerimetro() + " mentre l'area è: " + primoRettangolo.getArea());
        Rettangolo secondoRettangolo = new Rettangolo(15, 20);
        secondoRettangolo.stampaRettangolo();
        stampaDueRettangoli(primoRettangolo, secondoRettangolo);

    }
}