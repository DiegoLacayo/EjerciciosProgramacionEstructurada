import java.util.Scanner;
public class Ejercicio_23 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("---Vetores 2D y 3D---");
        do {
            System.out.println("Seleccione la dimensión de los vectores (2D o 3D): ");
            int dimension = lector.nextInt();
            System.out.println("Ingrese las coordenadas del primer vector:");
            double[] vector1 = new double[dimension];
            for (int i = 0; i < dimension; i++) {
                System.out.print("Componente " + (i + 1) + ": ");
                vector1[i] = lector.nextDouble();
            }
            System.out.println("Ingrese las coordenadas del segundo vector:");
            double[] vector2 = new double[dimension];
            for (int i = 0; i < dimension; i++) {
                System.out.print("Componente " + (i + 1) + ": ");
                vector2[i] = lector.nextDouble();
            }
            
            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println("1) Suma de vectores");
            System.out.println("2) Resta de vectores");
            System.out.println("3) El opuesto de un vector");
            System.out.println("4) Producto de un escalar por un vector");
            System.out.println("5) Producto punto o producto escalar entre vectores");
            System.out.println("6) Determinar si son vectores paralelos");
            System.out.println("7) Determinar si son vectores ortogonales");
            System.out.println("8) Determinar la proyección de un vector sobre otro vector");
            System.out.println("9) Producto vectorial o producto cruz (solo 3D)");
            System.out.println("10) Salair del menu." );
            System.out.println("Elije una opcion en el menu para acceder a su funcion:");
            
            int opcion = lector.nextInt();
            
            switch (opcion) {
                case 1:
                    double[] suma = sumaVectores(vector1, vector2);
                    imprimirVector("Suma de vectores:", suma);
                    break;
                case 2:
                    double[] resta = restaVectores(vector1, vector2);
                    imprimirVector("Resta de vectores:", resta);
                    break;
                case 3:
                    double[] opuesto = opuestoVector(vector1);
                    imprimirVector("Opuesto del primer vector:", opuesto);
                    break;
                case 4:
                    System.out.print("Ingrese el escalar: ");
                    double escalar = lector.nextDouble();
                    double[] productoEscalar = productoEscalarVector(escalar, vector1);
                    imprimirVector("Producto de un escalar por un vector:", productoEscalar);
                    break;
                case 5:
                    double productoPunto = productoPuntoVectores(vector1, vector2);
                    System.out.println("Producto punto o producto escalar entre vectores: " + productoPunto);
                    break;
                case 6:
                    boolean sonParalelos = sonVectoresParalelos(vector1, vector2);
                    System.out.println("¿Son vectores paralelos? " + sonParalelos);
                    break;
                case 7:
                    boolean sonOrtogonales = sonVectoresOrtogonales(vector1, vector2);
                    System.out.println("¿Son vectores ortogonales? " + sonOrtogonales);
                    break;
                case 8:
                    double[] proyeccion = proyeccionVectorSobreOtro(vector1, vector2);
                    imprimirVector("Proyección del primer vector sobre el segundo vector:", proyeccion);
                    break;
                case 9:
                    if (dimension == 3) {
                        double[] productoVectorial = productoVectorial3D(vector1, vector2);
                        imprimirVector("Producto vectorial (solo 3D):", productoVectorial);
                    } else {
                        System.out.println("La operación de producto vectorial solo es válida en 3D.");
                    }
                    break;
                case 10:
                System.out.println("-- Salio con exito del menu --");
                break;

                default:
                    System.out.println("Opción no válida.");
            }
            
            System.out.println("¿Desea realizar otra operación? (Sí/No)");
            String respuesta = lector.next();
            if (!respuesta.equalsIgnoreCase("Sí")) {
                break;
            }
            
        } while (true);
        
        System.out.println("Gracias por utilizar la aplicación.");
        lector.close();
    }
    
    public static double[] sumaVectores(double[] v1, double[] v2) {
        int dimension = v1.length;
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }
    
    public static double[] restaVectores(double[] v1, double[] v2) {
        int dimension = v1.length;
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = v1[i] - v2[i];
        }
        return resultado;
    }
    
    public static double[] opuestoVector(double[] v) {
        int dimension = v.length;
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = -v[i];
        }
        return resultado;
    }
    
    public static double[] productoEscalarVector(double escalar, double[] v) {
        int dimension = v.length;
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = escalar * v[i];
        }
        return resultado;
    }
    
    public static double productoPuntoVectores(double[] v1, double[] v2) {
        int dimension = v1.length;
        double resultado = 0;
        for (int i = 0; i < dimension; i++) {
            resultado += v1[i] * v2[i];
        }
        return resultado;
    }
    
    public static boolean sonVectoresParalelos(double[] v1, double[] v2) {
        double productoCruz = productoVectorial3D(v1, v2)[2];
        return productoCruz == 0;
    }
    
    public static boolean sonVectoresOrtogonales(double[] v1, double[] v2) {
        return productoPuntoVectores(v1, v2) == 0;
    }
    
    public static double[] proyeccionVectorSobreOtro(double[] v1, double[] v2) {
        double productoPunto = productoPuntoVectores(v1, v2);
        double magnitudV2 = magnitudVector(v2);
        double escalar = productoPunto / (magnitudV2 * magnitudV2);
        return productoEscalarVector(escalar, v2);
    }
    
    public static double magnitudVector(double[] v) {
        double sumaCuadrados = 0;
        for (double componente : v) {
            sumaCuadrados += componente * componente;
        }
        return Math.sqrt(sumaCuadrados);
    }
    
    public static double[] productoVectorial3D(double[] v1, double[] v2) {
        if (v1.length == 3 && v2.length == 3) {
            double[] resultado = new double[3];
            resultado[0] = v1[1] * v2[2] - v1[2] * v2[1];
            resultado[1] = v1[2] * v2[0] - v1[0] * v2[2];
            resultado[2] = v1[0] * v2[1] - v1[1] * v2[0];
            return resultado;
        } else {
            throw new IllegalArgumentException("El producto vectorial solo es válido en 3D.");
        }
    }
    
    public static void imprimirVector(String mensaje, double[] v) {
        System.out.print(mensaje + " (");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}