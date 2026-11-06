
import java.util.ArrayList;
import java.util.Scanner;

public class SumarBinario {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String RS = "\u001B[0m";  // Restablece el color original

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(V + "Introduce dos numeros binarios: " + RS);
        String binario1 = sc.nextLine();
        String binario2 = sc.nextLine();

        String[] binario1Array = new String[binario1.length()];
        String[] binario2Array = new String[binario2.length()];
        ArrayList<String> resultado = new ArrayList<>();

        // Igualamos las longitudes de los arrays añadiendo ceros a la izquierda
        if (binario1Array.length != binario2Array.length) {

            if (binario1Array.length > binario2Array.length) {

                String[] temp = new String[binario1Array.length];

                for (int i = 0; i < binario2Array.length; i++) {
                    temp[temp.length - binario2Array.length + i] = binario2Array[i];
                }
                for (int i = 0; i < temp.length - binario2Array.length; i++) {
                    temp[i] = "0";
                }
                binario2Array = temp;

            } else {
                String[] temp = new String[binario2Array.length];

                for (int i = 0; i < binario1Array.length; i++) {

                    temp[temp.length - binario1Array.length + i] = binario1Array[i];
                }
                for (int i = 0; i < temp.length - binario1Array.length; i++) {
                    temp[i] = "0";
                }
                binario1Array = temp;
            }
        }
        // Guardamos los bits de cada número en sus respectivos arrays
        for (int i = 0; i < binario1.length(); i++) {

            binario1Array[binario1Array.length - binario1.length() + i] = String.valueOf(Character.getNumericValue(binario1.charAt(i)));
        }
        for (int i = 0; i < binario2.length(); i++) {
            binario2Array[binario2Array.length - binario2.length() + i] = String.valueOf(Character.getNumericValue(binario2.charAt(i)));
        }
        // Sumamos los bits de derecha a izquierda teniendo en cuenta el acarreo
        int acarreo = 0;
        for (int i = binario1Array.length - 1; i >= 0; i--) {

            int suma = Integer.parseInt(binario1Array[i]) + Integer.parseInt(binario2Array[i]) + acarreo;

            resultado.add(String.valueOf(suma % 2));
            acarreo = suma / 2;
        }
        // Añadimos el último acarreo si existe
        if (acarreo == 1) {
            resultado.add("1");
        }
        // Mostramos el resultado en el orden correcto
        for (int i = resultado.size() - 1; i >= 0; i--) {
            System.out.print(resultado.get(i));
        }
        System.out.println();
        sc.close();
    }
}
