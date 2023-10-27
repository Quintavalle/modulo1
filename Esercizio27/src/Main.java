public class Main {
    public static void main(String[] args) {
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matriceRisultato = swapRowsAndColumns(matrice);

        System.out.println("Matrice di partenza:");
        printMatrix(matrice);

        System.out.println("Matrice risultato:");
        printMatrix(matriceRisultato);
    }

    public static int[][] swapRowsAndColumns(int[][] matrice) {
        int righe = matrice.length;
        int colonne = matrice[0].length;
        int[][] matriceRisultato = new int[colonne][righe];

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matriceRisultato[j][i] = matrice[i][j];
            }
        }

        return matriceRisultato;
    }
    public static void printMatrix(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(" " + matrice[i][j]);
            }
            System.out.println();
        }
    }
}
