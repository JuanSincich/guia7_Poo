/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {

    private int numero1;
    private int numero2;

    //a- Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //b- Método constructor sin los atributos pasados por parámetro.
    public Operacion() {

    }
    //c- Métodos get y set.

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //d- Método para crearOperacion(): que le pide al usuario los dos 
    //números y los guarda en los atributos del objeto.
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero entero");
        numero1 = leer.nextInt();
        System.out.println("Ingrese seguyndo número");
        numero2 = leer.nextInt();
    }

    // e- Método sumar(): 
    public int sumar(int numero1, int numero2) {
        int sumar = numero1 + numero2;
        return sumar;
    }

    //f- Método restar():
    public int restar(int numero1, int numero2) {
        int restar = numero1 - numero2;
        return restar;
    }

    //g- Método multiplicar(): 
    public int multiplicar(int numero1, int numero2) {
        int multiplicar;
        if (numero1 == 0 || numero2 == 0) {
            multiplicar = 0;
            System.out.println("Al menos uno de los valores es cero");
        } else {
            multiplicar = numero1 * numero2;

        }
        return multiplicar;
    }

    //h- Método dividir():
    public double dividir(int numero1, int numero2) {
        double dividir;
        if (numero1 == 0 || numero2 == 0) {
            dividir = 0;
            System.out.println("Al menos uno de los valores es cero");
        } else {
            dividir = numero1 / numero2;
        }

        return dividir;
    }

}//end class
