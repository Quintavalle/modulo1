import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero : ");
        int numero = scanner.nextInt();
        scanner.close();

        printMultiplicationTable(numero);
    }

    public static void printMultiplicationTable(int numero) {
        System.out.println("Tabellina aritmetica per il numero " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int risultato = numero * i;
            System.out.println(numero + " x " + i + " = " + risultato);
        }
    }
}
