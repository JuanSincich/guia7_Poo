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
public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public Libro(){
        
    }
    //metodo para cargar datos
    public void cargarDatos(){
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Cargar isbn");
        isbn = leer2.nextInt();
        System.out.println("Cargar título");
        titulo = leer.nextLine();        
        System.out.println("Cargar autor");
        autor = leer.nextLine();        
        System.out.println("Cargar paginas");
        paginas = leer2.nextInt();
    }
    //metodo para informar datos

    @Override
    public String toString() {
        return "Libro{" + "isbn= " + isbn + ", titulo= " + titulo + ", autor= " + autor + ", paginas= " + paginas + '}';
    }
    
}//fin class
