import java.util.Scanner;
public class Ejercicio_8 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double Cmarco;

        System.out.println("---Tienda de fotos---");
        System.out.println("Ingrese la longitud de la fotografia en pulgadas: ");
        double Longitud = lector.nextDouble();
        System.out.println("Ingrese el ancho de la fotografia en pulgadas: ");
        double Ancho = lector.nextDouble();
        System.out.println("Tipo de marco (R = regular / L = lujoso): ");
        char Tmarco = lector.next().charAt(0);
        System.out.println("¿Desea agregar coronas? (S = Si / N = No): ");
        char agregarCoronas = lector.next().charAt(0);

        double Cpintura = 0.10 * (Longitud * 2 + Ancho * 2);
        double Ccarton = 0.02 * (Longitud * Ancho);
        double Cvidrio = 0.07 * (Longitud * Ancho);
        double Ccoronas = 0.35;

        if (Tmarco == 'R' || Tmarco == 'r') {
            Cmarco  = 0.15 * (Longitud * 2 + Ancho * 2);
        } else if (Tmarco == 'L' || Tmarco == 'l') {
            Cmarco = 0.25 * (Longitud * 2 + Ancho * 2);
        } else {
            System.out.println("-- Tipo de marco no válido --");
            lector.close();
            return;
        }

        if (agregarCoronas == 'S' || agregarCoronas == 's') {
            System.out.println("Ingrese el numero de coronas: ");
            int numCoronas = lector.nextInt();
            Ccoronas *= numCoronas;
        }

        double costoTotal = Cmarco + Cpintura + Ccarton + Cvidrio + Ccoronas;

        System.out.println("Costo del marco (Dolares): " + Cmarco);
        System.out.println("Costo de pintura (Dolares): " + Cpintura);
        System.out.println("Costo de cartón (Dolares): " + Ccarton);
        System.out.println("Costo de vidrio (Dolares): " + Cvidrio);
        System.out.println("Costo de coronas (Dolares): " + Ccoronas);
        System.out.println("Costo total (Dolares): " + costoTotal);
        lector.close();
    }
}
