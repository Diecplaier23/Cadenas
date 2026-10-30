import java.util.Scanner;

public class LongitudIII {

    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String RS = "\u001B[0m";   // Restablece el color

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(V + "Introduce una frase: ");
        String nombre = scanner.nextLine().trim();

        System.out.print(V + "Introduce una longitud: ");
        int k = scanner.nextInt();

        boolean boleano = comprueba(nombre, k);

        if (boleano ) {
            System.out.println(R + "Hay alguna palabra con una longitud de " + k + " caracteres" + RS);
        } else {
            System.out.println(V + "No hay ninguna palabra con una longitud de " + k + " caracteres" + RS);
        }
    }
    public static boolean comprueba(String frase, int k) {

        String[] palabras = frase.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= k) {
                return false;
            }
        }

        return true;
    }
}