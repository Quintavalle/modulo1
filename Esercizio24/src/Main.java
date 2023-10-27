import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la dimensione dell'array: ");
        int dimensione = scanner.nextInt();

        char[] caratteri = createAndFillArray(dimensione, scanner);
        scanner.close();

        printOccurrencesOfA(caratteri);
    }

    public static char[] createAndFillArray(int dimensione, Scanner scanner) {
        char[] array = new char[dimensione];
        for (int i = 0; i < dimensione; i++) {
            System.out.print("Inserisci un carattere: ");
            char carattere = scanner.next().charAt(0);
            array[i] = carattere;
        }
        return array;
    }
    public static void printOccurrencesOfA(char[] array) {
        System.out.print("Array: ");
        for (char carattere : array) {
            System.out.print(carattere);
        }
        System.out.println();

        int conteggioA = 0;
        for (char carattere : array) {
            if (carattere == 'a') {
                conteggioA++;
            }
        }

        if (conteggioA > 0) {
            System.out.println("Occorrenze del carattere 'a': " + conteggioA);
        } else {
            System.out.println(" 0 ");
        }
    }
}

