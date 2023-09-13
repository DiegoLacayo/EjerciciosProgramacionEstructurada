import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio_30 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Map<String, Double> menu = new HashMap<>();
        menu.put("Hamburguesa con Queso", 4.99);
        menu.put("McNuggets (6 piezas)", 3.49);
        menu.put("Cajita Feliz", 5.99);
        menu.put("Papas Fritas", 2.49);
        menu.put("Refresco Mediano", 1.99);

        List<String> orden = new ArrayList<>();
        double total = 0.0;

        System.out.println("¡Bienvenido a McDonald's!");
        System.out.println("Este es nuestro menú:");

        for (String platillo : menu.keySet()) {
            System.out.println(platillo + " - $" + menu.get(platillo));
        }

        while (true) {
            System.out.println("Por favor, ingrese el nombre del platillo que desea (o 'fin' para finalizar):");
            String seleccion = lector.nextLine();

            if (seleccion.equalsIgnoreCase("fin")) {
                break;
            }

            if (menu.containsKey(seleccion)) {
                orden.add(seleccion);
                total += menu.get(seleccion);
            } else {
                System.out.println("Lo siento, ese platillo no está en el menú.");
            }
        }

        System.out.println("\nDetalle de la factura:");
        for (String platillo : orden) {
            System.out.println(platillo + " - " + menu.get(platillo));
        }

        System.out.println("\nTotal a pagar: " + total);
        System.out.println("¡Gracias por su compra!");

        lector.close();
    }
}
