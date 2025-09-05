package sena.springbootapp.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.stereotype.Service;

import sena.springbootapp.model.User;
import sena.springbootapp.model.UserPatch;

@Service
public class UserService {
	//se aumento el arraylist para poder agregar datos, pero no es buena practica cuadno se use en produccion
	private static final List<User> USERS = new ArrayList<>( List.of(
			new User(1, "pepe", "soliz ", LocalDate.now(), BigDecimal.valueOf(200.2), true),
			new User(2, "juan", "montes ", LocalDate.now(), BigDecimal.valueOf(200.2), true),
			new User(3, "camila", "gomez ", LocalDate.now(), BigDecimal.valueOf(200.2), false),
			new User(4, "camila", "manzilla ", LocalDate.now(), BigDecimal.valueOf(200.2), false),
			new User(5, "pepe", "aguilar ", LocalDate.now(), BigDecimal.valueOf(200.2), false)
			));
	
	public List<User> getUsers(){
		return USERS;
	}
	
	public User findById(int id){
		return USERS.stream()
				.filter(u -> u.id() == id)
				.findFirst()
				.orElse(null);
	}
	
	public List<User> findName(String name){
		return USERS.stream()
				.filter(u ->  name.equals(u.name()))
				.toList();
	}
	
	public synchronized User createUsers(User user) {
		 USERS.add(user);
		 return user;
	}
	
	public synchronized User updateUsers(int id, User user) {
		USERS.stream().filter(u -> u.id() == id)
		.findFirst()
		.ifPresent(u ->{
			USERS.set(USERS.indexOf(u), user);
		});
		return user;
	}
	
	public synchronized User patchUsers(int id, UserPatch userPatch) {
		AtomicReference<User> user = new AtomicReference<>();
		USERS.stream().filter(u -> u.id() == id)
		.findFirst()
		.ifPresent(u ->{
			User newUser = new User(u.id(), userPatch.name(), u.lastName(), u.birthDay(), userPatch.salary(), true);
			USERS.set(USERS.indexOf(u), newUser);
			user.set(newUser);
		});
		return user.get();
	}
	public synchronized User deleted(int id) {
		AtomicReference<User> user = new AtomicReference<>();
		USERS.stream()
		.filter(u -> u.id() == id)
		.findFirst()
		.ifPresent(u ->{
			USERS.remove(u);
			user.set(u);
		});
		return user.get();
	}
}
