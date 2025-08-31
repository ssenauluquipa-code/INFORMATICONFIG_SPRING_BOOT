package sena.springbootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploControllers {
	
	@GetMapping("detalle_info")
	public String info() {
		return "detalle_info";
	}

}
