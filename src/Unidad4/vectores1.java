package Unidad4;

import java.util.*;

public class vectores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int [] v1 = new int[r.nextInt(41) + 10];
		for (int i = 0; i < v1.length; i++) {
			int n;
			do {
				n = r.nextInt(201) - 100;
			} while (buscar(v1, n, i));
			v1[i] = n;
		}
		
		int n = v1.length;
		int [] v2 = new int[n];
		for (int i=0; i<n; i++)
			v2[n - i - 1] = v1[i];
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
	}
	


	static boolean buscar(int [] v, int valor, int i)
	{
		int j = 0;
		while (v[j] != valor && j < i)
			j++;
		return j < i;
	}
	
}
