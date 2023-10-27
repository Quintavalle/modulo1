public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;

        System.out.println("Valore 1: " + num1);
        System.out.println("Valore 2: " + num2);

        boolean sonoDiversi = compareNumbers(num1, num2);

        if (sonoDiversi) {
            System.out.println("I due numeri sono diversi.");
        } else {
            System.out.println("I due numeri sono uguali.");
        }
    }
    public static boolean compareNumbers(int a, int b) {
        return a != b;
    }
}