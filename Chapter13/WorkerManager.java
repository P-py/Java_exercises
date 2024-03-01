package chapter13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import entities_chapter13.Department;
import entities_chapter13.HourContract;
import entities.enums.WorkerLevel;
import entities_chapter13.Worker;

public class WorkerManager{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatterYearMonth = DateTimeFormatter.ofPattern("MM/yyyy");
		DateTimeFormatter formatterDateContract = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Department department;
		String workerName;
		WorkerLevel level;
		double salary;
		int amountContracts;
		
		System.out.printf("\nEnter worker's department: ");
		department = new Department(sc.nextLine());
		System.out.printf("Enter worker's data: \n");
		System.out.printf("Name: ");
		workerName = sc.nextLine();
		System.out.printf("Level: ");
		level = WorkerLevel.valueOf(sc.nextLine());
		System.out.printf("Base salary: ");
		salary = sc.nextDouble();
		Worker worker = new Worker(workerName, level, salary, department);
		
		System.out.printf("Contracts for this worker: ");
		amountContracts = sc.nextInt();
		for (int i=0; i<amountContracts; i++) {
			System.out.printf("\nContract #%d data: \n", i+1);
			System.out.printf("\nDate (DD/MM/YYYY): ");
			sc.nextLine();
			LocalDate contractDate = LocalDate.parse(sc.nextLine(), formatterDateContract);
			System.out.printf("Value (per hour): ");
			double valuePerHour = sc.nextDouble();
			System.out.printf("Duration (hours): ");
			int hoursWorked = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hoursWorked);
			worker.addContracts(contract);
		}
		System.out.printf("Enter month and year to calculate income (MM/yyyy): ");
		sc.nextLine();
		YearMonth date = YearMonth.parse(sc.nextLine(), formatterYearMonth);
		System.out.println(worker.income(date.getYear(), date.getMonthValue()));
		
		sc.close();
	}
}