import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("--Discoteca--");
        System.out.println("Ingrese su edad: ");
        byte edad = lector.nextByte();
        if (edad >= 18){
            
            System.out.println("Ingrese su genero (H = Hombre / M = Mujer): ");
            char sexo = lector.next().charAt(0);
            
            switch (sexo) {
                
                case 'H':
                if (edad >= 18 &&  sexo == 'H') {
                    
                    System.out.println("--¿Usted lleva un arma consigo? (S = Si / N = No)--");
                    char arma = lector.next().charAt(0);
                    
                    switch (arma) {
                        
                        case 'S':
                        if (edad >= 18 && sexo == 'H' && arma == 'S'){
                            System.out.println("Usted porta un arma no lo dejare pasar.");
                        }
                        break;
                        
                        case 'N':
                           if (edad >= 20 && sexo == 'H' && arma == 'N'){
                               System.out.println("Usted es mayor de edad, usted puede entrar y consumir bebidas alcoholicas.");
                           } else {
                            System.out.println("Usted es mayor de edad pero menor a 20 años, puede entrar pero no puede consumir bebidas alcoholicas.");
                           }
                           break;
                        
                       default:
                         System.out.println("El tipo de respuesta (" + arma + ") no concuerda, porfavor ingrese una respuesta valida.");
                         System.out.println("-- Sistema Finalizado Correctamente --");
                           break;
                    }
                }
                
                break;
                
                case 'M':
                if (edad >= 20 && sexo == 'M'){
                    System.out.println("Usted es mayor de edad, usted puede entrar y consumir bebidas alcoholicas.");
                } else {
                    System.out.println("Usted es mayor de edad pero menor a 20 años, puede entrar pero no puede consumir bebidas alcoholicas.");
                }
                
                break;
                
                default:
            System.out.println("El tipo de genero (" + sexo + ") no concuerda, porfavor ingrese un genero valido.");
            System.out.println("-- Sistema Finalizado Correctamente --");
                break;
            }
        } else {
            System.out.println("Usted es menor de edad no puede ingresar al recinto.");
        } 
        lector.close();
    }  
}
