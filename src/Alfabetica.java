import java.util.Scanner;

public class Alfabetica {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String RS = "\u001B[0m";   // Restablece el color original
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine().trim();
        String palabraMinuscula = palabra.toLowerCase();
        boolean esAlfabetica = esAlfabetica(palabra);

        if (esAlfabetica) {
            System.out.println(V + "Si" + RS);
        } else {
            System.out.println(R + "No" + RS);
        }
    }public static boolean esAlfabetica(String palabra) {
        String palabraMinuscula = palabra.toLowerCase();
        for (int i = 0; i < palabraMinuscula.length() - 1; i++) {
            if (palabraMinuscula.charAt(i) > palabraMinuscula.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
