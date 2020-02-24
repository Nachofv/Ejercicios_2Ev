package Unidad4.colecciones;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		Random r;
		r = new Random();
		List<Integer> numeros = new ArrayList<Integer>();

		numeros.add(r.nextInt(100) + 1);
		
		
		
		for (int i = 0; i<=numeros.length();i++) {
			
	System.out.println(i);
	
		}
		
		
		/* System.out.println(numeros);

		Iterator<Integer> aleatorio = numeros.iterator();

		while (aleatorio.hasNext()) {

			Integer numero = aleatorio.nextInt(100)+1;

			System.out.println(numero);
		}*/

	}

}
