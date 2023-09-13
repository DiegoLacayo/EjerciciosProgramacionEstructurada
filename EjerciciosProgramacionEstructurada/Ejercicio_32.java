import java.util.Scanner;
public class Ejercicio_32 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // este ejercicio se repite con el ejercicio 9 asi que solo copie y pegue el mismo codigo.
        System.out.println("--Numeros primos--");
        System.out.println("Ingrese un numero entero Menor: ");
        int Menor = lector.nextInt();
        System.out.println("Ingrese un numero entero Mayor: ");
        int Mayor = lector.nextInt();

        if (Menor >= Mayor) {
            System.out.println("El primer numero debe ser menor que el segundo número.");
            lector.close();
            return;
        }

        System.out.println("Numeros impares entre " + Menor + " y " + Mayor + ":");
        int Spares = 0;
        int SCuadradosImpares = 0;
        boolean Nperfectos = false;

        for (int i = Menor; i <= Mayor; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                SCuadradosImpares += i * i;
            } else {
                Spares+= i;
            }

            int sumaDivisores = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumaDivisores += j;
                }
            }

            if (sumaDivisores == i) {
                Nperfectos = true;
                System.out.print("\nNumero perfecto: " + i);
            }
        }

        System.out.println("\nSuma de los numeros pares: " + Spares);
        System.out.println("Suma de los cuadrados de los numeros impares: " + SCuadradosImpares);

        System.out.println("Números primos entre " + Menor + " y " + Mayor + ":");
        for (int i = Menor; i <= Mayor; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        if (!Nperfectos) {
            System.out.println("\nNo hay numeros perfectos en el rango.");
        }

        lector.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
