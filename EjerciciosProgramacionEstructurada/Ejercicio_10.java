import java.util.Scanner;
public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("---Calculadora de Grasa Corporal---");
        System.out.print("Ingrese su sexo (M = Hombre / F = Mujer): ");
        char sexo = lector.next().charAt(0);

        if (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
            System.out.print("Ingrese su peso corporal (en kilogramos): ");
            double pesoCorporal = lector.nextDouble();

            double grasaCorporal = calcularGrasaCorporal(sexo, pesoCorporal);
            double porcentajeGrasaCorporal = (grasaCorporal / pesoCorporal) * 100;

            System.out.println("Grasa corporal: " + grasaCorporal + " kg");
            System.out.println("Porcentaje de grasa corporal: " + porcentajeGrasaCorporal + "%");
        } else {
            System.out.println("Sexo no válido. Use 'M' o 'F'.");
        }

        lector.close();
    }

    public static double calcularGrasaCorporal(char sexo, double pesoCorporal) {
        double grasaCorporal = 0.0;

        if (sexo == 'M' || sexo == 'm') {
            double A1 = (pesoCorporal * 1.082) + 94.42;
            double A2 = obtenerMedida("cintura");
            double B = A1 - (A2 * 4.15);
            grasaCorporal = pesoCorporal - B;
        } else if (sexo == 'F' || sexo == 'f') {
            double A1 = (pesoCorporal * 0.732) + 8.987;
            double A2 = obtenerMedida("muñeca") / 3.140;
            double A3 = obtenerMedida("cintura") * 0.157;
            double A4 = obtenerMedida("cadera") * 0.249;
            double A5 = obtenerMedida("antebrazo") * 0.434;
            double B = A1 + A2 - A3 - A4 + A5;
            grasaCorporal = pesoCorporal - B;
        }
        return grasaCorporal;
    }

    public static double obtenerMedida(String parteDelCuerpo) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la medida de " + parteDelCuerpo + " (en centímetros): ");
        double medida = lector.nextDouble();
        return medida;
    }
}
