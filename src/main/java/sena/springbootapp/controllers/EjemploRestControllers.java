package sena.springbootapp.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.springbootapp.dto.ClaseDTO;

@RestController
@RequestMapping("/api")
public class EjemploRestControllers {
	
	@GetMapping(path = "/informatica")
	public ClaseDTO informatica() {
		
		/*Empleados empleados1 = new Empleados("juan ", "Rodriguez", "calle palmera", "gerente", 25, 70883741, 00001);
		*/
		//Map<String, Object> respuesta =  new HashMap<>();
		//respuesta.put("Titulo", " Curso de Spring boot");
		/*Map<String, Object> respuesta = new HashMap<>();
		respuesta.put("Empleado ", "Datos del Empleado");
		respuesta.put("Empleados", empleados1);
		return respuesta;*/
		ClaseDTO usuario = new ClaseDTO();
		usuario.setTitulo("Informatica");
		usuario.setUsuario("manuel");
		return usuario;
	}

}
