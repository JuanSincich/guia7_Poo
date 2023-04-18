/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 Definir una clase llamada Puntos que contendrá las coordenadas de 
* dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x 
* e y un punto. Generar un objeto puntos usando un método 
* crearPuntos() que le pide al usuario los dos números y 
* los ingresa en los atributos del objeto. Después, a través 
* de otro método calcular y devolver la distancia que existe
* entre los dos puntos que existen en la clase Puntos. 
 */
public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Punto 1");
        System.out.println("Ingrese x1");
        x1 = leer.nextInt();
        System.out.println("Ingrese y1");
        y1 = leer.nextInt();
        System.out.println("Punto 2");
        System.out.println("Ingrese x2");
        x2 = leer.nextInt();
        System.out.println("Ingrese y2");
        y2 = leer.nextInt();        
    }
    
    public double distancia(){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    
}//end class
