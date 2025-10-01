package sena.springbootapp.services;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import sena.springbootapp.DTO.EmployeeDTO;
import sena.springbootapp.Entity.Employee;
@Service
public class EmpleadoServices {
	/*private static final List<Empleado> empleados_LIST = new ArrayList<>(List.of(

            new Empleado(
                    9, "Fernando", "Cruz", LocalDate.of(1987, 9, 15), "Male", "Bolivian",
                    "78901234", "+591 7123 4575", "fernando.cruz@empresa.com", "Calle del Mar 456, Cochabamba",
                    "url_to_Photo_9", false, LocalDate.of(2015, 6, 30), LocalDate.of(2015, 6, 30), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    10, "Gabriela", "Salazar", LocalDate.of(1992, 1, 20), "Female", "Bolivian",
                    "89012345", "+591 7123 4576", "gabriela.salazar@empresa.com", "Calle de la Unión 789, Sucre",
                    "url_to_Photo_10", true, LocalDate.of(2021, 4, 25), LocalDate.of(2021, 4, 25), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    11, "Javier", "Mendoza", LocalDate.of(1983, 5, 5), "Male", "Bolivian",
                    "90123456", "+591 7123 4577", "javier.mendoza@empresa.com", "Calle de la Libertad 321, Tarija",
                    "url_to_Photo_11", true, LocalDate.of(2019, 8, 15), LocalDate.of(2019, 8, 15), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    12, "Claudia", "Paredes", LocalDate.of(1991, 10, 10), "Female", "Bolivian",
                    "01234567", "+591 7123 4578", "claudia.paredes@empresa.com", "Calle de la Esperanza 654, Potosí",
                    "url_to_Photo_12", false, LocalDate.of(2020, 12, 1), LocalDate.of(2020, 12, 1), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    13, "Andrés", "Vargas", LocalDate.of(1986, 3, 3), "Male", "Bolivian",
                    "12345678", "+591 7123 4579", "andres.vargas@empresa.com", "Calle del Sol 456, Cochabamba",
                    "url_to_Photo_13", true, LocalDate.of(2018, 7, 20), LocalDate.of(2018, 7, 20), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    14, "Patricia", "Soto", LocalDate.of(1994, 11, 11), "Female", "Bolivian",
                    "23456789", "+591 7123 4580", "patricia.soto@empresa.com", "Calle de la Paz 789, La Paz",
                    "url_to_Photo_14", false, LocalDate.of(2021, 3, 1), LocalDate.of(2021, 3, 1), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    15, "Ricardo", "Gutiérrez", LocalDate.of(1989, 8, 20), "Male", "Bolivian",
                    "34567890", "+591 7123 4581", "ricardo.gutierrez@empresa.com", "Calle del Río 321, Tarija",
                    "url_to_Photo_15", true, LocalDate.of(2017, 9, 12), LocalDate.of(2017, 9, 12), LocalDate.of(2023, 1, 10)
            )
    ));

    public List<Empleado> getEmpleados(){
        return empleados_LIST;
    }
    
    public Empleado findById(int id) {
    	return empleados_LIST.stream()
    			.filter(e -> e.EmployeeId() == id)
    			.findFirst()
    			.orElseThrow(() -> new UserNotFoundException("User not found","User could not find in the ArrayList", HttpStatus.NOT_FOUND));
    }
    public List<Empleado> findName(String Name){
    	return empleados_LIST.stream()
    			.filter(e -> Name.equals(e.FirstName()))
    			.toList();
    }
    //crear
    public synchronized Empleado createEmpleado(Empleado empleado) {
    	empleados_LIST.add(empleado);
    	return empleado;
    }
    //editar
    public synchronized Empleado updateEmpleado(int id, Empleado empleado) {
    	empleados_LIST.stream().filter(e -> e.EmployeeId() == id)
    	.findFirst()
    	.ifPresent(e ->{
    		empleados_LIST.set(empleados_LIST.indexOf(e), empleado);
    	});
    	return empleado;
    }
    public synchronized Empleado delete(int id) {
    	AtomicReference<Empleado> empleado = new AtomicReference<>();
    	empleados_LIST.stream()
    	.filter(e -> e.EmployeeId() == id )
    	.findFirst()
    	.ifPresent(e ->{
    		empleados_LIST.remove(e);
    		empleado.set(e);
    	});
    	return empleado.get();
    }*/
	
