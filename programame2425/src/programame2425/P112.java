package programame2425;

import java.util.Scanner;

public class P112 {
	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {
	
		while (casosDeProva())
			;
	}

	public static boolean casosDeProva() {
		// Resolem el cas de prova
		 float velocitat_mitjana;
		 int distancia = teclat.nextInt();
		 int velocitat_maxima = teclat.nextInt();
		 int temps = teclat.nextInt();
		
		if ((distancia==0 && velocitat_maxima==0 && temps==0)) {			
			return false; // marca la sortida del bucle quan es compleix la condici�
		}else if(distancia<=0 || velocitat_maxima<=0 || temps<=0){
			System.out.println("ERROR");
			}
		else {
			 velocitat_mitjana = distancia/((float)temps/3600)/1000;
		        // System.out.println("velocitat mitjana: "+velocitat_mitjana);
		        if (velocitat_mitjana<=velocitat_maxima)
		        	System.out.println("OK");
		        else if (velocitat_mitjana>=velocitat_maxima*1.2)
		        	System.out.println("PUNTOS");
		        else
		        	System.out.println("MULTA");

		}			
		return true;
	}


}
