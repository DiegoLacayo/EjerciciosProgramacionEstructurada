import java.util.Scanner;
public class Ejercicio_2 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int veces = 0, veces1 = 0, veces2 = 0;
        
        System.out.println("¿Que tipo de trianguño es? ingresa la longitud de los 3 lados y descubrelo");
        System.out.println("Ingrese la longitud del cateto opuesto: ");
    do{
        double lado1 = lector.nextByte();
            if (lado1 > 0){
            veces = 3;
    do{
        System.out.println("Ingrese la longitud del cateto Adyacente: ");
        double lado2 = lector.nextByte();
            if (lado2 > 0){
            veces1 = 3;
    do{
        System.out.println("Ingrese la longitud de la Hipotenusa: ");
        double lado3 = lector.nextByte();
            if (lado3 > 0){
        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Su triangulo es Equilatero, tiene 3 lados iguales");
        } else {
            if (lado1 == lado2 && lado2 != lado3 || lado2 == lado3 && lado2 != lado1 || lado1 == lado3 && lado3 != lado2) {
                System.out.println("Su triangulo es Isoceles, tiene 2 lados iguales y 1 diferente");
               } else {
                   if (lado1 < lado3 && lado2 < lado3 && lado1 < lado2){
                       System.out.println("Su triangulo es Rectangulo, la Hipotenusa es mayor a los catetos y Cateto Adyacente es mayor a Cateto Opuesto");
                   } else {
                       if (lado1 != lado2 && lado2 != lado3 && lado1 != lado2){
                           System.out.println("Su traingulo es Escaleno, tiene 3 lados distintos");
                       }
                   }
               }
            }
        veces2 =3;
        } else {
            veces2++;
            System.out.println("El lado digitado no existe, ya que no puede tener un lado igual a 0 o negativo.");
            System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces2) + "/3 , porfavor intente un numero mayor a 0.");
            if (veces2 == 3){
                System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                System.out.println("-- Sistema Finalizado Correctamente --");
            }
        }
    }while ( veces2 < 3);

            } else {
            veces1++;
            System.out.println("El lado digitado no existe, ya que no puede tener un lado igual a 0 o negativo.");
            System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
            if (veces1 == 3){
                System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                System.out.println("-- Sistema Finalizado Correctamente --");
            }
        }
    }while( veces1 < 3);

        } else {
            veces++;
            System.out.println("El lado digitado no existe, ya que no puede tener un lado igual a 0 o negativo.");
            System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
            if (veces == 3){
            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
            System.out.println("-- Sistema Finalizado Correctamente --");
            }
        }
    }while( veces < 3);
       lector.close();     
    }
}