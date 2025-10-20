package sena.springbootapp.Entity;

import lombok.Data;

@Data
public class User {
	
	private Long id;
	private String userName;
	private String email;
	private String password;
	private String role;
	public User(Long id, String userName, String email, String password, String role) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	
}
