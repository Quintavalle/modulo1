public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int incrementValue = 1;

        int result = incrementAndMultiply(num1, num2, incrementValue);
        System.out.println("Risultato: " +result);
    }
    public static int incrementAndMultiply(int a, int b, int incrementValue) {
        a+= incrementValue;
        b+= incrementValue;
        int product = a*b;

        return product;
    }
}