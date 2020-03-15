package Unidad5;

public class Autor {
	private String nombre;
	private  String email;
	private Genero genero;



public Autor(String nombre,String email,Genero genero) {
	this.nombre=nombre;
	this.email=email;
	this.genero=genero;
	
	}

public String getNombre() {
	return nombre;
}


public Genero getGenero() {
	return genero;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



public String toString() {
	
	return String.format("%s (%s) %s",nombre, genero.toString(),email);
	
}

















}