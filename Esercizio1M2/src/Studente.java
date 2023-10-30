public class Studente {
    private final String nome;
    private final String cognome;
    private final int identificativo;

    public Studente(String nome, String cognome, int identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    // Metodi accessori (getters e setters)
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getIdentificativo() {
        return identificativo;
    }
}
