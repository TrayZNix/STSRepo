package com.salesianostriana.dam.webapp;

import lombok.Data;

@Data
public class Persona {
	String nombre;
	String apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
}
