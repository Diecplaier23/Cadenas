import java.util.Scanner;

public class Analizar {
    public static void main(String[] args) {
        int aparece=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        System.out.println("longitud: "+ palabra.length());
        System.out.println("Primera letra: "+ palabra.charAt(0));
        System.out.println("Ultima letra: "+ palabra.charAt(palabra.length() - 1));
        System.out.println("Mayúsculas: "+ palabra.toUpperCase());
        System.out.println("Minúsculas: "+ palabra.toLowerCase());
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                aparece++;
            }
        }
        System.out.println("Número de 'a': " + aparece);






    }
}
