import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int lunghezza = inputString.length();

        if (lunghezza > 10) {
            System.out.println("Lunghezza maggiore di 10.");
        } else if (lunghezza < 10) {
            System.out.println("Lunghezza minore di 10.");
        } else {
            System.out.println("Lunghezza pari a 10.");
        }
    }
}