import java.util.Scanner;
public class Ejercicio_24 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("---Generador de Acronimos---");
        System.out.println("Ingrese tres palabras para generar un acrónimo de tres letras:");
        String input = lector.nextLine();
        
        String[] palabras = input.split(" ");
        
        if (palabras.length != 3) {
            System.out.println("Debe ingresar exactamente tres palabras.");
        } else {
            String acronimo = generarAcronimo(palabras);
            System.out.println("El acronimo es: " + acronimo);
        }
        
        lector.close();
    }
    
    public static String generarAcronimo(String[] palabras) {
        StringBuilder acronimo = new StringBuilder();
        
        for (String palabra : palabras) {
            if (palabra.length() >= 1) {
                acronimo.append(Character.toUpperCase(palabra.charAt(0)));
            }
        }
        
        return acronimo.toString();
    }
}
