package entities_chapter13;

public class Department {
	private String name;
	
	public Department() {
	}
	public Department(String inputName) {
		this.name = inputName;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String inputName) {
		this.name = inputName;
	}
}
