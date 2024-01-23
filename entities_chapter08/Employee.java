package entities_chapter08;

public class Employee{
	public String Name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary-tax;
	}
	public void IncreaseSalary(double percentage) {
		this.grossSalary += this.grossSalary*(percentage/100);
	}
}