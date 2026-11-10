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

        if (!esBinario(binario1) || !esBinario(binario2)) {
            System.out.println(R + "Error: los numeros deben contener solo 0 y 1." + RS);
            sc.close();
            return;
        }

        String[] binario1Array = new String[binario1.length()];
        String[] binario2Array = new String[binario2.length()];
        ArrayList<String> resultado = new ArrayList<>();

        guardarBits(binario1, binario1Array);
        guardarBits(binario2, binario2Array);

        // Igualamos las longitudes de los arrays añadiendo ceros a la izquierda
        String[][] arraysIgualados = igualarLongitudes(binario1Array, binario2Array);
        binario1Array = arraysIgualados[0];
        binario2Array = arraysIgualados[1];

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

    public static String[][] igualarLongitudes(String[] binario1Array, String[] binario2Array) {
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
        return new String[][] {binario1Array, binario2Array};
    }

    public static void guardarBits(String binario, String[] binarioArray) {
        for (int i = 0; i < binario.length(); i++) {
            binarioArray[i] = String.valueOf(Character.getNumericValue(binario.charAt(i)));
        }
    }

    public static boolean esBinario(String binario) {
        if (binario == null || binario.isEmpty()) {
            return false;
        }

        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) != '0' && binario.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}
