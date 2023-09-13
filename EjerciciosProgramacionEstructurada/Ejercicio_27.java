import java.util.Scanner;
public class Ejercicio_27 {

    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);

        System.out.println("---Calculo de Salario Neto---");
        System.out.println("Ingrese el salario bruto del empleado: ");
        double salarioBruto = lector.nextDouble();
        System.out.println("Ingrese los años de antigüedad del empleado: ");
        int anosAntiguedad = lector.nextInt();

        double porcentajeAntiguedad;

        if (anosAntiguedad == 1) {
            porcentajeAntiguedad = 3.0;
        } else if (anosAntiguedad >= 2 && anosAntiguedad <= 20) {
            porcentajeAntiguedad = (anosAntiguedad * 2 + 1);
        } else if (anosAntiguedad >= 21 && anosAntiguedad <= 30) {
            porcentajeAntiguedad = 50.0;
        } else {
            porcentajeAntiguedad = 60.0;
        }

        double ir;
        if (salarioBruto <= 10000) {
            ir = salarioBruto * 0.1;
        } else if (salarioBruto <= 20000) {
            ir = salarioBruto * 0.15;
        } else {
            ir = salarioBruto * 0.2;
        }

        double salarioNeto = salarioBruto - ir;

        double incrementoAntiguedad = (porcentajeAntiguedad / 100) * salarioBruto;

        salarioNeto += incrementoAntiguedad;

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Incremento por antigüedad: " + incrementoAntiguedad);
        System.out.println("Impuesto sobre la Renta (IR): " + ir);
        System.out.println("Salario Neto: " + salarioNeto);
        lector.close();
    }
}