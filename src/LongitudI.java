import java.util.Scanner;

public class LongitudI {

        public static final String R = "\u001B[31m";  // Rojo
        public static final String V = "\u001B[32m";  // Verde
        public static final String B = "\u001B[97m";  // Blanco
        public static final String C = "\u001B[36m";  // Cian
        public static final String A = "\u001B[33m";  // Amarillo
        public static final String CC = "\u001B[96m"; // Cian claro
        public static final String RS = "\u001B[0m";   // Restablece el color original
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print(V+"Introduce una frase: ");
            String nombre = scanner.nextLine().trim();
            String[] palabras = nombre.split("\\s+");

            System.out.println(V+"La longiud es: "+  palabras.length);
            int caracteres=0;
            int c_palabras=0;
            for (int i = 0; i < palabras.length; i++) {
                for (int j = 0; j < palabras[i].length(); j++) {
                    caracteres++;
                }
                if (caracteres <palabras[i].length()){
                c_palabras++;
                }
            }
            System.out.print(V+"Hay "+c_palabras+" palabras con "+caracteres+" caracteres"+RS+"\n");
            System.out.println(caracteres);

        }
        public static int comprueba(String frase, int k){
            String[] palabras = frase.split("\\s+");
            int c_palabras = 0;
            for (int i = 0; i < palabras.length; i++) {
                if (k == palabras[i].length()){
                    c_palabras++;
                }
            }
            return c_palabras;
        }
}
