package entities_chapter13;

import entities.enums.WorkerLevel;
import java.util.List;
import java.util.ArrayList;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}
	public Worker(String inputName, WorkerLevel inputLevel, Double inputSalary, Department inputDepartment) {
		this.name = inputName;
		this.level = inputLevel;
		this.baseSalary = inputSalary;
		this.department = inputDepartment;
	}
	public String getName() {
		return name;
	}
	public void setName(String inputName) {
		this.name = inputName;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel inputLevel) {
		this.level = inputLevel;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double inputBaseSalary) {
		this.baseSalary = inputBaseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department inputDepartment) {
		this.department = inputDepartment;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	public void addContracts(HourContract inputContract) {
		contracts.add(inputContract);
	}
	public void removeContracts(HourContract inputContract) {
		contracts.remove(inputContract);
	}
	public Double income(int inputYear, int inputMonth) {
		double sumIncome=baseSalary;
		for (HourContract contract : contracts) {
			if ((contract.getDateTime().getYear()==inputYear)&&(contract.getDateTime().getMonthValue()==inputMonth)){
				sumIncome += (contract.totalValue());
			}
		}
		return sumIncome;
	}
}
