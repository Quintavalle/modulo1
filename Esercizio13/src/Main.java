public class Main {
    public static void main(String[] args) {
        int number = 4;

        if (isEven(number)) {
            System.out.println(number + " è un numero pari.");
        } else {
            System.out.println(number + " è un numero dispari.");
        }
    }

    public static boolean isEven(int number) {

        return (number % 2 == 0);
    }
}