package repaso2EV;

public class Matrices {

	static int[][] cuadrada1(int dim) {

		int array[][] = new int[dim][dim];

		int n = dim;
		int contador = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[j][i] = contador;
				contador++;
			}
		}
		return array;

	}
//--------------------------------------------------------------------------------------------------

	static public int[][] cuadrada2(int dim) {

		int array1[][] = new int[dim][dim];

		int n = dim;
		int contador = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					array1[j][i] = contador;
				} else {
					array1[dim - j - 1][i] = contador;
				}
				contador++;
			}
		}

		return array1;
	}

//--------------------------------------------------------------------------------------------------	   
	public static String[][] palindromo(int f, int c) {

		if (f < 1 || f > 26 || c < 1 || c > 26) {

			return null;
		}

		String[][] pal = new String[f][c];

		String[] letras = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "W", "x", "y", "z" };

		for (int i = 0; i < f; i++) {

			for (int j = 0; j < c; j++) {

				String letra1 = letras[i];
				String letra2 = letras[i + j];
				String letra3 = letra1;
				String palindromo = letra1 + letra2 + letra3;
				pal[i][j] = palindromo;

			}

		}
		return pal;
	}

//--------------------------------------------------------------------------------------------------	   
	public static int  max3x3sum (int [][] matriz) {

		int maxvalor = 0;

		for (int i0 = 0; i0 < matriz.length - 3; i0++)

		{
			for (int j0 = 0; j0 < matriz.length - 3; j0++) {
				int suma = 0;

				for (int i = 0; i < 4; i++) {

					for (int j = 0; j < 5; j++) {

						suma +=matriz[i0 + i][j0 + j];
					}
				}
				if (suma > maxvalor) {
					maxvalor = suma;
				}
			}

		}
		return maxvalor;
	
	}

	

	

	
}