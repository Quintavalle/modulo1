public class Main {
    public static void main(String[] args) {

        String inputString = "ciao";
        int length = getStringLength(inputString);
        System.out.println("La lunghezza della stringa è: " +length);
    }

    public static int getStringLength(String input) {
        int length = input.length();
        return length;
    }
}
