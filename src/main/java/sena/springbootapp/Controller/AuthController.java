package sena.springbootapp.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.springbootapp.DTO.AuthResponse;
import sena.springbootapp.DTO.LoginRequest;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth")
public class AuthController {

	 private final AuthenticationManager authenticationManager;

	    public AuthController(AuthenticationManager authenticationManager) {
	        this.authenticationManager = authenticationManager;
	    }

	    @PostMapping("/login")
	    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
	        try {
	            Authentication authentication = authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(
	                    request.getUserName(),
	                    request.getPassword()
	                )
	            );
	            SecurityContextHolder.getContext().setAuthentication(authentication);
	            return ResponseEntity.ok(new AuthResponse(true, "Login exitoso", request.getUserName()));
	        } catch (Exception e) {
	            return ResponseEntity.status(401).body(new AuthResponse(false, "Credenciales inválidas"));
	        }
	    }

	    @PostMapping("/logout")
	    public ResponseEntity<AuthResponse> logout() {
	        SecurityContextHolder.clearContext();
	        return ResponseEntity.ok(new AuthResponse(true, "Logout exitoso"));
	    }
}
