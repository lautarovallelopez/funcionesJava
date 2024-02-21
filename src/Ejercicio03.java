import java.util.Scanner;

/*
*  Crea una función esPar que devuelva el valor lógico true o false según
si el número que se indique como parámetro es par o no lo es.
* */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        if (esPar(numero)) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " no es par.");
        }

        scanner.close();
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
