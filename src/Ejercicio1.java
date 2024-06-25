import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
         /*1. Calculadora Básica
        Crea un programa que permita al usuario introducir dos números y luego elegir una operación básica (suma, resta, multiplicación, división). El programa debe imprimir el resultado de la operación.*/

        Scanner intro = new Scanner(System.in);
        double firstNumber, secondNumber, result;
        int option;
        System.out.println("Ingresa el primer número");
        firstNumber = intro.nextDouble();
        System.out.println("Ingresa el segundo número");
        secondNumber = intro.nextDouble();
        System.out.println("Elige una opción siendo 1.Suma, 2.Resta, 3. Multiplicación, 4. División ");
        option = intro.nextInt();

        switch (option){
            case 1:
                result = firstNumber + secondNumber;
                System.out.println("El resultado de la suma es: " + result);
                break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println("El resultado de la resta es: " + result);
                break;
            case 3:
                result = firstNumber * secondNumber;
                System.out.println("El resultado de la multiplicación es: " + result);
                break;
            case 4:
                result = firstNumber / secondNumber;
                System.out.println("El resultado de la división es: " + result);
                break;
            default:
                System.out.println("La opción no es válida");
                break;
        }
    }
}
