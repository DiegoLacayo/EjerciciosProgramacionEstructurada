import java.util.Random;
import java.util.Scanner;
public class Ejercicio_22 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        
        do {
            int numAdivinar = random.nextInt(50) + 1;
            int intentos = 0;
            boolean adivinado = false;
            
            System.out.println("--- Juego de Adivina el Numero ---");
            System.out.println("Adivina un número entre 1 y 50.");
            
            while (intentos < 3) {
                System.out.print("Intento #" + (intentos + 1) + ": ");
                int intento = lector.nextInt();
                
                if (intento < 1 || intento > 50) {
                    System.out.println("El numero debe estar entre 1 y 50.");
                } else if (intento < numAdivinar) {
                    System.out.println("-- Muy bajo. ¡Intente de nuevo! --");
                    intentos++;
                } else if (intento > numAdivinar) {
                    System.out.println("-- Muy alto. ¡Intente de nuevo! --");
                    intentos++;
                } else {
                    System.out.println("¡Felicidades! ¡Adivinaste el numero!");
                    adivinado = true;
                    break;
                }
            }
            
            if (!adivinado) {
                System.out.println("Se acabaron los intentos. El número correcto era " + numAdivinar);
            }
            
            System.out.print("¿Desea jugar otra vez? (Sí/No): ");
            String respuesta = lector.next();
            if (!respuesta.equalsIgnoreCase("Sí")) {
                break;
            }
            
        } while (true);
        
        System.out.println("-- Gracias por jugar. ¡Hasta luego! --");
        lector.close();
    }
}