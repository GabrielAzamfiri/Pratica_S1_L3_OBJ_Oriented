package Es_3;


import java.util.ArrayList;

public class Carrello {
    private long clienteAssociato;
    private ArrayList<Articolo> elencoArticoli;
    private int totaleCostoArticoli;


    public Carrello(long clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new ArrayList<>();
        this.totaleCostoArticoli = 0;
    }


    public void addArticle(Articolo newArticolo) {
        elencoArticoli.add(newArticolo);
        totaleCostoArticoli += newArticolo.getPrezzoArticolo();


    }

    public long getClienteAssociato() {
        return clienteAssociato;
    }

    public ArrayList<Articolo> getElencoArticoli() {
        return elencoArticoli;
    }

    public int getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    
}
