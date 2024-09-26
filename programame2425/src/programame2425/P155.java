package programame2425;

import java.util.Scanner;

public class P155 {

	static int perimetre = 0;
	static boolean sortir = true;
	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (casosDeProva());
	}

	public static boolean casosDeProva() {
		// Resolem el cas de prova

		if (!teclat.hasNext())
			return false;// marca la sortida perque no hi ha m�s entrades.
		int base = teclat.nextInt();
		int alcada = teclat.nextInt();
		if (base < 0 || alcada < 0) {
			return false;
		} else {
			perimetre = (base + alcada) * 2;
			System.out.println(perimetre);
		}

		return true;
	}

}
