/*Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).*/
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese un carácter por teclado para ver si es un dígito: ");
            String character = scan.next();
            boolean is_digit = false;
            for(int i = 1; i <= 9; i +=1){
                String iString= Integer.toString(i);
                if (character.equals(iString)){
                    is_digit = true;
                    break;
                }
            }
            if (is_digit){
                System.out.println("El caracter ingresado es un dígito");
            } else {
                System.out.println("El caracter ingresado no es un dígito");
            }

    }
}
