package programame2425;

import java.util.Scanner;

public class P615 {

	static Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
		int numCasos;
		numCasos = in.nextInt();
		for(int i = 0; i < numCasos; i++) {
			casoDePrueba();
		}
	}
	
	static void casoDePrueba() {
		int potencia = in.nextInt();
		int factor = in.nextInt();
		int temps = in.nextInt();
		
		System.out.println((temps % (potencia + 1)) * factor);
	}
	

}
