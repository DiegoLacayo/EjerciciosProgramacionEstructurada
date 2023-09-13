import java.util.Scanner;
import java.util.Random;
public class Ejercicio_26 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--- Eliza System ---");
        System.out.println("Hola, soy Eliza. ¿En qué puedo ayudarte hoy? (Escribe 'Adios' para salir)");

        while (true) {
            String respuesta = lector.nextLine().toLowerCase();

            if (respuesta.equals("adios")) {
                System.out.println("Adios. Espero que hayas tenido una buena conversacion.");
                break;
            }

            String[] palabras = respuesta.split(" ");
            boolean palabraMiEncontrada = false;

            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].equals("mi")) {
                    palabraMiEncontrada = true;
                    if (i < palabras.length - 1) {
                        String sustantivo = palabras[i + 1];
                        System.out.println("Cuentame mas sobre tu " + sustantivo + ".");
                    } else {
                        System.out.println("Cuentame mas sobre ti.");
                    }
                    break;
                }
            }

            if (!palabraMiEncontrada) {
                if (respuesta.contains("amor") || respuesta.contains("odio")) {
                    System.out.println("Parece que tienes fuertes sentimientos al respecto.");
                } else {
                    int randomResponse = random.nextInt(3);
                    switch (randomResponse) {
                        case 0:
                            System.out.println("Continua.");
                            break;
                        case 1:
                            System.out.println("Dime mas.");
                            break;
                        case 2:
                            System.out.println("Continua.");
                            break;
                    }
                }
            }
        }

        lector.close();
    }
}
