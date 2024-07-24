package Es_1;

public class Rettangolo {
    // ATTRIBUTI
    private double altezza;
    private double base;

    // COSTRUTTI
    // parametri messi dentro le () quando creo l'oggetto
    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public static void stampaDueRettangoli(Rettangolo primoRettangolo, Rettangolo secondoRettangolo) {
        System.out.println("Il Perimetro del primo Rettangolo è: " + primoRettangolo.getPerimetro() + "mentre l'area è: " + primoRettangolo.getArea());
        System.out.println("Il Perimetro del secondo Rettangolo è: " + secondoRettangolo.getPerimetro() + "mentre l'area è: " + secondoRettangolo.getArea());
        System.out.println("La somma dei perimetri è: " + (secondoRettangolo.getPerimetro() + primoRettangolo.getPerimetro()) + "mentre la somma dell'area è: " + (secondoRettangolo.getArea() + primoRettangolo.getArea()));
    }

    public double getPerimetro() {
        return (this.altezza + this.base) * 2;
    }

    public double getArea() {
        return (this.altezza * this.base);
    }

    public void stampaRettangolo() {
        System.out.println("Perimetro del rettangolo: " + getPerimetro() + "mentre l'area è: " + getArea());
    }
}