	private List<Employee> empleados_LIST = new ArrayList<>();
	
	@PostConstruct
    public void init() {
        empleados_LIST = new ArrayList<>(List.of(
            new Employee(
                9, "Fernando", "Cruz", LocalDate.of(1987, 9, 15), "Male", "Bolivian",
                "78901234", "+591 7123 4575", "fernando.cruz@empresa.com", "Calle del Mar 456, Cochabamba",
                "url_to_Photo_9", false, LocalDate.of(2015, 6, 30), LocalDate.of(2015, 6, 30), LocalDate.of(2023, 1, 10)
            ),
            new Employee(
                10, "Gabriela", "Salazar", LocalDate.of(1992, 1, 20), "Female", "Bolivian",
                "89012345", "+591 7123 4576", "gabriela.salazar@empresa.com", "Calle de la Unión 789, Sucre",
                "url_to_Photo_10", true, LocalDate.of(2021, 4, 25), LocalDate.of(2021, 4, 25), LocalDate.of(2023, 1, 10)
            ),
            new Employee(
                11, "Javier", "Mendoza", LocalDate.of(1983, 5, 5), "Male", "Bolivian",
                "90123456", "+591 7123 4577", "javier.mendoza@empresa.com", "Calle de la Libertad 321, Tarija",
                "url_to_Photo_11", true, LocalDate.of(2019, 8, 15), LocalDate.of(2019, 8, 15), LocalDate.of(2023, 1, 10)
            ),
            new Employee(
                12, "Claudia", "Paredes", LocalDate.of(1991, 10, 10), "Female", "Bolivian",
                "01234567", "+591 7123 4578", "claudia.paredes@empresa.com", "Calle de la Esperanza 654, Potosí",
                "url_to_Photo_12", false, LocalDate.of(2020, 12, 1), LocalDate.of(2020, 12, 1), LocalDate.of(2023, 1, 10)
            ),
            new Employee(
                13, "Andrés", "Vargas", LocalDate.of(1986, 3, 3), "Male", "Bolivian",
                "12345678", "+591 7123 4579", "andres.vargas@empresa.com", "Calle del Sol 456, Cochabamba",
                "url_to_Photo_13", true, LocalDate.of(2018, 7, 20), LocalDate.of(2018, 7, 20), LocalDate.of(2023, 1, 10)
            ),
            new Employee(
                14, "Patricia", "Soto", LocalDate.of(1994, 11, 11), "Female", "Bolivian",
                "23456789", "+591 7123 4580", "patricia.soto@empresa.com", "Calle de la Paz 789, La Paz",
                "url_to_Photo_14", false, LocalDate.of(2021, 3, 1), LocalDate.of(2021, 3, 1), LocalDate.of(2023, 1, 10)
            ),
            new Employee(
                15, "Ricardo", "Gutiérrez", LocalDate.of(1989, 8, 20), "Male", "Bolivian",
                "34567890", "+591 7123 4581", "ricardo.gutierrez@empresa.com", "Calle del Río 321, Tarija",
                "url_to_Photo_15", true, LocalDate.of(2017, 9, 12), LocalDate.of(2017, 9, 12), LocalDate.of(2023, 1, 10)
            )
        ));
    }
	
