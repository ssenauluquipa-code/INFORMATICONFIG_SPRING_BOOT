package sena.springbootapp.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.springbootapp.services.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(
	    origins = "http://localhost:4200",
	    allowCredentials = "true"
	)
public class AuthController {
	private final AuthService authService;


    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login (@RequestBody Map<String, String> request){
        String email = request.get("email");
        String password = request.get("password");
        String token = authService.login(email, password);
        if(token != null){
            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return ResponseEntity.ok(response);
        }else {
            return ResponseEntity.status(401).body("Credencial invalidas");
        }
    }
    //se mejoro el codigo

}
