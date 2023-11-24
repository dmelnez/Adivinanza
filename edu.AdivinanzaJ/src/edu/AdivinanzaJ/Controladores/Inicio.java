package edu.AdivinanzaJ.Controladores;

import edu.AdivinanzaJ.Servicios.NumeroImplementacion;
import edu.AdivinanzaJ.Servicios.NumeroInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumeroInterfaz mi = new NumeroImplementacion ();
		
		 
		 double numeroAle =  Math.random()*100;
		 short numeroAlee = (short)numeroAle;
		
		
		
		for (int numeroIntentos = 1; numeroIntentos <=10; ++numeroIntentos) {
			
			int numeroIntro = mi.adivinar();
			
			System.out.println("Lleva Nº: " + numeroIntentos);
			
			if (numeroIntro == numeroAlee) {
				System.out.println("Has Acertado");
				break;
			}
			
			if (numeroIntro != numeroAlee) {
				
				System.out.println("Has Fallado");
				
				if (numeroIntro < numeroAlee) {
					System.out.println("El Numero es Mayor");
				}
				
				if (numeroIntro > numeroAlee) {
					System.out.println("El Numero es Menor");
				}
			}

			
				
			}
					
			
		
		System.out.println("El numero era: " + numeroAlee);
		
	}

}
