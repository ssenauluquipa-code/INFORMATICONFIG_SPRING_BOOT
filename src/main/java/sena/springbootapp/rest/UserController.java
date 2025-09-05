package sena.springbootapp.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.springbootapp.model.User;
import sena.springbootapp.services.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {
	
	//injectamos el servcio de usuario para usarlo
	private UserService userService;
		
	public UserController(UserService userService) {
		this.userService = userService;
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(){
		List<User> users = this.userService.getUsers();
		return ResponseEntity.ok(users);
	}
}
