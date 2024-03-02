package entities_chapter13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	private String name;
	private String email;
	private LocalDate birthDate;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Client() {	
	}
	public Client(String inputName, String inputEmail, LocalDate inputBirthDate) {
		this.name = inputName;
		this.email = inputEmail;
		this.birthDate = inputBirthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return (birthDate.format(formatter));
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" ("+getBirthDate()+") - ");
		sb.append(email);
		return sb.toString();
	}
}