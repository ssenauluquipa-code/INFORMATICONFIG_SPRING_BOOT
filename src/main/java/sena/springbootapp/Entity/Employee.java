package sena.springbootapp.Entity;

import java.time.LocalDate;

public class Employee {
	 		    
	 private Integer employeeId;
	    private String firstName;
	    private String lastName;
	    private LocalDate dateOfBirth;
	    private String gender;
	    private String nationality;
	    private String documentId;
	    private String phone;
	    private String email;
	    private String address;
	    private String photo;
	    private Boolean status = true;
	    private LocalDate hireDate;
	    private LocalDate createdAt;
	    private LocalDate updatedAt;

	    // Constructor vacío
	    public Employee() {}

	    // Constructor con parámetros
	    public Employee(Integer employeeId, String firstName, String lastName, LocalDate dateOfBirth, String gender,
	                    String nationality, String documentId, String phone, String email, String address, String photo,
	                    Boolean status, LocalDate hireDate, LocalDate createdAt, LocalDate updatedAt) {
	        this.employeeId = employeeId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	        this.gender = gender;
	        this.nationality = nationality;
	        this.documentId = documentId;
	        this.phone = phone;
	        this.email = email;
	        this.address = address;
	        this.photo = photo;
	        this.status = status;
	        this.hireDate = hireDate;
	        this.createdAt = createdAt;
	        this.updatedAt = updatedAt;
	    }

	    // Getters y Setters (en camelCase)
	    public Integer getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(Integer employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public LocalDate getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(LocalDate dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getNationality() {
	        return nationality;
	    }

	    public void setNationality(String nationality) {
	        this.nationality = nationality;
	    }

	    public String getDocumentId() {
	        return documentId;
	    }

	    public void setDocumentId(String documentId) {
	        this.documentId = documentId;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getPhoto() {
	        return photo;
	    }

	    public void setPhoto(String photo) {
	        this.photo = photo;
	    }

	    public Boolean getStatus() {
	        return status;
	    }

	    public void setStatus(Boolean status) {
	        this.status = status;
	    }

	    public LocalDate getHireDate() {
	        return hireDate;
	    }

	    public void setHireDate(LocalDate hireDate) {
	        this.hireDate = hireDate;
	    }

	    public LocalDate getCreatedAt() {
	        return createdAt;
	    }

	    public void setCreatedAt(LocalDate createdAt) {
	        this.createdAt = createdAt;
	    }

	    public LocalDate getUpdatedAt() {
	        return updatedAt;
	    }

	    public void setUpdatedAt(LocalDate updatedAt) {
	        this.updatedAt = updatedAt;
	    }

}
