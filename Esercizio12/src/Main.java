public class Main {
    public static void main(String[] args) {
        int numeroConfronto = 6;
        int limiteInferiore = 4;
        int limiteSuperiore = 10;

        System.out.println("Numero di confronto: " + numeroConfronto);
        System.out.println("Limite inferiore: " + limiteInferiore);
        System.out.println("Limite superiore: " + limiteSuperiore);

        boolean risultato = checkRange(numeroConfronto, limiteInferiore, limiteSuperiore);

        if (risultato) {
            System.out.println("Il numero è compreso tra i limiti.");
        } else {
            System.out.println("Il numero non è compreso tra i limiti.");
        }
    }
    public static boolean checkRange(int numero, int inferiore, int superiore) {
        return numero >= inferiore && numero <= superiore;
    }
}