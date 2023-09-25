import java.util.Scanner;
/*Programa java para calcular el mayor de dos números enteros que se
introducen por teclado.*/

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("¿Son números iguales?");
        Scanner sc = new Scanner( System.in );
        int bigger;
        System.out.print("Ingrese dos números: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if(number1==number2){
            System.out.println("Los números son iguales");
        } else if(number1>number2){
            bigger = number1;
            System.out.println("El número mayor es " + bigger);
        } else {
            bigger = number2;
            System.out.println("El número mayor es " + bigger);
        }
    }
}
