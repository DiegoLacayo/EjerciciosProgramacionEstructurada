import java.util.Scanner;
public class Ejercicio_29 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("--- Las Mascotas ---");
        System.out.println("¡Bienvenido a la recomendación de mascotas!");
        System.out.println("Por favor, indique donde vive:");
        System.out.println("1) Apartamento");
        System.out.println("2) Casa");
        System.out.println("3) Dormitorio");

        int tipoVivienda = lector.nextInt();

        System.out.println("Ingrese la cantidad de horas que pasa en casa durante el dia promedio:");
        int horasEnCasa = lector.nextInt();

        String recomendacion = recomendarMascota(tipoVivienda, horasEnCasa);

        System.out.println("Basado en su estilo de vida, le recomendamos tener un(a): " + recomendacion);

        lector.close();
    }

    public static String recomendarMascota(int tipoVivienda, int horasEnCasa) {
        if (tipoVivienda == 1) { 
            if (horasEnCasa >= 10) {
                return "Gato";
            } else {
                return "Hamster";
            }
        } else if (tipoVivienda == 2) { 
            if (horasEnCasa >= 18) {
                return "Cerdo barrigón";
            } else if (horasEnCasa >= 10) {
                return "Perro";
            } else {
                return "Serpiente";
            }
        } else if (tipoVivienda == 3) { 
            if (horasEnCasa >= 6) {
                return "Pez";
            } else {
                return "Granja de hormigas";
            }
        } else {
            return "No se pudo recomendar una mascota debido a la informacion proporcionada.";
        }
    }
}
