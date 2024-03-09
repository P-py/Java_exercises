package chapter14;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities_chapter14.Employee;
import entities_chapter14.OutsourcedEmployee;

public class Example{
	static Scanner sc = new Scanner(System.in);
	
	public static void initializeAddEmployee(List<Employee> employeeList, String name, double hoursWorked, double valuePerHour) {
		Employee employeeObj = new Employee(name, hoursWorked, valuePerHour);
		employeeList.add(employeeObj);
	}
	public static void initializeAddOutsourced(List<Employee> employeeList, String name, double hoursWorked, double valuePerHour) {
		System.out.printf("\nAdditional charge: ");
		double additionalCharge = sc.nextDouble();
		OutsourcedEmployee outsourcedObj = new OutsourcedEmployee(name, hoursWorked, valuePerHour, additionalCharge);
		employeeList.add(outsourcedObj);
	}
	public static void addEmployees(List<Employee> employeeList, int amount) {
		for (int i=0; i<amount; i++) {
			System.out.printf("\nEmployee %d data: \n", i+1);
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Hours worked: ");
			double hoursWorked = sc.nextDouble();
			System.out.printf("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			String option = null;
			do {
				System.out.printf("Outsourced (y/n)? ");
				sc.nextLine();
				option = sc.nextLine();
				switch(option.toUpperCase()){
					case "Y": 
						initializeAddOutsourced(employeeList, name, hoursWorked, valuePerHour);
						break;
					case "N":
						initializeAddEmployee(employeeList, name, hoursWorked, valuePerHour);
						break;
					default:
						System.out.println("This option ain't valid. Please type in 'y' or 'n'.");
						break;
				}
			}while(!(option.toUpperCase().equals("N"))&&!(option.toUpperCase().equals("Y")));
		}
	}
	public static void viewPayments(List<Employee> employeeList) {
		System.out.printf("\n-PAYMENTS-");
		for (Employee employee : employeeList) {
			System.out.printf("\n%s - %.2f", employee.getName(), employee.payment());
		}
		sc.nextLine();
	}
	public static void removeEmployee(List<Employee> employeeList) {
		if (employeeList.isEmpty()) {
			System.out.println("Your employee database is empty.");
		}
		else {
			System.out.printf("\n-EMPLOYEE LIST-");
			int count = 0;
			for (Employee employeeObj : employeeList) {
				System.out.printf("\n%s - worked %.2f hours - $%.2f/hour - id %d", employeeObj.getName(), employeeObj.getHours(),
						employeeObj.getValuePerHour(), count+1);
				count++;
			}
			String option = null;
			do {
				if (employeeList.isEmpty()) {
					System.out.println("Your employee database is empty.");
				}
				else { 
					System.out.printf("\nEnter employee id (type 'n'/'N' to cancel): ");
					option = sc.nextLine();
					if (!(option.toUpperCase().equals("N"))){
						int numberOption = Integer.valueOf(option);
						numberOption -= 1;
						employeeList.remove(numberOption);
						System.out.printf("Employee successfully removed.");
					}
				}
			}while(!(option.toUpperCase().equals("N"))&&!(employeeList.isEmpty()));
			
		}
	}
	public static void menuOptions() {
		System.out.printf("\n1 - Add employees");
		System.out.printf("\n2 - Remove employees");
		System.out.printf("\n3 - View payments");
		System.out.printf("\n4 - Exit");
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Employee> employeeList = new ArrayList<>();
		
		String option;
		do {
			if (employeeList.isEmpty()) {
				System.out.printf("\nYour employee-payment database is empty");
				sc.nextLine();
			}
			menuOptions();
			System.out.printf("\n\nType in the operation code: ");
			option = sc.nextLine();
			switch(Integer.valueOf(option)) {
				case 1:
					System.out.printf("\nType in the amount of workers to be "
							+ "registered: ");
					String amount = sc.nextLine();
					addEmployees(employeeList, Integer.valueOf(amount));
					break;
				case 2:
					removeEmployee(employeeList);
					break;
				case 3:
					viewPayments(employeeList);
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.printf("\nPlease, type in a valid command.");
					break;
				
			}
		}while(Integer.valueOf(option)!=4);
		
		sc.close();
	}
}