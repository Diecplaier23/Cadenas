
import java.util.Scanner;
import java.util.Locale;

public class NombreUsuario {

    public static final String R = "\u001B[31m"; // Rojo
    public static final String V = "\u001B[32m"; // Verde
    public static final String RS = "\u001B[0m";
    public static final String B = "\u001B[97m";  // Blanco
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce nombre completo: ");
        String nombre = scanner.nextLine().trim();
        String[] palabras = nombre.split("\\s+");
        if (palabras.length != 3) {
            System.out.println(R + "ERROR: Debes introducir un nombre y dos apellidos." + RS);
        } else {
            for (int i = 0; i < palabras.length; i++) {
                palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1).toLowerCase();
            }
            String nombreFormateado = String.join(" ", palabras);
            System.out.println(V+"Nombre formateado: "+B + nombreFormateado +RS);
            String iniciales = palabras[0].substring(0, 1) + "." + palabras[1].substring(0, 1) + "." + palabras[2].substring(0, 1) + ".";
            System.out.println(V+"Iniciales: "+B + iniciales +RS);
            String usuario = palabras[0].substring(0, 1) + palabras[1] + palabras[2].substring(0, 1);
            usuario = usuario.toLowerCase();
            System.out.println(V+"Usuario: "+B + usuario+RS);
        }
    }
}
