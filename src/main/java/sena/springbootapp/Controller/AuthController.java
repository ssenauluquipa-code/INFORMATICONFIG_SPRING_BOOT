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

//@RestController
//@RequestMapping("/api/auth")
public class AuthController {
//	private final AuthenticationManager authenticationManager;
//
//	public AuthController(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
//    	try {
//            // 1. Crea un token de autenticación con las credenciales del request
//            UsernamePasswordAuthenticationToken authToken =
//                new UsernamePasswordAuthenticationToken(
//                    request.getUserName(),
//                    request.getPassword()
//                );
//
//            // 2. Autentica al usuario usando el AuthenticationManager
//            Authentication authentication = authenticationManager.authenticate(authToken);
//
//            // 3. Guarda la autenticación en el contexto de seguridad (crea sesión)
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//
//            // 4. Devuelve respuesta de éxito
//            return ResponseEntity.ok(
//                new AuthResponse(true, "Login exitoso", request.getUserName())
//            );
//
//        } catch (Exception e) {
//            // 5. Si falla la autenticación, devuelve error 401
//            return ResponseEntity.status(401)
//                .body(new AuthResponse(false, "Credenciales inválidas"));
//        }
//    }
//
//    @PostMapping("/logout")
//    public ResponseEntity<AuthResponse> logout() {
//        SecurityContextHolder.clearContext();
//        return ResponseEntity.ok(new AuthResponse(true, "Logout exitoso"));
//    }
}
