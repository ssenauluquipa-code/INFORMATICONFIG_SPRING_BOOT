package sena.springbootapp.model;

import java.time.LocalDate;

public record Empleado(
		Integer EmployeeId,        // ID del empleado
	    String FirstName,       // Nombre del empleado
	    String LastName,        // Apellido del empleado
	    LocalDate DateOfBirth,  // Fecha de nacimiento
	    String Gender,          // Género
	    String Nationality,     // Nacionalidad
	    String DocumentId,      // Documento de identidad
	    String Phone,           // Teléfono
	    String Email,           // Correo electrónico
	    String Address,         // Dirección
	    String Photo, // Foto (opcional)
	    Boolean Status,         // Estado
	    LocalDate HireDate,   // Fecha de contratación (opcional)
	    LocalDate CreatedAt,  // Fecha de creación (opcional)
	    LocalDate UpdatedAt   // Fecha de actualización (opcional)
		
		) {

}
