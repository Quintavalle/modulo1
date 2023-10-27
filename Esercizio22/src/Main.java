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
            if (i == 5) {
               continue;
            }
            System.out.println(i);
        }
    }
}