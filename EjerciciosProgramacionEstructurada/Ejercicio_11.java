import java.util.Scanner;
public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("---Calculadora de Prestamo---");
        System.out.println("Ingrese el monto del prestamo: ");
        double montoPrestamo = lector.nextDouble();
        System.out.println("Ingrese la tasa de interés anual (Porcentaje): ");
        double tasaInteresAnual = lector.nextDouble() / 100;
        System.out.println("Ingrese el pago mensual: ");
        double pagoMensual = lector.nextDouble();

        double saldoPrestamo = montoPrestamo;
        int meses = 0;

        while (saldoPrestamo > 0) {
            double interesMensual = saldoPrestamo * (tasaInteresAnual / 12);
            double pagoAlCapital = pagoMensual - interesMensual;

            if (pagoMensual <= interesMensual) {
                System.out.println("El pago mensual es insuficiente para pagar el prestamo.");
                break;
            }

            saldoPrestamo -= pagoAlCapital;
            meses++;

            if (saldoPrestamo < 0) {
                saldoPrestamo = 0;
            }
        }
        System.out.println("Numero de meses necesarios para pagar el prestamo: " + meses);
        lector.close();
    }
}