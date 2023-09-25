import java.util.Scanner;
/* Programa Java que lea un numero entero por teclado y calcule si es
par o impar.*/

public class Ejercicio1 {
        public static void main(String[] args) {
            System.out.println("¿Numero par o impar?");
            Scanner sc = new Scanner( System.in );
            System.out.print("Ingrese un numero: ");
            int number = sc.nextInt();
            if (number%2==0){
                System.out.println("El numero es par");
            } else{
                System.out.println("El numero es impar");
            }
        }
}
