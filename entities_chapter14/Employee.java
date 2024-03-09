package entities_chapter14;

public class Employee {
	private String name;
	protected Double hours;
	protected Double valuePerHour;
	
	//default
	public Employee() {
	}
	public Employee(String name, Double hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHours() {
		return hours;
	}
	public void setHours(Double hours) {
		this.hours = hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Double payment() {
		return (double)(valuePerHour*hours);
	}
}