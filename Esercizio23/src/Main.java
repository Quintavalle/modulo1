public class Main {
    public static void main(String[] args) {
        int[] numeri = createAndFillArray(10);
        int somma = calculateSumOfArray(numeri);

        System.out.println("Array: " + java.util.Arrays.toString(numeri));
        System.out.println("Somma degli elementi nell'array: " + somma);
    }

    public static int[] createAndFillArray(int dimensione) {
        int[] array = new int[dimensione];
        for (int i = 0; i < dimensione; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int calculateSumOfArray(int[] array) {
        int somma = 0;
        for (int numero : array) {
            somma += numero;
        }
        return somma;
    }
}
