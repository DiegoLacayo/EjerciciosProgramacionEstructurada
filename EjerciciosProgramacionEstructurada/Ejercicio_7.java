import java.util.Scanner;
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double Ctotal = 0.0;

        System.out.println("--Compañia de telefonia celular--");
        System.out.println("Ingrese el numero de cuenta: ");
        int Ncuenta = lector.nextInt();
        System.out.println("Ingrese el codigo de servicio (R = Regular / P = Premium): ");
        char Cservicio = lector.next().charAt(0);
        System.out.println("Ingrese la cantidad de minutos utilizados: ");
        int Mutilizados = lector.nextInt();

        if (Cservicio == 'R' || Cservicio == 'r') {
            if (Mutilizados > 50) {
                Ctotal = 10.0 + (Mutilizados - 50) * 0.20;
            } else {
                Ctotal = 10.0;
            }
        } else if (Cservicio == 'P' || Cservicio == 'p') {
            System.out.println("Ingrese la cantidad de minutos utilizados durante el dia: ");
            int Mdia = lector.nextInt();
            
            System.out.println("Ingrese la cantidad de minutos utilizados durante la noche: ");
            int Mnoche = lector.nextInt();
            
            if (Mdia > 75) {
                Ctotal += (Mdia - 75) * 0.10;
            }
            
            if (Mnoche > 100) {
                Ctotal += (Mnoche - 100) * 0.05;
            }
            
            Ctotal += 25.0;
        } else {
            System.out.println("Codigo de servicio no valido.");
            lector.close();
            return;
        }

        System.out.println("Numero de cuenta: " + Ncuenta);
        System.out.println("Tipo de servicio: " + (Cservicio == 'R' || Cservicio == 'r' ? "Regular" : "Premium"));
        System.out.println("Minutos utilizados: " + Mutilizados);
        System.out.println("Cantidad a pagar (Dolares): " + Ctotal);
        lector.close();
    }
}
