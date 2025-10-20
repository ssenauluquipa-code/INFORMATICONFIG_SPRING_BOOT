package sena.springbootapp.DTO;

import lombok.Data;

@Data
public class LoginRequest {
	private String email;
	private String pasword;
}
