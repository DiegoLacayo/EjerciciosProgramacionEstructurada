import java.util.Scanner;
public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); 
        double salarioBase = 200.0, comisionPorcentaje = 0.09, totalVentas = 0;

        System.out.println("---Calculadora de Ingresos de Vendedor---");
        System.out.println("Ingrese el numero de articulos vendidos por el vendedor: ");
        int numArticulos = lector.nextInt();

        for (int i = 1; i <= numArticulos; i++) {
            System.out.println("Ingrese el valor del articulo " + i + " en cordobas: ");
            double valorArticulo = lector.nextDouble();
            totalVentas += valorArticulo;
        }

        double comision = totalVentas * comisionPorcentaje;
        double ingresosTotales = salarioBase + comision;

        System.out.println("Ingresos del Vendedor: C$" + ingresosTotales);
        lector.close();
    }
}
