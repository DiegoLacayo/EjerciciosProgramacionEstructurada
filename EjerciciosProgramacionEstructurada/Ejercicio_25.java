import java.util.Scanner;
public class Ejercicio_25{

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("---Contraseña---");
        while (true) {
            System.out.println("Ingrese su contraseña (debe tener entre 6 y 10 caracteres, al menos una letra y un dígito):");
            String contraseña = lector.nextLine();

            if (validarContraseña(contraseña)) {
                System.out.println("Contraseña válida. Ingrese la contraseña nuevamente para confirmar:");
                String confirmacion = lector.nextLine();

                if (contraseña.equals(confirmacion)) {
                    System.out.println("Contraseña confirmada. ¡Bienvenido!");
                    break;
                } else {
                    System.out.println("Las contraseñas no coinciden. Inténtelo nuevamente.");
                }
            } else {
                System.out.println("La contraseña no cumple con los requisitos. Inténtelo nuevamente.");
            }
        }

        lector.close();
    }

    public static boolean validarContraseña(String contraseña) {
        if (contraseña.length() < 6 || contraseña.length() > 10) {
            return false;
        }

        boolean tieneLetra = false;
        boolean tieneDigito = false;

        for (char c : contraseña.toCharArray()) {
            if (Character.isLetter(c)) {
                tieneLetra = true;
            } else if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }

        return (tieneLetra && tieneDigito);
    }
}
