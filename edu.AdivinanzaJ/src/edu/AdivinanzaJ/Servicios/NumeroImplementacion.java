package edu.AdivinanzaJ.Servicios;

import java.util.Scanner;

public class NumeroImplementacion implements NumeroInterfaz{

	
	public int adivinar () {
		
		System.out.println("Introduzca un Numero");
		
		Scanner mi = new Scanner(System.in); 
		
		int numeroIntro = mi.nextInt();
		return numeroIntro;
		
	}
}
