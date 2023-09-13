import java.util.Scanner;
public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double saldoCordobas = 0, saldoDolares = 0;

        System.out.println("¡Bienvenido al Cajero Automatico!");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1) Depositar");
            System.out.println("2) Retirar");
            System.out.println("3) Salir");

            int opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione la cuenta para depositar:");
                    System.out.println("a. Cordobas");
                    System.out.println("b. Dolares");

                    char cuentaDeposito = lector.next().charAt(0);

                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = lector.nextDouble();

                    if (cuentaDeposito == 'a') {
                        saldoCordobas += cantidadDeposito;
                        System.out.println("Deposito en cordobas realizado con exito.");
                    } else if (cuentaDeposito == 'b') {
                        saldoDolares += cantidadDeposito;
                        System.out.println("Deposito en dolares realizado con exito.");
                    } else {
                        System.out.println("Opcion no valida.");
                    }
                    break;

                case 2:
                    System.out.println("Seleccione la cuenta para retirar:");
                    System.out.println("a. Cordobas");
                    System.out.println("b. Dolares");

                    char cuentaRetiro = lector.next().charAt(0);

                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = lector.nextDouble();

                    if (cuentaRetiro == 'a') {
                        if (cantidadRetiro <= saldoCordobas) {
                            saldoCordobas -= cantidadRetiro;
                            System.out.println("Retiro en cordobas realizado con exito.");
                        } else {
                            System.out.println("Saldo insuficiente en la cuenta de cordobas.");
                        }
                    } else if (cuentaRetiro == 'b') {
                        if (cantidadRetiro <= saldoDolares) {
                            saldoDolares -= cantidadRetiro;
                            System.out.println("Retiro en dolares realizado con exito.");
                        } else {
                            System.out.println("Saldo insuficiente en la cuenta de dolares.");
                        }
                    } else {
                        System.out.println("Opción no valida.");
                    }
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

            if (continuar) {
                System.out.print("¿Desea realizar otra transacción? (S = Si / N = No): ");
                char respuesta = lector.next().charAt(0);
                continuar = (respuesta == 'S' || respuesta == 's');
            }
        }

        System.out.print("¿Desea imprimir el saldo actual en ambas cuentas? (S = Si / N = No): ");
        char imprimirSaldo = lector.next().charAt(0);

        if (imprimirSaldo == 'S' || imprimirSaldo == 's') {
            System.out.println("Saldo en Córdobas: C$" + saldoCordobas);
            System.out.println("Saldo en Dólares: $" + saldoDolares);
        }

        System.out.println("-- Gracias por utilizar el Cajero Automático --");
        lector.close();
    }
}
