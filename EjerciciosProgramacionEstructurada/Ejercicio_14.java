import java.util.Scanner;
public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); 
        int totalKilometros = 0, totalLitros = 0;

        System.out.println("---Registro de Kilometraje y Consumo de Combustible---");
        System.out.println("Ingrese los datos de cada viaje (kilómetros y litros consumidos).");
        System.out.println("Para finalizar, ingrese 0 en ambos campos.");

        int viaje = 1;
        while (true) {
            System.out.println("Viaje " + viaje + ": ");
            int kilometros = lector.nextInt();
            int litros = lector.nextInt();

            if (kilometros == 0 && litros == 0) {
                break; 
            }

            double kilometrosPorLitro = (double)kilometros / litros;
            System.out.println("Kilómetros por litro en el viaje " + viaje + ": " + kilometrosPorLitro);

            totalKilometros += kilometros;
            totalLitros += litros;

            viaje++;
        }

        if (viaje > 1) {
            double kilometrosPorLitroTotal = (double)totalKilometros / totalLitros;
            System.out.println("Kilómetros por litro totales: " + kilometrosPorLitroTotal);
        } else {
            System.out.println("--No se registraron viajes--");
        }
        lector.close();
    }
}

