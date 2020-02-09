package Unidad4;
import java.util.*;

public class vectores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner in = new Scanner(System.in);

		/*
		 * Obtener el tamaño del vector.
		 */
		System.out.print("Tamaño del vector (entre 10 y 1.000.000): ");
		int n;
		do {
			n = Integer.valueOf(in.nextLine());
			if (n < 10 || n > 1000000)
				System.out.print("Tamaño incorrecto, introdúcelo de nuevo: ");
		} while (n < 10 || n > 1000000);

		/*
		 * Crear el vector con el tamaño especificado.
		 */
		int[] vector = new int[n];

		/*
		 * Llenar el vector con valores aleatorios sin repetir.
		 */
		long t0 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			int valor;
			do {
				valor = random.nextInt(2000000) - 999999;
			} while (buscar(vector, valor, i));
			vector[i] = valor;
		}
		long lapso = System.nanoTime() - t0;
		System.out.println("Tiempo empleado en llenar el vector: " + tiempo(lapso));

		/*
		 * Calcular la diferencia entre el mayor y el menor de los valores almacenados.
		 */
		int max = vector[0];
		int min = vector[0];
		t0 = System.nanoTime();
		for (int i = 1; i < n; i++)
			if (vector[i] < min)
				min = vector[i];
			else if (vector[i] > max)
				max = vector[i];
		lapso = System.nanoTime() - t0;
		System.out.printf("Diferencia entre el mayor y el menor: %d\n", max - min);
		System.out.println("Tiempo empleado en calcularla: " + tiempo(lapso));
		
		in.close();
	}
	
	/*
	 * Busca el valor especificado dentro del vector.
	 * La búsqueda se realiza entre la posición 0 y la posición i-1.
	 * Retorna true si lo encuentra, false en caso contrario.
	 */
	static boolean buscar(int [] vector, int valor, int i) {
		for (int j=0; j<i; j++)
			if (vector[j] == valor)
				return true;
		return false;
	}

	static String tiempo(long nanosegundos) {
		StringBuilder sb = new StringBuilder();
		agregar(sb, "horas", nanosegundos / 3600000000000L);
		nanosegundos %= 3600000000000L;
		agregar(sb, "minutos", nanosegundos / 60000000000L);
		nanosegundos %= 60000000000L;
		agregar(sb, "segundos",  nanosegundos / 1000000000L);
		nanosegundos %= 1000000000L;
		agregar(sb, "milisegundos", nanosegundos / 1000000L);
		nanosegundos %= 1000000L;
		agregar(sb, "microsegundos", nanosegundos / 1000L);
		agregar(sb, "nanosegundos", nanosegundos % 1000L);
		return sb.toString();
	}
	
	static void agregar(StringBuilder sb, String unidad, long valor) {
		if (valor > 0) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(String.valueOf(valor) + " " + unidad);
		}


	}

}
