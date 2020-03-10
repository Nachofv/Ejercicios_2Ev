package Unidad5;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Palabras {
	
	Map<Integer, Set<String>> palabras = new HashMap<>();
	
	public boolean add(String texto) {
		Scanner s = new Scanner(texto);
		boolean nuevas = add(s);
		s.close();
		return nuevas;
	}
	
	private boolean add(Scanner scanner) {
		boolean nuevas = false;
		scanner.useDelimiter("\\W+");
		while (scanner.hasNext()) {
			String palabra = scanner.next();
			Set<String> palabras = this.palabras.get(palabra.length());
			if (palabras == null) {
				palabras = new TreeSet<String>();
				this.palabras.put(palabra.length(), palabras);
			}
			nuevas |= palabras.add(palabra.toLowerCase());
		}
		return nuevas;
	}
	
	public Set<String> get(int longitud) {
		try {
			return new TreeSet<>(palabras.get(longitud));
		} catch(NullPointerException e) {
			return null;
		}
	}
	
	public String parseCMD(String linea) {
		String resultado = null;
		Scanner scanner = new Scanner(linea);
		try {
			String cmd = scanner.skip("texto:|lista\\s+|lista$").match().group().trim();
			if (cmd.equals("texto:")) {
				if (!scanner.hasNext())
					resultado = "error: se esperaba un texto";
				else if (add(scanner))
					resultado = "Se han agregado palabras nuevas";
				else
					resultado = "No se han agregado palabras nuevas";
			}	
			else if (cmd.equals("lista")) {
				try {
					int n = scanner.nextInt();
					if (scanner.hasNext())
						resultado = String.format("error: no se esperaba \"%s\"", scanner.next());
					else {
						Set<String> set = palabras.get(n);
						resultado = set == null ? String.format("no hay palabras de longitud %d", n) : set.toString();
					}
				} catch (InputMismatchException e) {
					resultado = String.format("error: \"%s\" no es un número entero", scanner.next());
				} catch (NoSuchElementException e) {
					resultado = String.format("error: se esperaba un número entero");
				}
			}
		} catch (NoSuchElementException e) {
			resultado = String.format("error: \"%s\" no es un comando válido", 
					linea.length() > 10 ? linea.substring(0, 9) + "..." : linea);
		}
		scanner.close();
		
		return resultado;
	}
}
