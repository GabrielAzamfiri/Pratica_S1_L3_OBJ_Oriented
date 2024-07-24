package Es_3;


public class Articolo {
    private long codiceArticolo;
    private String descrizioneArticolo;
    private int prezzoArticolo;
    private int numeroPezziDisponibili;

    public Articolo(String descrizioneArticolo, int prezzoArticolo, int numeroPezziDisponibili) {
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzoArticolo = prezzoArticolo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
        this.codiceArticolo = Math.round(Math.random());

    }

    public long getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public int getPrezzoArticolo() {
        return prezzoArticolo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzoArticolo=" + prezzoArticolo +
                ", numeroPezziDisponibili=" + numeroPezziDisponibili +
                '}';
    }
}
