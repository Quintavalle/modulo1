import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero : ");
        int valore = scanner.nextInt();
        scanner.close();

        printNumbersUpToValue(valore);
    }

    public static void printNumbersUpToValue(int valore) {
        for (int i = 1; i <= valore; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("La stampa si è interrotta, valore uguale a 5.");
                break;
            }
        }
    }
}
