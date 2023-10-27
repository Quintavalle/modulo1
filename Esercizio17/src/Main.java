public class Main {
    public static void main(String[] args) {
        char operatore = '+';
        String tipoOperazione = identificatoreOperazione(operatore);

        if (tipoOperazione.equals("Errore")) {
            System.out.println("Operatore non valido. Inserisci +, -, *, o /.");
        } else {
            System.out.println("Tipo di operazione identificato: " + tipoOperazione);
        }
    }

    public static String identificatoreOperazione(char operatore) {
        switch (operatore) {
            case '+':
                return "Addizione";
            case '-':
                return "Sottrazione";
            case '*':
                return "Moltiplicazione";
            case '/':
                return "Divisione";
            default:
                return "Errore";
        }
    }
}
