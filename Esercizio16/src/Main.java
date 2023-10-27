public class Main {
    public static void main(String[] args) {
        int numero = 4;
        String nomeGiorno = Giorno(numero);

        if (nomeGiorno.equals("Errore")) {
            System.out.println("Valore non valido, inserisci un numero da 1 a 7.");
        } else {
            System.out.println("Il giorno corrispondente al numero " + numero + " è " + nomeGiorno + ".");
        }
    }
    public static String Giorno(int numero) {
        switch (numero) {
            case 1:
                return "Lunedì";
            case 2:
                return "Martedì";
            case 3:
                return "Mercoledì";
            case 4:
                return "Giovedì";
            case 5:
                return "Venerdì";
            case 6:
                return "Sabato";
            case 7:
                return "Domenica";
            default:
                return "Errore";
        }
    }
}
