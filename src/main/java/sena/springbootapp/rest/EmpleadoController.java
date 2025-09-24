package sena.springbootapp.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.springbootapp.model.Empleado;
import sena.springbootapp.services.EmpleadoServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/Empleados")
public class EmpleadoController {

    private final UserController userController;
	
	private EmpleadoServices empleadoService;
    public EmpleadoController(EmpleadoServices empleadoService, UserController userController){
        this.empleadoService = empleadoService;
        this.userController = userController;
    }

    @GetMapping("/getEmpleados")
    public ResponseEntity<List<Empleado>> getEmpleados(){
        List<Empleado> empleados = this.empleadoService.getEmpleados();
        return ResponseEntity.ok(empleados);
    }
    
    @GetMapping("/getEmpeladoById/{id}")
    public ResponseEntity<Empleado> getEmpleadoById(@PathVariable int id){
    	Empleado empleadoId = this.empleadoService.findById(id);
    	return ResponseEntity.ok(empleadoId);
    }
    
    @PostMapping("/createEmpleado")
    public ResponseEntity<Empleado> createEmpleado (@RequestBody Empleado empleado){ 
        var empleados = this.empleadoService.createEmpleado(empleado);
        return ResponseEntity.ok(empleados);
    }
    
    @PutMapping("/updateEmpleado/{id}")
    public ResponseEntity<Empleado> updateEmpleado(@PathVariable int id, @RequestBody Empleado emeplado){
    	var empleados = this.empleadoService.updateEmpleado(id, emeplado);
    	return ResponseEntity.ok(empleados);
    }
    
    @DeleteMapping("/deleted/{id}")
    public ResponseEntity<Empleado> deleted(@PathVariable int id){
    	var empleadoResult = this.empleadoService.delete(id);
    	return ResponseEntity.ok(empleadoResult);
    }

}
