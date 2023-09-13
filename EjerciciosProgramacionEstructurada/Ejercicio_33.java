import java.util.Scanner;

public class Ejercicio_33 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("--- Conversor de Sistemas Numericos ---");
        System.out.println("Por favor, seleccione el sistema numérico de origen:");
        System.out.println("1) Binario");
        System.out.println("2) Octal");
        System.out.println("3) Decimal");
        System.out.println("4) Hexadecimal");
        System.out.println("5) Salir del menu");

        int sistemaOrigen = lector.nextInt();
        lector.nextLine(); 

        System.out.println("Por favor, seleccione el sistema numerico de destino:");
        int sistemaDestino = lector.nextInt();
        lector.nextLine(); 

        System.out.println("Ingrese el numero a convertir:");
        String numero = lector.nextLine();

        String resultado = convertirNumero(numero, sistemaOrigen, sistemaDestino);

        System.out.println("Resultado: " + resultado);

       lector.close();
    }

    public static String convertirNumero(String numero, int sistemaOrigen, int sistemaDestino) {
        try {
            switch (sistemaOrigen) {
                case 1: 
                    if (sistemaDestino == 2) {
                        return Integer.toOctalString(Integer.parseInt(numero, 2));
                    } else if (sistemaDestino == 3) { 
                        return Integer.toString(Integer.parseInt(numero, 2));
                    } else if (sistemaDestino == 4) { 
                        return Integer.toHexString(Integer.parseInt(numero, 2)).toUpperCase();
                    }
                    break;
                case 2: 
                    if (sistemaDestino == 1) { 
                        return Integer.toBinaryString(Integer.parseInt(numero, 8));
                    } else if (sistemaDestino == 3) { 
                        return Integer.toString(Integer.parseInt(numero, 8));
                    } else if (sistemaDestino == 4) {
                        return Integer.toHexString(Integer.parseInt(numero, 8)).toUpperCase();
                    }
                    break;
                case 3: 
                    if (sistemaDestino == 1) { 
                        return Integer.toBinaryString(Integer.parseInt(numero));
                    } else if (sistemaDestino == 2) { 
                        return Integer.toOctalString(Integer.parseInt(numero));
                    } else if (sistemaDestino == 4) { 
                        return Integer.toHexString(Integer.parseInt(numero)).toUpperCase();
                    }
                    break;
                case 4: 
                    if (sistemaDestino == 1) { 
                        return Integer.toBinaryString(Integer.parseInt(numero, 16));
                    } else if (sistemaDestino == 2) { 
                        return Integer.toOctalString(Integer.parseInt(numero, 16));
                    } else if (sistemaDestino == 3) { 
                        return Integer.toString(Integer.parseInt(numero, 16));
                    }
                    break;
                case 5: 
                    System.out.println("-- Usted a salido correctamente del sistema --");
                default:
                    return "Sistema numerico de origen no valido";
            }
        } catch (NumberFormatException e) {
            return "Numero no válido para el sistema numerico de origen";
        }
        return "Conversion no compatible";
    }
}
