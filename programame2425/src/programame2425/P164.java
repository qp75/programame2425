package programame2425;

import java.util.Scanner;

public class P164 {

	static int puntInf1 = 0;
	static int puntInf2 = 0;
	static int puntSup1 = 0;
	static int puntSup2 = 0;
	static int area = 0;
	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {

		while (casosDeProva())
			;
	}

	public static boolean casosDeProva() {
		// Resolem el cas de prova

		if (!teclat.hasNext())
			return false;// marca la sortida perque no hi ha m�s entrades.

		puntInf1 = teclat.nextInt();
		puntInf2 = teclat.nextInt();
		puntSup1 = teclat.nextInt();
		puntSup2 = teclat.nextInt();

		if (puntInf1 <= puntSup1 && puntInf2 <= puntSup2) {
			area = (puntSup1 - puntInf1) * (puntSup2 - puntInf2);
			System.out.println(area);
		} else
			return false;

		return true;
	}

}