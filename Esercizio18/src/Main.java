import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un limite superiore: ");
        int limiteSuperiore = scanner.nextInt();
        scanner.close();

        int somma = calculateSum(limiteSuperiore);

        System.out.println("La somma dei numeri prima del limite " + limiteSuperiore + " è: " + somma);
    }

    public static int calculateSum(int limiteSuperiore) {
        int somma = 0;
        int numero = 1;

        while (numero < limiteSuperiore) {
            somma += numero;
            numero++;
        }

        return somma;
    }
}
