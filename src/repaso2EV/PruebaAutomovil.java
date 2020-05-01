package repaso2EV;

import java.util.HashMap;
import java.util.Scanner;

public class PruebaAutomovil {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		HashMap<String, Automovil> mis_coches = new HashMap<String, Automovil>();

		System.out.println("Cuantos coches?");

		int datos = in.nextInt();

		for (int i = 0; i < datos; i++) {

			System.out.println("Introduce modelo,capacidad de deposito, cantidad de gas en el deposito y consumo*litro");

			String model = in.next();
			double deposito = in.nextDouble();
			double combustible = in.nextDouble();
			double consumo = in.nextDouble();
			double kmrecorrido = 0;
			double consumototal = 0;

			Automovil coche = new Automovil(model, deposito, combustible, consumo, kmrecorrido, consumototal);

			mis_coches.put(model, coche);
			System.out.println("-----------------------------------------------------------------");
		}

		boolean conducir;

		System.out.println("Drive?  (0=no,1=yes)");

		conducir = in.nextInt() == 1;

		while (conducir) {

				System.out.println("Modelo: ");
			    String modelo = in.next();

				System.out.println("¿cuantos km vas hacer?");
				double km = in.nextInt();

				Automovil coche = mis_coches.get(modelo);

				double combustibleInicial = coche.getCombustible();

				if (coche.Desplazarse(km)) {

					double combustibleConsumido = combustibleInicial - coche.getCombustible();

					System.out.println("Drive   " + coche.getModelo() + " " + coche.getCombustible() + " " + combustibleConsumido);

				} else if (!coche.Desplazarse(km)) {
					System.out.println("Combustible insuficiente para este desplazamiento");

				}

				System.out.println("Numero de coches: " + datos + "\n");

				for (Automovil e : mis_coches.values()) {

					System.out.printf("-Modelo: " + e.getModelo() + "\n-" + "Litros en el depósito: "+ e.getCombustible() +
							"\n-Km recorridos " + e.getKmRecorrido() + "\n-" + "Consumo: "+ e.getConsumoTotal() + "\n");
					
				}

				System.out.println("Drive?  (0=no,1=yes)");
				conducir = in.nextInt() == 1;

			

		}

	}
}