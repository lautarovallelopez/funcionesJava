import java.util.Scanner;

/*Crea una función cantidadDeDivisores, que reciba un número entero y
devuelva la cantidad de divisores (por ejemplo, para el número 16, sus
divisores son 1, 2, 4, 8, 16, por lo que la respuesta debería ser 5). Ayuda:
un número es múltiplo de otro cuando al dividir los números obtengo resto
0 (cero).
* */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        int cantidadDivisores = cantidadDeDivisores(numero);
        System.out.println("El numero " + numero + " tiene " + cantidadDivisores + " divisores");
        scanner.close();
    }
    public static int cantidadDeDivisores(int numero) {
        int cantidadDivisores = 0;
        for(int i = 1; i <= numero; i++) {
            if (esDivisor(numero, i)) {
                cantidadDivisores++;
            }
        }
        return cantidadDivisores;
    }
    public static boolean esDivisor(int numero, int divisor) {
        return numero % divisor == 0;
    }
}
