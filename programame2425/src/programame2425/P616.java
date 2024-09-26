package programame2425;

import java.util.Scanner;

public class P616 {
	static int casos ;
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (casoDePrueba()) {
			;
		}
	}
	public static boolean casoDePrueba() {
		casos = lector.nextInt();
		if(casos==0) {
			return false;
		}
		int jugador = 0;
		int[] marcador = {0,0};
		for(int i = 0; i<casos;i++) {
			String so=lector.next();
			if(so.equalsIgnoreCase("PIC")) {
				if(jugador==0) jugador=1;
				else jugador=0;
			}
			else if(so.equalsIgnoreCase("PONG!")) {
				marcador[jugador]++;
			}			
		}
		System.out.println(marcador[0]+" "+marcador[1]);
		return true;
	}

}