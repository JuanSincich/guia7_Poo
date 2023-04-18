/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
* Luego, crea un método "retirar_dinero" que permita retirar una 
* cantidad de dinero del saldo de la cuenta. Asegúrate de que el 
* saldo nunca sea negativo después de realizar una transacción de 
* retiro.
 */
public class Cuenta {
    private int saldo;
    private String titular;

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero (){        
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuando dinero desea retirar?");
        int retiro = leer.nextInt();
        while (retiro > saldo){
            System.out.println("El monto a retirar excede el saldo disponible, ingrese nuevo monto");
            retiro = leer.nextInt();
        }
        saldo = saldo - retiro;
        System.out.println("Transaccion exitosa.");
        System.out.println("Su saldo disponible es de $ " + saldo);
                
    }      
}//end class
