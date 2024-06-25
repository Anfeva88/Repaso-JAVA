import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        /*3. Reversa de una Cadena
        Desarrolla un programa que tome una cadena de texto introducida por el usuario y la imprima en reversa.*/
        Scanner dato = new Scanner(System.in);
        String cadena = "";
        String cadenaInvertida = "";

        System.out.println("Ingresa una cadena para imprimir al revés");
        cadena = dato.nextLine();

        for (int i = cadena.length()-1; i >= 0; i--){
            cadenaInvertida += cadena.charAt(i);
        }
        System.out.println(cadenaInvertida);
        
    }
}
