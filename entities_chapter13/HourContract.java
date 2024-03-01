package entities_chapter13;

import java.time.LocalDate;

public class HourContract {
	private LocalDate dateTime;
	private Double valuePerHour;
	private Integer hoursWorked;
	
	public HourContract() {
	}
	public HourContract(LocalDate inputDateTime, double inputValuePerHour, int inputHoursWorked) {
		this.dateTime = inputDateTime;
		this.valuePerHour = inputValuePerHour;
		this.hoursWorked = inputHoursWorked;
	}
	public LocalDate getDateTime() {
		return this.dateTime;
	}
	public double getValuePerHour() {
		return this.valuePerHour;
	}
	public int getHoursWorked() {
		return this.hoursWorked;
	}
	public void setDateTime(LocalDate inputDateTime) {
		this.dateTime = inputDateTime;
	}
	public void setValuePerHour(double inputValuePerHour) {
		this.valuePerHour = inputValuePerHour;
	}
	public void setHoursWorked(int inputHoursWorked) {
		this.hoursWorked = inputHoursWorked;
	}
	public Double totalValue() {
		return (valuePerHour*hoursWorked);
	}
}
