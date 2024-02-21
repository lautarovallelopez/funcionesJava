import java.util.Scanner;

/*Crea una función mayorDeTres, que reciba tres números enteros y
devuelva el valor del mayor de ellos. Por ejemplo, para los números 5, 7
y 5, devolvería el valor 7.
* */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese numero 1: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.print("ingrese numero 2: ");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.print("ingrese numero 3: ");
        int numero3 = Integer.parseInt(scanner.nextLine());
        int mayor = mayorDeTres(numero1, numero2, numero3);
        System.out.println("el mayor de los tres es: " + mayor);
        scanner.close();
    }
    public static int mayorDeTres(int num1, int num2, int num3) {
        int mayor = Math.max(num1, num2);
        mayor = Math.max(mayor, num3);
        return mayor;
    }
}
