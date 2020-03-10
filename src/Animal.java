package Unidad5;

import java.time.LocalDate;

public class Animal {

	private String nombre;
	private LocalDate fecha;
	
	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
		fecha = LocalDate.now();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		int edad = LocalDate.now().getYear() - fecha.getYear();
		
//		return "Animal [nombre=" + nombre + ", edad=" + edad + "]";
		
		return String.format("Animal [nombre=%s, edad=%d]", nombre, edad);

}
}