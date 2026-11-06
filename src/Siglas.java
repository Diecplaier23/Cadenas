
import java.util.Scanner;

public class Siglas {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String B = "\u001B[97m";
    public static final String C = "\u001B[36m";
    public static final String A = "\u001B[33m";
    public static final String CC = "\u001B[96m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine().trim();
        String[] palabras = frase.split("\\s+");

        System.out.println(V + "Siglas: " + B + siglas(palabras) + RS);
    }
    public static String siglas(String[] palabras) {
        String[] primera_letra = new String[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            if (Character.isUpperCase(palabras[i].charAt(0))) {
                primera_letra[i] = palabras[i].substring(0, 1);
            } else {
                primera_letra[i] = "";
            }
        }
        String resultado = "";
        for (int i = 0; i < primera_letra.length; i++) {
            resultado += primera_letra[i];
        }
        return resultado;
    }
}
