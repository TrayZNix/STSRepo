package com.salesianostriana.dam.webapp;

import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WelcomePageConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {
	@GetMapping({ "/", "welcome" })
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") String nombre,
			Model model) {
		Persona p = new Persona("Ángel", "Naranjo González");
		model.addAttribute("nombre", p.getNombre());
		model.addAttribute("apellidos", p.getApellidos());
		return "index";
	}

	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute("persona", new Persona("Ángel", "Naranjo González"));
		return "SaludoPersonalizado";
	}

	@GetMapping("/saludo3")
	public String welcome3(Model model) {
		Persona p = new Persona("Ángel", "Naranjo González");
		model.addAttribute("nombre", p.getNombre());
		model.addAttribute("colorEnlace", "rojo");
		model.addAttribute("saludo", "Hola Mundo!!!");
		model.addAttribute("mensaje", "Me llena de orgullo y satisfacción...");
		model.addAttribute("url", "https://triana.salesianos.edu");
		return "SaludoYEnlace";

	}
}
