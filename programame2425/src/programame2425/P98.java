package programame2425;

import java.util.Scanner;

public class P98 {

	static int casos;
	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {
		casos = teclat.nextInt();
		for (int i = 0; i < casos; i++) {
			casDeProva();
		}
	}

	public static void casDeProva() {
		// Resolem el cas de prova
		int dia = teclat.nextInt();
		int mes = teclat.nextInt();
		if (dia == 25 && mes == 12) {

			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}
}
