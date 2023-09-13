import java.util.Scanner;
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int Sdigitos = 0, Ndigitos = 0;

        System.out.println("---Separacion y suma de digitos de un numero entero---");
        System.out.println("Ingresa el numero entero: ");
        int numero = lector.nextInt();

        if (numero < 0) {
            numero = -numero;
        }

        int temp = numero;
        while (temp > 0) {
            temp /= 10;
            Ndigitos++;
        }

        int[] digitos = new int[Ndigitos]; 

        int index = Ndigitos - 1;
        while (numero > 0) {
            int digito = numero % 10; 
            digitos[index] = digito; 
            Sdigitos += digito; 
            numero /= 10; 
            index--;
        }

        System.out.println("Dígitos individuales en orden: ");
        for (int i = 0; i < Ndigitos; i++) {
            System.out.print(digitos[i] + " ");
        }

        System.out.println("\nSuma de los dígitos: " + Sdigitos);
        lector.close();
    }
}
