import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        System.out.print("Inserisci il massimo numero di risultati: ");
        int massimoRisultati = scanner.nextInt();
        scanner.close();

        printReverseNaturalNumbers(numero, massimoRisultati);
    }

    public static void printReverseNaturalNumbers(int numero, int massimoRisultati) {
        System.out.println("Numeri naturali in ordine inverso fino a " + numero + ":");

        for (int i = numero; i >= 1 && massimoRisultati > 0; i--) {
            System.out.println(i);
            massimoRisultati--;
        }
    }
}
