package Unidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		int[] v = new int[r.nextInt(490) + 10];
		for (int i = 0; i < v.length; i++)
			v[i] = r.nextInt(200) - 100;

		int secuencias = 0;
		boolean secuencia = false;
		for (int i = 1; i < v.length; i++)
			if (v[i] == v[i - 1]) {
				if (!secuencia) {
					secuencias++;
					secuencia = true;
				}
			} else if (secuencia)
				secuencia = false;

		if (v.length <= 50)
			System.out.println(Arrays.toString(v));
		System.out.printf("Número de secuencias de números repetidos: %d", secuencias);

	}

}
