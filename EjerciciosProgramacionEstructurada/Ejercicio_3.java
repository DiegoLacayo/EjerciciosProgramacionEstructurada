import java.util.Scanner;
public class Ejercicio_3 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int veces = 0;

        System.out.println("--Inventario de Galletas con el calculo de retiro--");
    do{
        System.out.println("Ingrese el numero total de galletas que desea retirar: ");
        int Ngalletas = lector.nextInt();
        if (Ngalletas > -1){

        int GalletasXcaja = 24;
        int CajasXcontenedor = 75;

        int CajasNecesarias = Ngalletas / GalletasXcaja;
        int GalletasRestantes = Ngalletas % GalletasXcaja;

        int ContenedoresNecesarios = CajasNecesarias / CajasXcontenedor;
        int CajasSobrantes = CajasNecesarias % CajasXcontenedor;

        System.out.println("Numero de cajas necesarias: " + CajasNecesarias);
        System.out.println("Numero de galletas sobrantes: " + GalletasRestantes);
        System.out.println("Numero de contenedores necesarios: " + ContenedoresNecesarios);
        System.out.println("Numero de cajas sobrantes: " + CajasSobrantes);
        veces = 3;
        }else{
            veces++;
            System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
            if (veces == 3){
            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
            System.out.println("-- Sistema Finalizado Correctamente --");
            }
        }
        }while (veces < 3);
        lector.close();
    }
}
