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
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("ingrese la base del rectangulo");
            base = leer.nextDouble();
            System.out.println("Ingrese la altura del rectángulo");
            altura = leer.nextDouble();

            if (base < 1 || altura < 1) {
                System.out.println("Uno o ambos valores son incorrectos, ingrese numeros positivos");
            }
        } while (base < 1 || altura < 1);
    }

    // metodo superficie
    public double superficie() {
        return this.base * this.altura;
    }

    // metodo perimetro
    public double perimetro() {
        return (this.base * this.altura) * 2;
    }
    
    // Imprimir
    
   public void imprimir (){
       for (int i = 0; i < this.altura; i++){
           for (int j= 0; j < this.base; j++){
               if (i ==0 ||i == this.altura -1 ||j ==0 || j == this.base -1){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
               
           }
           System.out.println("");
       }
   }
}
 