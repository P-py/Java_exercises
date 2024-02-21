package entities_chapter10;

public class Employee{
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(int inputId, String inputName, double inputSalary) {
		this.id = inputId;
		this.name = inputName;
		this.salary = inputSalary;
	}
	public void setId(int inputId) {
		this.id = inputId;
	}
	public void setName(String inputName) {
		this.name = inputName;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getSalary() {
		return this.salary;
	}
	public String toString() {
		return (this.id+", "+this.name+", "+this.salary);
	}
	public void raiseSalary(double raisePercentage) {
		this.salary = this.salary*(1+(raisePercentage/100));
	}
	public void cutSalary(double cutPercentage) {
		this.salary = this.salary*(1-(cutPercentage/100));
	}
}