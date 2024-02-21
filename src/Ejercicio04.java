import java.util.Scanner;
/*Crea una función cubo, que reciba un número y lo devuelva elevado al
cubo.
* */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        int cubo = elevarCubo(numero);
        System.out.println("El cubo de " + numero + " es " + cubo);
        scanner.close();
    }
    public static int elevarCubo(int numero) {
        return numero * numero * numero;
    }
}
