package sena.springbootapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import sena.springbootapp.customexception.UserNotFoundException;
import sena.springbootapp.rest.model.GenericErrorDTO;

@ControllerAdvice
public class ExceptionManager {
	
	@ExceptionHandler(IllegalArgumentException.class)
	protected ResponseEntity<GenericErrorDTO> handleIllegalArgument(IllegalArgumentException exception){
		//ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, exception.getMessage());
		GenericErrorDTO genericErrorDTO = new GenericErrorDTO(HttpStatus.NOT_FOUND.name(), exception.getMessage(),"");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(genericErrorDTO);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	protected ResponseEntity<GenericErrorDTO> handleIllegalArgument(UserNotFoundException exception){
		//ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, exception.getMessage());
		GenericErrorDTO genericErrorDTO = new GenericErrorDTO(exception.getCode().toString(), exception.getMessage(), exception.getDescription());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(genericErrorDTO);
	}
}
