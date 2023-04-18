/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un método "calcular_aumento" que calcule el aumento
 * salarial de un empleado en función de su edad y salario actual. El aumento
 * salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si
 * tiene menos de 30 años.
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void cargarDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre del empleado");
        nombre = leer.next();
        System.out.println("Ingrese edad del empleado");
        edad = leer.nextInt();
        System.out.println("Ingrese salario del empleado");
        salario = leer.nextDouble();
    }

    public void calcular_aumento() {
        if (edad > 30) {
            salario = salario * 1.1;
        } else {
            salario = salario * 1.05;
        }
        System.out.println("El aumento correcpondiente para " + nombre + " es $" + salario);
    }

}//end class
