import java.awt.print.Printable;
import java.util.Scanner;

public class Encadenado_de_palabras {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String RS = "\u001B[0m";   // Restablece el color original
    public static void main(String[] args) {
        boolean palabraCorta = false;
        boolean palabraEncadenada = false;
        Scanner sc = new Scanner(System.in);
        System.out.print(V + "Introduce una palabra: " + RS);
        String input = sc.nextLine();
        String[] palabras = input.split("\\s+");

        palabraCorta = verificarPalabras(palabras, palabraCorta);

        if (palabraCorta == (true)) {
            System.out.print(R + "Error! La palabra '" + B + input + R + "' es demasiado corta." + RS + "\n");
        }else{
            palabraEncadenada = encadenarPalabras(palabras, palabraEncadenada);
            if (palabraEncadenada == (true)) {
                System.out.print(V + "Las palabras '" + B + input + V + "' están encadenadas." + RS + "\n");
            } else {
                System.out.print(R + "Las palabras '" + B + input + R + "' no están encadenadas." + RS + "\n");
            }

        }

    }
    public static boolean verificarPalabras(String[] palabras, boolean palabraCorta) {
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() < 3) {
                palabraCorta = true;
            }
        }
        return palabraCorta;
    }
    public static boolean encadenarPalabras(String[] palabras, boolean palabraEncadenada) { {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            if (i == 0) {
                resultado.append(palabras[i]);
            } else {
                String palabraAnterior = palabras[i - 1];
                String palabraActual = palabras[i];
                if (palabraAnterior.substring(palabraAnterior.length() - 2).equals(palabraActual.substring(0, 2))) {
                    resultado.append(" ").append(palabraActual);
                    palabraEncadenada = true;
                } else {
                    resultado.append(" ").append(palabraActual);
                    palabraEncadenada = false;
                    break;
                }
            }
        }
        return palabraEncadenada;
    }
}
}


