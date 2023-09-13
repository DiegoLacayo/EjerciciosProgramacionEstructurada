import java.util.Scanner;
public class Ejercicio_15  {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numEmpleados = 3;

        System.out.println("---Calculadora de Sueldo Bruto---");
        for (int i = 1; i <= numEmpleados; i++) {
            System.out.println("\nEmpleado " + i);

            System.out.print("Ingrese el numero de horas trabajadas: ");
            int horasTrabajadas = lector.nextInt();
            System.out.print("Ingrese la tarifa por hora en córdobas: ");
            double tarifaPorHora = lector.nextDouble();

            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHora);
            System.out.println("Sueldo Bruto del Empleado " + i + ": C$" + sueldoBruto);
        }

        lector.close();
    }

    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaPorHora) {
        int horasNormales = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);

        double sueldoBruto = (horasNormales * tarifaPorHora) + (horasExtras * 1.5 * tarifaPorHora);
        return sueldoBruto;
    }
}
