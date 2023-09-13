import java.util.Scanner;
public class Ejercicio_31 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo grande para factorizar: ");
        long numero = lector.nextLong();

        if (numero <= 0) {
            System.out.println("El numero ingresado no es un entero positivo.");
        } else {
            System.out.println("Factores primos de " + numero + ":");

            for (long i = 2; i <= numero; i++) {
                while (numero % i == 0) {
                    System.out.print(i + " ");
                    numero = numero / i;
                }
            }
            System.out.println();
        }
        lector.close();
    }
}