package Es_2;


public class Main {
    public static void main(String[] args) {
        Sim primaSim = new Sim(12345, 5, new Chiamata(12345, 5));
        primaSim.stampaDati();
        Sim secondaSim = new Sim(54321, 10, new Chiamata(54321, 2));
        secondaSim.stampaDati();
    }
}
