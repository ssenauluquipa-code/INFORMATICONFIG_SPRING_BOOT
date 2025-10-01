package sena.springbootapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.springbootapp.Entity.Employee;
import sena.springbootapp.services.EmpleadoServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "*")
public class EmployeeController {
	
	@Autowired
    private EmpleadoServices employeeService;

    @GetMapping("/empleados")
    public List<Employee> getEmpleados() {
        return employeeService.getEmpleados();
    }

    @GetMapping("/empleados/{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @GetMapping("/empleados/nombre/{name}")
    public List<Employee> findName(@PathVariable String name) {
        return employeeService.findName(name);
    }

    @PostMapping("/empleados")
    public Employee createEmpleado(@RequestBody Employee empleado) {
        return employeeService.createEmpleado(empleado);
    }

    @PutMapping("/empleados/{id}")
    public Employee updateEmpleado(@PathVariable int id, @RequestBody Employee empleado) {
        return employeeService.updateEmpleado(id, empleado);
    }

    @DeleteMapping("/empleados/{id}")
    public Employee delete(@PathVariable int id) {
        return employeeService.delete(id);
    }

}
