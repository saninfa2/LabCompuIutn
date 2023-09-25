/*Programa que lea dos números por teclado y muestre el resultado
de la división del primer número por el segundo. Se debe comprobar
que el divisor no puede ser cero.*/

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("División");
        Scanner sc = new Scanner( System.in );
        System.out.print("Ingrese dos números: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number2 == 0){
            System.out.println("No es posible dividir por 0 ");
        } else{
            System.out.println(number1 + "/" + number2 + "=" + number1/number2);
        }
    }
}
