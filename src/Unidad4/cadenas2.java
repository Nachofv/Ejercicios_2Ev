package Unidad4;

import java.util.Scanner;

public class cadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una palabra ");

		String palabra;
		palabra = in.nextLine();
		String palabrainvertida = "";

		for (int i = palabra.length()-1; i >= 0; i--) {
			palabrainvertida = palabrainvertida + palabra.charAt(i);
		}

		System.out.println("La palabra invertida es:\n" + palabrainvertida);

	}

}
