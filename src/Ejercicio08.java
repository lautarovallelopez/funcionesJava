import java.util.Random;
import java.util.Scanner;

/*Definir la función azar, que devuelva un número entero aleatorio entre 0 y
un número recibido como parámetro, sin incluir a este último. Ejemplo:
Se invoca azar(10) → devuelve un número entre 0 y 9.
* */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        int numeroAzar = azar(numero);
        System.out.println(numeroAzar);
        scanner.close();
    }
    public static int azar(int numero) {
        Random random = new Random();
        return random.nextInt(numero);
    }
}
