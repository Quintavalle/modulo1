public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(2000, "AB123CD", "Fiat", "Panda");

        System.out.println("Cilindrata: " + auto.getCilindrata() + " cc");
        System.out.println("Targa: " + auto.getTarga());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
    }
}
