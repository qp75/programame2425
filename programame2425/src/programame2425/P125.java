package programame2425;

import java.util.Arrays;
import java.util.Scanner;

public class P125 {
    static int casos;
    static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        casos = teclat.nextInt(); 
        for (int i = 0; i < casos; i++) {
            casDeProva(); 
        }
    }

    public static void casDeProva() {
       
        long numero = teclat.nextLong();

        // Comprobamos si el número es vampiro
        if (esVampiro(numero)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean esVampiro(long numero) {
        String numeroStr = Long.toString(numero);
        int longitud = numeroStr.length();

        // El número debe tener un número par de dígitos
        if (longitud % 2 != 0) {
            return false;
        }

        // Recorremos posibles colmillos
        for (long i = (long) Math.pow(10, longitud / 2 - 1); i < Math.pow(10, longitud / 2); i++) {
            long j = numero / i;

            // Evitar colmillos que terminan ambos en 0
            if (numero % i == 0 && !(i % 10 == 0 && j % 10 == 0)) {
                String colmillos = Long.toString(i) + Long.toString(j);
                char[] original = numeroStr.toCharArray();
                char[] combinacion = colmillos.toCharArray();

                // Ordenamos los dígitos para comparar
                Arrays.sort(original);
                Arrays.sort(combinacion);

                if (Arrays.equals(original, combinacion)) {
                    return true;
                }
            }
        }

        return false;
    }
}
