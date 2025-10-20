package sena.springbootapp.DTO;

import lombok.Data;

@Data
public class JwtResponse {
	private String token;
	private String rol;
	private String email;
}
