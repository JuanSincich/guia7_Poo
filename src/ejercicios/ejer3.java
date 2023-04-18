package ejercicios;

import clases.Operacion;
import java.util.Scanner;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: Método
 * constructor con todos los atributos pasados por parámetro. Método constructor
 * sin los atributos pasados por parámetro. Métodos get y set. Método para
 * crearOperacion(): que le pide al usuario los dos números y los guarda en los
 * atributos del objeto. Método sumar(): calcular la suma de los números y
 * devolver el resultado al main. Método restar(): calcular la resta de los
 * números y devolver el resultado al main Método multiplicar(): primero valida
 * que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
 * el método devuelve 0 y se le informa al usuario el error. Si no, se hace la
 * multiplicación y se devuelve el resultado al main Método dividir(): primero
 * valida que no se haga una división por cero, si fuera a pasar una división
 * por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al
 * main.
 *
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion op1 = new Operacion();

        op1.crearOperacion();

        int numero1 = op1.getNumero1();
        int numero2 = op1.getNumero2();

        op1.setNumero1(numero1);
        op1.setNumero2(numero2);

        int opcion;
        String opcionSalir = null;

        do {
            System.out.println("Elija operación a realizar");
            System.out.println("1- Sumar");
            System.out.println("2- restar");
            System.out.println("3- multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            opcion = leer.nextInt();
            if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {
                System.out.println("Esta opcion es inválida");
            }else
                switch(opcion){
                    case 1:
                        System.out.println(numero1 + " + " + numero2 + " = "+ op1.sumar(numero1, numero2));
                        break;
                    case 2:
                        System.out.println(numero1 + " - " + numero2 + " = "+ op1.restar(numero1, numero2));
                        break;
                    case 3:
                        System.out.println(numero1 + " x " + numero2 + " = "+ op1.multiplicar(numero1, numero2));
                        break;
                    case 4:
                        System.out.println(numero1 + " % " + numero2 + " = "+ op1.dividir(numero1, numero2));
                        break;
                    case 5:
                        do{
                           System.out.println("¿Esta seguro que desea salir? Responda si/no");
                        opcionSalir = leer.next();
                        if(!"si".equalsIgnoreCase(opcionSalir) && !"no".equalsIgnoreCase(opcionSalir) ){
                            System.out.println("respuesta inválidad");
                            
                        }
                        
                        
                        }while(!"si".equalsIgnoreCase(opcionSalir) && !"no".equalsIgnoreCase(opcionSalir));
                        
                }

        }while(!"si".equalsIgnoreCase(opcionSalir));
        
        System.out.println("¡Muchas gracias!");
    

    }
}
