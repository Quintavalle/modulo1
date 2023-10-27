public class Main {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        int num3 = 16;

        double average = calculateAverage(num1, num2, num3);
        System.out.println("La media dei numeri è: " +average);
    }
    public static double calculateAverage(int num1, int num2, int num3) {
        double sum = num1 + num2 + num3;
        double average = sum / 3.0;

        return average;
    }
}