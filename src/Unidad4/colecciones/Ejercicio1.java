package Unidad4.colecciones;

import java.util.*;


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nombres = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Número de nombres: ");
		int n = in.nextInt();
		System.out.println("Introduce nombres: ");
		for (int i=0; i<n; i++) {
			String nombre = in.next();
			if (!nombres.contains(nombre))
				nombres.add(nombre);
		}
		System.out.println(nombres);

	}

}
