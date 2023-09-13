import java.util.Random;
import java.util.Scanner;
public class Ejercicio_28 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--- Juego de Loteria ----");
        int premio = 0;

        int numero1 = random.nextInt(10);
        int numero2 = random.nextInt(10);
        int numero3 = random.nextInt(10);

        System.out.println("¡Bienvenido al juego de lotería! Adivina tres números entre 0 y 9.");

        for (int intentos = 1; intentos <= 3; intentos++) {
            System.out.print("Intento #" + intentos + ": ");
            int suposicion1 = lector.nextInt();
            int suposicion2 = lector.nextInt();
            int suposicion3 = lector.nextInt();

            if (suposicion1 == numero1 || suposicion1 == numero2 || suposicion1 == numero3) {
                premio += 100;
            }

            if (suposicion2 == numero1 || suposicion2 == numero2 || suposicion2 == numero3) {
                premio += 100;
            }

            if (suposicion3 == numero1 || suposicion3 == numero2 || suposicion3 == numero3) {
                premio += 100;
            }

            if (suposicion1 == numero1 && suposicion2 == numero2 && suposicion3 == numero3) {
                premio = 1000000;
                break;
            }
        }

        System.out.println("Los números generados aleatoriamente fueron: " + numero1 + ", " + numero2 + ", " + numero3);
        System.out.println("Premio ganado: C$" + premio);

        lector.close();
    }
}
