package sena.springbootapp.DTO;

public class AuthResponse {
	private boolean success;
	private String message;
	private String userName;
	
	public AuthResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	public AuthResponse(boolean success, String message, String userName) {
		super();
		this.success = success;
		this.message = message;
		this.userName = userName;
	}
	public boolean isSuccess() {
		return success;
	}
	public String getMessage() {
		return message;
	}
	public String getUserName() {
		return userName;
	}
	
	

}
