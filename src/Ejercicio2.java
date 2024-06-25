import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        /*2. Convertidor de Temperatura
        Escribe un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe poder elegir la dirección de la conversión.*/
        int option;
        double celcius = 0, fahrenheit = 0;
        Scanner intData = new Scanner(System.in);

        System.out.println("Elije una opción:\n 1. Convertir a Celcius\n 2. Convertir a Fahrenheit");
        option = intData.nextInt();

        switch (option){
            case 1:
                System.out.println("Digita el valor en Fahrenheit");
                fahrenheit = intData.nextDouble();
                celcius = (fahrenheit - 32) * 5/9;
                System.out.println("El valor en Cenlcius es:" + celcius);
                break;
            case 2:
                System.out.println("Digita el valor en celcius");
                celcius = intData.nextDouble();
                fahrenheit = (celcius * 9) / 5 + 32;
                System.out.println("El valor en Fahrenheit es: " + fahrenheit);
                break;
            default:
                System.out.println("opción no valida");
                break;
        }
    }
}
