package Es_2;

import java.util.Arrays;

public class Sim {

    private Chiamata[] numeroDiChiamate;
    // ATTRIBUTI
    private long numeroTelefono;
    private int creditoDisponibile;

    // COSTRUTTI
    public Sim(long numeroTelefono, int creditoDisponibile, Chiamata numeroDiChiamate) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = creditoDisponibile;
        this.numeroDiChiamate = new Chiamata[]{numeroDiChiamate};

    }

    public void stampaDati() {
        System.out.println("CREDITO DISPONIBILE: " + getCreditoDisponibile());
        System.out.println(Arrays.toString(getNumeroDiChiamate()));
        System.out.println("NUMERO DI TELEFONO: " + getNumeroTelefono());
    }

    public int getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public Chiamata[] getNumeroDiChiamate() {
        return numeroDiChiamate;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numeroDiChiamate=" + Arrays.toString(numeroDiChiamate) +
                ", numeroTelefono=" + numeroTelefono +
                ", creditoDisponibile=" + creditoDisponibile +
                '}';
    }
}


