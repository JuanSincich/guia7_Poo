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
public class Circunsferencia {
    private double ratio;
    
    //1- Método constructor que inicialice el radio pasado como parámetro.
    public Circunsferencia (double ratio){
        this.ratio = ratio;
    }
    //2- Métodos get y set para el atributo radio de la clase Circunferencia.
    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
    //3-Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunsferencia");
        ratio = leer.nextDouble();       
    }
    
    //4-Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).        
    public double area(double ratio){
        double area;
        area = Math.pow((3.1416*ratio), 2);
        return area;
    }
    
    //5-Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
    public double perimetro(double ratio){
        double perim;
        perim= 2*3.1416*ratio;
        return perim;
    }
}//end class
