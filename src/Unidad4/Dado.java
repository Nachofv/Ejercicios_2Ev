package Unidad4;

import java.util.*;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		
		Scanner in = new Scanner(System.in);
		
		int [] contadores = {0, 0, 0, 0, 0, 0};
		
		
		System.out.print("Número de lanzamientos: ");
		int n = in.nextInt();
		
		for (int i=0; i<n; i++)
			
			contadores[r.nextInt(6)]++;
		
		for (int i=0; i<contadores.length; i++)
			
			if (contadores[i] == 1) {

				System.out.println("Lado " + (i+1) + " " + contadores[i] + " vez");

			} else {
				System.out.println("Lado " + (i+1) + " " + contadores[i] + " veces");
			}
		
			
	}

}
