import java.util.Scanner;
/*
* Codifique un programa en Java que permita ingresar dos números. Se le
preguntará al usuario si dichos números quiere sumarlos o restarlos. Si el
usuario ingresa ‘S’ dichos números se sumarán; si ingresa ‘R’, se restará.
La suma y la resta de dichos números debe realizarse con dos funciones.
En el caso de la suma, dicho método recibirá como parámetros los dos
números ingresados y devolverá la suma de los dos números. En el caso
de la resta se procederá de la misma manera, pero el método devolverá
la resta de los mismos.

* */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        char operacion;
        System.out.print("Ingrese numero 1: ");
        numero1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese numero 2: ");
        numero2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese operacion(S | R): ");
        operacion = scanner.nextLine().toUpperCase().charAt(0);
        int resultado = 0;
        switch (operacion) {
            case 'S':
                resultado = sumar(numero1, numero2);
                break;
            case 'R':
                resultado = restar(numero1, numero2);
                break;
            default:
                break;
        }
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
    public static int restar(int num1, int num2) {
        return  num1 - num2;
    }
}
