
import java.util.Scanner;

public class Parentesis {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";   // Blanco
    public static final String C = "\u001B[36m";   // Cian
    public static final String A = "\u001B[33m";   // Amarillo
    public static final String CC = "\u001B[96m";  // Cian claro
    public static final String RS = "\u001B[0m";   // Restablece el color

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(V + "Introduce una frase con parentesis para comprobar si esta bien o mal formatada: " + RS + "\n");

        String frase = sc.nextLine();

        if (esParentizada(frase) == false) {
            System.out.print(R + "La frase no está bien parentizada" + RS + "\n");
        } else {
            System.out.print(V + "La frase está bien parentizada" + RS + "\n");
        }
    }

    public static boolean esParentizada(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == '(') {
                contador++;

            } else if (frase.charAt(i) == ')') {
                contador--;

                // Hay un paréntesis de cierre sin apertura
                if (contador < 0) {
                    return false;
                }
            }
        }

        // Todos los paréntesis deben estar correctamente cerrados
        return contador == 0;
    }
}