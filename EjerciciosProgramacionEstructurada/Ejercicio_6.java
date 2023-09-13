import java.util.Scanner;
public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("---Servicio de Banco---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cliente " + i);

            System.out.println("Ingrese su numero de cuenta: ");
            int Ncuenta = lector.nextInt();
            System.out.println("Ingrese el tipo de cuenta (A = Ahorros, C = Cheques): ");
            char Tcuenta = lector.next().charAt(0);
            System.out.println("Ingrese su saldo minimo requerido (Dolares): ");
            double Sminimo = lector.nextDouble();
            System.out.println("Ingrese su saldo actual (Dolares): ");
            double Sactual = lector.nextDouble();

            double Snuevo = 0.0;

            if (Tcuenta == 'A' || Tcuenta == 'a') {
                if (Sactual < Sminimo) {
                    Snuevo = Sactual - 10;
                } else {
                    Snuevo = Sactual + (Sactual * 0.04); 
                }
            } else if (Tcuenta == 'C' || Tcuenta == 'c') {
                if (Sactual < Sminimo) {
                    Snuevo = Sactual - 25; 
                } else if (Sactual <= Sminimo + 5000) {
                    Snuevo = Sactual + (Sactual * 0.03); 
                } else {
                    Snuevo = Sactual + (Sactual * 0.05); 
                }
            } else {
                System.out.println("-- Tipo de cuenta no valida --");
            }
            System.out.println("Numero de cuenta: " + Ncuenta);
            System.out.println("Tipo de cuenta: " + Tcuenta);
            System.out.println("Saldo actual: U$" + Sactual);
            System.out.println("Saldo nuevo: U$" + Snuevo);
        }
        lector.close();
    }
}
