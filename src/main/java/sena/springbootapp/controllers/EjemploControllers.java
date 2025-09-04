package sena.springbootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploControllers {
	
	@GetMapping("detalle_info")
	public String info(Model modal) {
		modal.addAttribute("Titulo", "Servidor");
		modal.addAttribute("Servidor", "Samuel Servidor");
		modal.addAttribute("IP", "192.168.0.1");
		return "detalle_info";
	}

}
