package sena.springbootapp.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sena.springbootapp.model.User;
import sena.springbootapp.model.UserPatch;
import sena.springbootapp.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	//injectamos el servcio de usuario para usarlo
	private UserService userService;
		
	public UserController(UserService userService) {
		this.userService = userService;
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getUsers(){
		List<User> users = this.userService.getUsers();
		return ResponseEntity.ok(users);
	}
	
//filtro con rutas
	@GetMapping("/getUserById/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id){
			User userFind = this.userService.findById(id);
			return ResponseEntity.ok(userFind);			
	}
	//filtro con query paa mostrar una lista de usuario mediante nombre
	@GetMapping("/getUserByName/search")
	public ResponseEntity<List<User>> getUserByName(@RequestParam(required = true) String name){
		var user = this.userService.findName(name);
		return ResponseEntity.ok(user);
	}
	//para guardar datos
	@PostMapping("/createUsers")
	public ResponseEntity<User> createUsers(@RequestBody User user){
		var users = this.userService.createUsers(user);
		return ResponseEntity.ok(users);
	}
	//para editar un valor especifico
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user){
		var users = this.userService.updateUsers(id,user);
		return ResponseEntity.ok(users);
	}
	
	@PatchMapping("/pathUsers/{id}")
	public ResponseEntity<User> pathUsers(@PathVariable int id, @RequestBody UserPatch userpatch){
		var userResult = this.userService.patchUsers(id, userpatch);
		return ResponseEntity.ok(userResult);
	}
	
	@DeleteMapping("/deleted/{id}")
	public ResponseEntity<User> deleted(@PathVariable int id){
		var userResult = this.userService.deleted(id);
		return ResponseEntity.ok(userResult);
	}
}
