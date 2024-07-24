package Es_3;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("Ps5", 500, 2);
        Articolo articolo2 = new Articolo("TV_LG", 350, 4);
        Cliente cliente1 = new Cliente("Gabriel", "Azamfiri", "gabrielazamfirigmail.com");
        Carrello carrelloCliente1 = new Carrello(cliente1.getCodiceCliente());
        carrelloCliente1.addArticle(articolo1);
        carrelloCliente1.addArticle(articolo2);
        System.out.println(carrelloCliente1.getElencoArticoli());
        System.out.println(carrelloCliente1.getTotaleCostoArticoli());

    }
}
