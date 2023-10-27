public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        int result = sumIntegers(a,b);
        System.out.println("La somma di " + a + " e " + b + " è: " + result);
    }

    public static int sumIntegers(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
