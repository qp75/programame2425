package programame2425;

import java.util.Scanner;
/* Exemple d'enunciat
 * Entrada: 
La primera l�nia de l�entrada contindr� el nombre de casos de prova que el programa ha de llegir. 
A continuaci� vindr� un darrera l�altre tots els casos. Cadascun d�ells consisteix una �nica l�nia 
amb un nombre enter.
Sortida: 
Per cada cas de prova el programa escriur� PAR si el cas de prova �s un nombre parell i escriur� IMPAR
si el nombre �s imparell.
 */

public class P300 {
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
		String paraula=teclat.next();
		int a=0,e=0,i=0,o=0,u =0;
		paraula = paraula.toLowerCase();
		
		for (char c: paraula.toCharArray()) {
			
			if (c=='a')
				a=1;
			else if (c=='e')
				e=1;
			else if (c=='i')
				i=1;
			else if (c=='o')
				o=1;
			else if (c=='u')
				u=1;
		}
		if (a==1 && e==1 && i==1 && o==1 && u==1) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
	}

}
