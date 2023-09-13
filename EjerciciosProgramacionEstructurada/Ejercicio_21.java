import java.util.Scanner;
public class Ejercicio_21 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("---Generador de Calendario Bisiesto---");
        System.out.print("Ingrese un año en el rango de 1994 a 1999: ");
        int año = lector.nextInt();

        if (año < 1994 || año > 1999) {
            System.out.println("Año fuera de rango.");
            return;
        }

        generarCalendario(año);

        lector.close();
    }

    public static void generarCalendario(int año) {
        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("\nMes " + mes + " del año " + año);
            System.out.println("Dom  Lun  Mar  Mié  Jue  Vie  Sáb");

            int Diasenmes = obtenerDiasEnMes(año, mes);
            int Diadesemana = obtenerDiaDeLaSemana(año, mes, 1);

            for (int i = 0; i < Diadesemana; i++) {
                System.out.print("     ");
            }

            for (int dia = 1; dia <= Diasenmes; dia++) {
                System.out.printf("%3d  ", dia);
                if (Diadesemana == 6) {
                    System.out.println();
                    Diadesemana = 0;
                } else {
                    Diadesemana++;
                }
            }

            System.out.println();
        }
    }

    public static int obtenerDiasEnMes(int año, int mes) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            daysInMonth[2] = 29; 
        }

        return daysInMonth[mes];
    }

    public static int obtenerDiaDeLaSemana(int año, int mes, int dia) {
        if (mes < 3) {
            mes += 12;
            año--;
        }
        int h = (dia + 2 * mes + 3 * (mes + 1) / 5 + año + año / 4 - año / 100 + año / 400) % 7;
        return h;
    }
}