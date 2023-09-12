package com.generation;

import java.util.Scanner;

public class Codigo4 {
	
	public static void main (String [] args) {
		//La variable "s" no es legible
	    Scanner sc = new Scanner(System.in);//Faltaba importar el scanner y entre los paréntesis poner System.in
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");//sobraba un paréntesis y las commilas de ciere no estaban colocadas correctamente
	   
	    //j1 no es legible, se cambia
	    String jugadorUno = sc.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	  
	    // Scanner scDos = new Scanner(System.in); Sobra este Scanner
	    String jugadorDos = sc.nextLine();
	    
	    //Sobraba un parentesis
	    if (jugadorUno.equals(jugadorDos)) {//Se cambian los nombres de las variables "j1, j2"para mayor legibilidad
	      System.out.println("Empate");
	    } else {
	      int numJugador= 2;
	      switch(jugadorUno) {
	        case "piedra":
	          if (jugadorDos.equals("tijeras")) {
	        	  numJugador = 1;
	          }
	          
	          //Faltaba cerrar el if
	        case "papel":
	          if (jugadorDos.equals("piedra")) {
	        	  numJugador = 1;
	          }
	          
	        case "tijera":
	          if (jugadorDos.equals("papel")) {
	        	  numJugador = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + numJugador);
	    }

	}
}//Faltaba cierre de la clase
	
	