package Unidad4.colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> repetidas = new TreeSet<>();
		Set<String> noRepetidas = new TreeSet<>();
		System.out.print("Introduce un texto: ");
		String linea = in.readLine();
		Scanner s = new Scanner(linea);
		
		while (s.hasNext()) {
			String palabra = s.next();
			
			
			if (!repetidas.contains(palabra)) {
				if (!noRepetidas.add(palabra)) {
					noRepetidas.remove(palabra);
					repetidas.add(palabra);
				}
			}
		}
		
		System.out.println("Repetidas: " + repetidas);
		System.out.println("No repetidas: " + noRepetidas);
		
		
		in.close();

	}

}
