package Unidad4;

import java.util.Scanner;

public class cadenas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int contador = 0;
		String a;
		String b;
		System.out.println("Introduce cadena de caracteres");
		a = in.nextLine().toLowerCase();

		System.out.println("Introduce segunda cadena de caracteres");
		b = in.nextLine().toLowerCase();

		int i = 0;
		if (a.length() < b.length()) {
			System.out.println("la segunda cadena no puede ser mas larga que la segunda");
		}
		do {
			i = a.indexOf(b, i);
			if (i != -1) {
				i++;
				contador++;
			}
		} while (i != -1);
		System.out.println("La segunda está contenida " + contador + " veces en la primera");

	}

}
