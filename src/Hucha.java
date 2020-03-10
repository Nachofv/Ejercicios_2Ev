package Unidad5;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hucha {

	private static int [] valores = {50, 20, 10, 5, 2, 1};
	private Map<Integer, Integer> dinero;
	private String password = "";
	private boolean abierta = true;
	
	public Hucha() {
		this(0, 0, 0, 0, 0, 0);
	}
	
	public Hucha(int uno, int dos, int cinco, int diez, int veinte, int cincuenta) {
		dinero = new TreeMap<>();
		dinero.put(1, uno);
		dinero.put(2, dos);
		dinero.put(5, cinco);
		dinero.put(10, diez);
		dinero.put(20, veinte);
		dinero.put(50, cincuenta);
		abierta = false;
	}
	
	public Hucha(int euros) {
		int cantidad;
		int i = 0;
		while (euros > 0) {
			if (euros > valores[i]) {
				cantidad = euros % valores[i];
				euros = euros - cantidad * valores[i];
				add(valores[i--], cantidad);
			}
		}
	}
	
	public void add(int valor, int cantidad) {
		if (!abierta)
			System.out.println("Lo siento, la hucha está cerrada");
		else if (cantidad > 0)  {
			int cantidadAnterior = dinero.get(valor);
			dinero.put(valor, cantidadAnterior + cantidad);
		}
		else
			System.out.println("No se pueden añadir cantidades menores o iguales a cero");
	}
	
	public void abrir(String password) {
		if (this.password.equals(password))
			abierta = true;
		else
			System.out.println("Contraseña incorrecta");
	}
	
	public void cerrar(String password) {
		if (this.password.equals(password))
			abierta = false;
		else
			System.out.println("Contraseña incorrecta");
	}
	
	public void cambiarPassword(String anterior, String nueva) {
		if (this.password.equals(anterior))
			this.password = nueva;
		else
			System.out.println("Contraseña anterior incorrecta");
	}
	
	public int getEuros() {
		Set<Entry<Integer, Integer>> s = dinero.entrySet();
		int total = 0;
		for (Entry<Integer, Integer> entry: s) {
			total += entry.getKey() * entry.getValue();
		}
		return total;
	}
	
	public int cantidad(int valor) {
		return valor;
		
	}
	
	@Override
	public String toString() {
		return password;
				
	}
}
