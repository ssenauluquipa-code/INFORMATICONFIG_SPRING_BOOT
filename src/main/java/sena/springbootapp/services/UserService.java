package sena.springbootapp.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import sena.springbootapp.model.User;

@Service
public class UserService {
	private static final List<User> USERS = List.of(
			new User(1, "pepe ", "soliz ", LocalDate.now(), BigDecimal.valueOf(200.2), true),
			new User(2, "juan ", "montes ", LocalDate.now(), BigDecimal.valueOf(200.2), true),
			new User(3, "camila ", "gomez ", LocalDate.now(), BigDecimal.valueOf(200.2), false)
			);
	
	public List<User> getUsers(){
		return USERS;
	}
}
