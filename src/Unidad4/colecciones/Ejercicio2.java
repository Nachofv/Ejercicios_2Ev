package Unidad4.colecciones;

import java.util.*;

public class Ejercicio2 {


		public static void main(String[] args) {
			List<Integer> lista1 = new LinkedList<>();
			for (int i=0; i<100; i++)
				lista1.add((int) (Math.random() * 10000 + 1));
			for (Integer n: lista1)
				System.out.printf("%d  ", n);
			System.out.println();
			
			Set<Integer> conjunto1 = new HashSet<>();
			conjunto1.addAll(lista1);
			Iterator<Integer> i = conjunto1.iterator();
			while (i.hasNext())
				System.out.printf("%d  ", i.next());
			System.out.println();
			
			Set<Integer> conjunto2 = new TreeSet<>();
			conjunto2.addAll(lista1);
			conjunto2.forEach(a -> System.out.printf("%d  ", a));

	}

}
