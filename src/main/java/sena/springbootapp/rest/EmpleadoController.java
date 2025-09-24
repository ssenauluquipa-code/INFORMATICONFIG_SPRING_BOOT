package sena.springbootapp.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.springbootapp.model.Empleado;
import sena.springbootapp.services.EmpleadoServices;

@RestController
@RequestMapping("api/Empleados")
public class EmpleadoController {
	
	private EmpleadoServices empleadoService;
    public EmpleadoController(EmpleadoServices empleadoService){
        this.empleadoService = empleadoService;
    }

    @GetMapping("/getEmpleados")
    public ResponseEntity<List<Empleado>> getEmpleados(){
        List<Empleado> empleados = this.empleadoService.getEmpleados();
        return ResponseEntity.ok(empleados);
    }

}
