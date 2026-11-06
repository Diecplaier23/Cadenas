import java.util.Scanner;

public class Pasatiempos {
    public static final String V = "\u001B[32m";  // Verde
    public static final String RS = "\u001B[0m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(V+"Introduce una frase: "+RS);
        String frase = scanner.nextLine();
        System.out.println(crearPasatiempo(frase));
    }

    public static String crearPasatiempo(String frase) {
        return frase.replaceAll("[aeiouáéíóúüAEIOUÁÉÍÓÚÜ]", ".");
    }
}
