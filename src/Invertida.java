import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Invertida {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String RS = "\u001B[0m";   // Restablece el color original
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(V + "Introduce una frase y la invertiremos" + RS + "\n");
        String frase = sc.nextLine();

        System.out.println(V + "La frase invertida es: " + RS + invertir(frase));
    }
    public static String invertir (String frase) {
        String[] palabras = frase.split("\\s+");
        List<String> listaPalabras = new ArrayList<>(Arrays.asList(palabras));

        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = listaPalabras.size() - 1; i >= 0; i--) {
            fraseInvertida.append(listaPalabras.get(i)).append(" ");

        }
        String resultado = fraseInvertida.toString().trim();

        return resultado + " ";
    }

}
