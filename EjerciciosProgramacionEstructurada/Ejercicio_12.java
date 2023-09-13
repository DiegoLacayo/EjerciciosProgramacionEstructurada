import java.util.Scanner;
public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);      
        double cargoProcesamiento = 0, cargoBasico = 0, cargoPremium = 0;

        System.out.println("--Calculadora de Factura del Cable--");
        System.out.println("Ingrese el numero de cuenta del cliente: ");
        int numeroCuenta = lector.nextInt();
        System.out.println("Ingrese el codigo de cliente (R = Residencial, N = Negocio): ");
        char codigoCliente = lector.next().charAt(0);

        if (codigoCliente == 'R' || codigoCliente == 'r') {
            cargoProcesamiento = 4.50;
            cargoBasico = 20.50;
            System.out.print("Ingrese el numero de canales Premium: ");
            int numCanalesPremium = lector.nextInt();
            cargoPremium = 7.50 * numCanalesPremium;
        } else if (codigoCliente == 'N' || codigoCliente == 'n') {
            cargoProcesamiento = 15.00;
            System.out.print("Ingrese el numero de conexiones de servicio basico: ");
            int numConexionesBasicas = lector.nextInt();
            if (numConexionesBasicas <= 10) {
                cargoBasico = 75.00;
            } else {
                cargoBasico = 75.00 + (numConexionesBasicas - 10) * 5.00;
            }
            System.out.print("Ingrese el numero de canales Premium: ");
            int numCanalesPremium = lector.nextInt();
            cargoPremium = 50.00 * numCanalesPremium;
        } else {
            System.out.println("--Codigo de cliente no valido--");
            System.exit(0);
        }

        double totalFactura = cargoProcesamiento + cargoBasico + cargoPremium;

        System.out.println("\nNúmero de cuenta: " + numeroCuenta);
        System.out.println("Cargo por procesamiento de factura: " + cargoProcesamiento);
        System.out.println("Cargo por servicio básico: " + cargoBasico);
        System.out.println("Cargo por canales Premium: " + cargoPremium);
        System.out.println("Total de la factura: " + totalFactura);
        lector.close();
    }
}
