import java.util.Scanner;
public class Ejercicio_18 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("--Dibujo de Figuras Geométricas--");
        System.out.println("Seleccione una figura para dibujar:");
        System.out.println("1) Triángulo Rectángulo");
        System.out.println("2) Cuadrado");
        System.out.println("3) Rectángulo");
        System.out.println("4) Paralelogramo");
        System.out.println("5) Rombo");
        System.out.println("6) Círculo");
        System.out.println("7) Trapecio");
        System.out.println("8) Pentágono");
        System.out.println("9) Elipse");
        System.out.println("10) salir");
        System.out.print("Ingrese el número de la figura deseada: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la altura del triángulo rectángulo: ");
                int altura = lector.nextInt();

                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                int lado = lector.nextInt();

                for (int i = 1; i <= lado; i++) {
                    for (int j = 1; j <= lado; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Ingrese el ancho del rectángulo: ");
                int ancho = lector.nextInt();
                System.out.print("Ingrese el alto del rectángulo: ");
                int alto = lector.nextInt();

                for (int i = 1; i <= alto; i++) {
                    for (int j = 1; j <= ancho; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.print("Ingrese la altura del paralelogramo: ");
                altura = lector.nextInt();
                System.out.print("Ingrese la base del paralelogramo: ");
                int base = lector.nextInt();

                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= base; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.print("Ingrese la altura del rombo: ");
                altura = lector.nextInt();

                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= altura - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = altura - 1; i >= 1; i--) {
                    for (int j = 1; j <= altura - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                System.out.print("Ingrese el radio del círculo: ");
                int radio = lector.nextInt();

                for (int i = -radio; i <= radio; i++) {
                    for (int j = -radio; j <= radio; j++) {
                        if (i * i + j * j <= radio * radio) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 7:
                        System.out.print("Ingrese la altura del trapecio: ");
                altura = lector.nextInt();
                System.out.print("Ingrese la base mayor del trapecio: ");
                int baseMayor = lector.nextInt();
                System.out.print("Ingrese la base menor del trapecio: ");
                int baseMenor = lector.nextInt();

                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= (baseMayor - baseMenor) / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= baseMenor + 2 * (i - 1); j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 8:
                System.out.println("Dibujo de Pentágono");
                System.out.print("Ingrese el tamaño del lado del pentágono: ");
                int tamanoLado = lector.nextInt();

                for (int i = 1; i <= tamanoLado; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 9:
                 System.out.println("Dibujo de Elipse");
        System.out.print("Ingrese el radio horizontal de la elipse: ");
        int radioHorizontal = lector.nextInt();
        System.out.print("Ingrese el radio vertical de la elipse: ");
        int radioVertical = lector.nextInt();

        for (int y = -radioVertical; y <= radioVertical; y++) {
            for (int x = -radioHorizontal; x <= radioHorizontal; x++) {
                if ( radioHorizontal > radioVertical) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
    break;
    case 10:
    System.out.println("--usted salio correctamente del programa--");
            default:
                System.out.println("Opción no válida.");
                break;
        }
        lector.close();
    }
}
