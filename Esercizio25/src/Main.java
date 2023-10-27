import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] arraySenzaDuplicati = removeDuplicates(array);

        System.out.println("Array originale: " + Arrays.toString(array));
        System.out.println("Array senza duplicati: " + Arrays.toString(arraySenzaDuplicati));
    }
    public static int[] removeDuplicates(int[] array) {
        int lunghezzaOriginale = array.length;

        int nuovaLunghezza = 0;
        for (int i = 0; i < lunghezzaOriginale; i++) {
            boolean duplicato = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                nuovaLunghezza++;
            }
        }

        int[] arraySenzaDuplicati = new int[nuovaLunghezza];
        int index = 0;
        for (int i = 0; i < lunghezzaOriginale; i++) {
            boolean duplicato = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                arraySenzaDuplicati[index] = array[i];
                index++;
            }
        }

        return arraySenzaDuplicati;
    }
}
