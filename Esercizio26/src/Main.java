public class Main {
    public static void main(String[] args) {
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sommaPrimaRiga = sumOfFirstRow(matrice);

        System.out.println("Matrice:");
        printMatrix(matrice);
        System.out.println("Somma della prima riga: " + sommaPrimaRiga);
    }
    public static int sumOfFirstRow(int[][] matrice) {
        int somma = 0;
        for (int valore : matrice[0]) {
            somma += valore;
        }
        return somma;
    }
    public static void printMatrix(int[][] matrice) {
        for (int[] riga : matrice) {
            for (int valore : riga) {
                System.out.print(valore + " ");
            }
            System.out.println();
        }
    }
}

