package entities_chapter10;

public class Rent{
	private String name, email;
	
	public Rent(String inputName, String inputEmail) {
		this.name = inputName;
		this.email = inputEmail;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setEmail(String inputEmail) {
		this.email = inputEmail;
	}
}