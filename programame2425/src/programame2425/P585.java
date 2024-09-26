package programame2425;
import java.util.Scanner;

public class P585 {
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
		 double agulla1 = teclat.nextDouble();
	     double agulla2 = teclat.nextDouble();
	     double a1, a2, hora, part;
	      
	       // 1a opci�: a1 hores, a2 minuts
	       a1 = agulla1/30;
	       a2 = agulla2/6;
	       hora = Math.floor(a1);
	       part = agulla1 - hora*30;
	       part = part / 0.5; // graus per minut d'hora
	       if (part == a2)
	           System.out.printf("%02d:%02d\n", (int)hora, (int)part);
	       else {
	           // 2a opci�: a1 minuts, a2 hores
	           a1 = agulla1/6;
	           a2 = agulla2/30;
	           hora = Math.floor(a2);
	           part = agulla2 - hora*30;
	           part = part / 0.5; // graus per minut d'hora
	           if (part == a1)
	        	   System.out.printf("%02d:%02d\n", (int)hora, (int)part);
	           else
	        	   System.out.println("ERROR");
	       }

	}
}