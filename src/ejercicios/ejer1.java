/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import clases.Libro;

/**
 *
 * @author Usuario
 */
public class ejer1 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro l1 = new Libro();
        
        l1.cargarDatos();
        
        System.out.println(l1.toString());
    }
  
            
}