	//@Autowired
	//private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmpleados(){
		 return new ArrayList<>(empleados_LIST);
	}
	
	public Employee findById(Integer Id) {
		 return empleados_LIST.stream()
	                .filter(e -> e.getEmployeeId() != null && e.getEmployeeId() == Id)
	                .findFirst()
	                .orElseThrow(() -> new RuntimeException("Empleado no encontrado con ID: " + Id));
	}
	
	public List<Employee> findName(String name) {
        return empleados_LIST.stream()
                .filter(e -> name != null && name.equals(e.getFirstName()))
                .collect(Collectors.toList());
    }
	
	public synchronized Employee createEmpleado(Employee empleado) {
        // Asignar nuevo ID
        int maxId = empleados_LIST.stream()
                .mapToInt(e -> e.getEmployeeId() != null ? e.getEmployeeId() : 0)
                .max()
                .orElse(8); // último ID en tus datos es 15, pero por si acaso
        empleado.setEmployeeId(maxId + 1);
        empleado.setCreatedAt(LocalDate.now());
        empleado.setUpdatedAt(LocalDate.now());
        empleados_LIST.add(empleado);
        return empleado;
    }
	
	public synchronized Employee updateEmpleado(int id, Employee empleadoActualizado) {
        Employee existente = findById(id);
        // Actualizar campos
        existente.setFirstName(empleadoActualizado.getFirstName());
        existente.setLastName(empleadoActualizado.getLastName());
        existente.setDateOfBirth(empleadoActualizado.getDateOfBirth());
        existente.setGender(empleadoActualizado.getGender());
        existente.setNationality(empleadoActualizado.getNationality());
        existente.setDocumentId(empleadoActualizado.getDocumentId());
        existente.setPhone(empleadoActualizado.getPhone());
        existente.setEmail(empleadoActualizado.getEmail());
        existente.setAddress(empleadoActualizado.getAddress());
        existente.setPhoto(empleadoActualizado.getPhoto());
        existente.setStatus(empleadoActualizado.getStatus());
        existente.setHireDate(empleadoActualizado.getHireDate());
        existente.setUpdatedAt(LocalDate.now());
        return existente;
    }
	
	public synchronized Employee delete(int id) {
        AtomicReference<Employee> empleado = new AtomicReference<>();
        empleados_LIST.removeIf(e -> {
            if (e.getEmployeeId() != null && e.getEmployeeId() == id) {
                empleado.set(e);
                return true;
            }
            return false;
        });
        if (empleado.get() == null) {
            throw new RuntimeException("Empleado no encontrado con ID: " + id);
        }
        return empleado.get();
    }
	
	 // ─── Mapeo: Entity → DTO ────────────────────────────────
    private EmployeeDTO toDTO(Employee e) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setEmployeeId(e.getEmployeeId());
        dto.setFirstName(e.getFirstName());
        dto.setLastName(e.getLastName());
        dto.setDateOfBirth(e.getDateOfBirth());
        dto.setGender(e.getGender());
        dto.setNationality(e.getNationality());
        dto.setDocumentId(e.getDocumentId());
        dto.setPhone(e.getPhone());
        dto.setEmail(e.getEmail());
        dto.setAddress(e.getAddress());
        dto.setPhoto(e.getPhoto());
        dto.setStatus(e.getStatus());
        dto.setHireDate(e.getHireDate());
        dto.setCreatedAt(e.getCreatedAt());
        dto.setUpdatedAt(e.getUpdatedAt());
        return dto;
    }

    // ─── Mapeo: DTO → Entity ────────────────────────────────
    private Employee toEntity(EmployeeDTO dto) {
        Employee e = new Employee();
        e.setFirstName(dto.getFirstName());
        e.setLastName(dto.getLastName());
        e.setDateOfBirth(dto.getDateOfBirth());
        e.setGender(dto.getGender());
        e.setNationality(dto.getNationality());
        e.setDocumentId(dto.getDocumentId());
        e.setPhone(dto.getPhone());
        e.setEmail(dto.getEmail());
        e.setAddress(dto.getAddress());
        e.setPhoto(dto.getPhoto());
        e.setStatus(dto.getStatus() != null ? dto.getStatus() : true);
        e.setHireDate(dto.getHireDate());
        return e;
    }
	
}
