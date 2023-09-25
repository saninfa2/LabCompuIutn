import java.util.Scanner;
/*Programa que lea un número entero y muestre si el número es múltiplo de 10. */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("¿Multiplo de 10 o no?");
        Scanner sc = new Scanner( System.in );
        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();
        if (number%10==0){
            System.out.println("El numero es multiplo de 10");
        } else{
            System.out.println("El numero no es multiplo de 10");
        }
    }
}
