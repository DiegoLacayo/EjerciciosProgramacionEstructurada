import java.util.Scanner;
public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("---Verificador de Limite de Credito---");
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = lector.nextInt();
        System.out.print("Ingrese el saldo al inicio del mes: ");
        int saldoInicial = lector.nextInt();
        System.out.print("Ingrese el total de artículos cargados: ");
        int cargos = lector.nextInt();
        System.out.print("Ingrese el total de créditos aplicados: ");
        int creditos = lector.nextInt();
        System.out.print("Ingrese el límite de crédito permitido: ");
        int limiteCredito = lector.nextInt();

        int nuevoSaldo = saldoInicial + cargos - creditos;

        System.out.println("Su numero de cuenta es: " + numeroCuenta);
        System.out.println("Nuevo saldo: " + nuevoSaldo);

        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedió el límite de su crédito.");
        }

        lector.close();
    }
}
