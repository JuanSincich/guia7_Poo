/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 Crea una clase "Juego" que tenga un método "iniciar_juego" 
 * que permita a dos jugadores jugar un juego de adivinanza 
 * de números. El primer jugador elige un número y el segundo 
 * jugador intenta adivinarlo. El segundo jugador tiene un número
 * limitado de intentos y recibe una pista de "más alto" o "más bajo" 
 * después de cada intento. El juego termina cuando el segundo jugador
 * adivina el número o se queda sin intentos. Registra el número de 
 * intentos necesarios para adivinar 
 * el número y el número de veces que cada jugador ha ganado.
 */
public class Juego {  
    private String pista;
    private int num, intentos, numero, jugador1, jugador2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2, int num, int intentos, int numero) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.num = num;
        this.intentos = intentos;
        this.numero = numero;
    }
    
    public void inciarJuego (){
        Scanner leer = new Scanner(System.in);
        System.out.println("tiene 10 intentos");
        intentos = 10;
        System.out.println("¿Qué jugador quiere ser? 1 o 2");
                  
        }              
    } 

