public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("Mario", "Rossi", 12345);
        System.out.println("Nome: " + studente.getNome());
        System.out.println("Cognome: " + studente.getCognome());
        System.out.println("Identificativo: " + studente.getIdentificativo());
    }
}
