package Es_3;


public class Carrello {
    private long clienteAssociato;
    private Articolo[] elencoArticoli;
    private int totaleCostoArticoli;


    public Carrello(long clienteAssociato, Articolo[] elencoArticoli, int totaleCostoArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.totaleCostoArticoli = totaleCostoArticoli;


    }

    public long getClienteAssociato() {
        return clienteAssociato;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public int getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }
}
