package repaso2EV;

import java.util.Arrays;

public class PruebaMatrices {

	public static void main(String[] args) {

		int array[][] = Matrices.cuadrada1(4);
		for (int f = 0; f < array.length; f++) {
			for (int c = 0; c < array[f].length; c++)
				System.out.print(array[f][c] + " ");
			System.out.println();
		}
		System.out.println(".----------------------------------------------------");

		int array1[][] = Matrices.cuadrada2(4);
		// System.out.println("Cuadrada 2: "+ Arrays.deepToString(array1));

		for (int f = 0; f < array1.length; f++) {
			for (int c = 0; c < array1[f].length; c++)
				System.out.print(array1[f][c] + " ");
			System.out.println();
		}
		System.out.println(".----------------------------------------------------");

		String[][] result = Matrices.palindromo(4, 6);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++)
				System.out.println(result[i][j] + " ");
			System.out.println();
		}

	}
}