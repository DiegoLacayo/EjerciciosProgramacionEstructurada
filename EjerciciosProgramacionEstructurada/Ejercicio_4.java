import java.util.Scanner;
public class Ejercicio_4 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("--Calculo de raices de una ecuacion cuadrática => (ax^2 + bx + c = 0)--");
        System.out.println("Ingrese el valor de a: ");
        double a = lector.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        double b = lector.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        double c = lector.nextDouble();

        double Discriminante = b * b - 4 * a * c;

        if (Discriminante > 0) {
            double raizP = (-b + Math.sqrt(Discriminante)) / (2 * a);
            double raizN = (-b - Math.sqrt(Discriminante)) / (2 * a);
            System.out.println("Las raices son reales y diferentes:");
            System.out.println("Raiz Positiva = " + raizP);
            System.out.println("Raiz Negativa = " + raizN);
        } else {
            if (Discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuacion tiene una unica raiz real (repetida):");
            System.out.println("Raiz = " + raiz);
        } else {
            double Preal = -b / (2 * a);
            double Pimaginaria = Math.sqrt(-Discriminante) / (2 * a);
            System.out.println("Las raices son complejas:");
            System.out.println("Raiz Positiva = " + Preal + " + " + Pimaginaria + "i");
            System.out.println("Raiz Negativa = " + Preal + " - " + Pimaginaria + "i");
           }
        }
        lector.close();
    }
}