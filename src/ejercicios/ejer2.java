package ejercicios;

import clases.Circunsferencia;

/**
Declarar una clase llamada Circunferencia que tenga como atributo 
* privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
1- Método constructor que inicialice el radio pasado como parámetro.
2- Métodos get y set para el atributo radio de la clase Circunferencia.
3-Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
4-Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
5-Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
public class ejer2 {
  
    public static void main(String[] args) {
        Circunsferencia c1 = new Circunsferencia(0);
        
        c1.crearCircunferencia();
        
        double ratio = c1.getRatio();
        
        c1.setRatio(ratio);
        
        c1.area(ratio);
        
        c1.perimetro(ratio);
        
        System.out.println("Area de la circunsferencia = "+ c1.area(ratio));
        System.out.println("Perímetrod e la circunsferencia = "+c1.perimetro(ratio));
        
        
        
        
    }
    
}
