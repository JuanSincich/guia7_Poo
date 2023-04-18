/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import clases.Rectangulo;

/**
 *
 * @author Usuario
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo();
       
       r1.crearRectangulo();             
         
       r1.imprimir();
       
        System.out.println("Superficie = "+ r1.superficie());
        
        System.out.println("Perímetro ="+ r1.perimetro());  
    }   
}
