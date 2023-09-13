import java.util.Scanner;
public class Ejercicio_19 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double CUOTA_MINIMA = 2.00, TARIFA_HORA_NORMAL = 0.50, TARIFA_MAXIMA_POR_DIA = 10.00;
        int MAX_HORAS = 3;

        double totalRecibos = 0.0;

        System.out.println("---Calculadora de Cargos por Estacionamiento---");

        while (true) {
            System.out.println("Ingrese las horas de estacionamiento (o -1 para terminar): ");
            int horasEstacionamiento = lector.nextInt();

            if (horasEstacionamiento == -1) {
                break;
            }

            double cargo = calcularCargo(horasEstacionamiento, CUOTA_MINIMA, TARIFA_HORA_NORMAL, MAX_HORAS, TARIFA_MAXIMA_POR_DIA);
            totalRecibos += cargo;

            System.out.println("Cargo para este cliente: C$" + cargo);
        }

        System.out.println("Total corriente de los recibos de ayer: C$" + totalRecibos);

        lector.close();
    }

    public static double calcularCargo(int horas, double cuotaMinima, double tarifaHoraNormal, int maxHoras, double tarifaMaximaPorDia) {
        if (horas <= maxHoras) {
            return cuotaMinima;
        } else if (horas <= 24) {
            int horasExcedidas = horas - maxHoras;
            double cargoHorasExcedidas = horasExcedidas * tarifaHoraNormal;
            return cuotaMinima + cargoHorasExcedidas;
        } else {
            return tarifaMaximaPorDia;
        }
    }
}