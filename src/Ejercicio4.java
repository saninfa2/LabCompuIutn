import java.util.Scanner;
/*Programa java que comprueba si dos números enteros son iguales o no.
Los números a comprobar se introducen por teclado.*/

public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println("¿Son números iguales?");
        Scanner sc = new Scanner( System.in );
        System.out.print("Ingrese dos números: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 == number2){
            System.out.println("Los números son iguales");
        } else{
            System.out.println("No son números iguales");
        }
    }
}
