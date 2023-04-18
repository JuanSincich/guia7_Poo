/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import clases.Empleado;

/**
 *
 * @author Usuario
 */
public class extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        
        e1.cargarDatos();
        
        e1.calcular_aumento();       
    }
    
}
