import java.util.Scanner;

public class Digitos {
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String RS = "\u001B[0m";   // Restablece el color original
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.print(V+"Introduce caracteres alfanumericos y contaremos los numeros"+RS+"\n");
        String frase= sc.nextLine();
        int cantidad = cuantosSonDigitos(frase);
        System.out.print(V+"Hay "+B+cantidad+V+" digitos en esos caracteres"+RS+"\n");
    }
    public static int cuantosSonDigitos(String frase){
        int n_digitos=0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))){
                n_digitos++;
            }

        }
        return n_digitos;
    }
}