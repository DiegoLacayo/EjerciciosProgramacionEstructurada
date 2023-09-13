public class Ejercicio_20 {

  public static void main(String[] args) {
        long startTime, endTime;
        int count = 0;

        System.out.println("---Medidor de Velocidad de la Computadora---");

        startTime = System.currentTimeMillis();

        while (count < 300000000) {
            count++;

            if (count % 1000000 == 0) {
                System.out.println("Alcance de múltiplo de 1,000,000: " + count);
            }
        }

        endTime = System.currentTimeMillis();

        long tiempoTotal = endTime - startTime;
        System.out.println("Tiempo total transcurrido (ms): " + tiempoTotal);
    }
}
