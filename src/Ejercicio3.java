import java.util.Scanner;
/*Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.*/

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("Letra mayúscula");
        Scanner sc = new Scanner( System.in );
        System.out.print("Ingrese un caracter: ");
        String letter = sc.next();
        //capital_letter = letter.toUpperCase();
        if (letter.equals(letter.toUpperCase())){
            System.out.println("Esta en mayúsculas");
        }else{
            System.out.println("No está en mayúsculas");
        }
    }
}
