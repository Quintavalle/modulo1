public class Main {
    public static void main(String[] args) {

        int dividendo = 8;
        int divisore = 4;
        int quoziente = dividiNumeri(dividendo, divisore);
        System.out.println("Il quoziente della divisione è: " + quoziente);
    }

    public static int dividiNumeri(int dividendo, int divisore) {

        if (divisore == 0) {
            System.out.println("Errore, impossibile dividere per zero.");
            return 0;
        } else {
            int quoziente = dividendo / divisore;
            return quoziente;
        }
    }
}
