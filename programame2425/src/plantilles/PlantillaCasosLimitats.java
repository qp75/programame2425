package plantilles;

import java.util.Scanner;
/* Exemple d'enunciat
 * Entrada: 
La primera linia de l'entrada contindrà el nombre de casos de prova que el programa ha de llegir. 
A continuació vindrà un darrera l'altre tots els casos. Cadascun d'ells consisteix una única línia 
amb un nombre enter.
Sortida: 
Per cada cas de prova el programa escriurà PAR si el cas de prova és un nombre parell i escriurà IMPAR
si el nombre és imparell.
Exemple d'entrada: 5 
					2 3 
					8 9 26
 */

public class PlantillaCasosLimitats {
	static int casos;
	static Scanner teclat = new Scanner(System.in);
	
	public static void main(String[] args) {
		casos=teclat.nextInt();
		for (int i=0; i<casos; i++) {
			casDeProva();
			
		}
	}
	public static void casDeProva() {
		//Resolem el cas de prova
		int prova = teclat.nextInt();
		if ((prova % 2) == 0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
	}

}
