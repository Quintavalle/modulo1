public class Main {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        System.out.println("Valore 1: " + a);
        System.out.println("Valore 2: " + b);

        boolean sonoDiversi = compareChars(a, b);

        if (sonoDiversi) {
            System.out.println("I due caratteri sono diversi.");
        } else {
            System.out.println("I due caratteri sono uguali.");
        }
    }
    public static boolean compareChars(char a, char b) {
        return a != b;
    }
}