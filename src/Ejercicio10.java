/*Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas*/
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos letras para ver si están en minúsculas: ");
        String first_character = scan.next();
        String second_character = scan.next();
        boolean first_character_lowercase = first_character.equals(first_character.toLowerCase());
        boolean second_character_lowercase = second_character.equals(second_character.toLowerCase());
        if (first_character_lowercase && second_character_lowercase) {
            System.out.println("Ambos caracteres están en minúsculas");
        } else if(first_character_lowercase){
            System.out.println("El primer caracter está en minúsculas");
        } else if (second_character_lowercase){
            System.out.println("El segundo caracter está en minúsculas");
        } else {
            System.out.println("Los caracteres no están en minúsculas");
        }
    }
}