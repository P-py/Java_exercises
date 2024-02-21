package chapter10;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import entities_chapter10.Employee;

public class Ex13{
	public static List<Employee> filterListById(List<Employee> employeeList, int id) {
		List<Employee> resultList = employeeList.stream().filter(x -> x.getId()==id).collect(Collectors.toList());
		return resultList;
	}
	public static void addEmployee(List<Employee> employeeList, Scanner sc){
		System.out.println("\nNew employee data: ");
		System.out.printf("Id: ");
		int inputId = sc.nextInt();
		List<Employee> resultList;
		do {
			resultList = filterListById(employeeList, inputId);
			if (resultList.size()!=0) {
				System.out.printf("Please type in another id, this one is been used: ");
				inputId = sc.nextInt();
				resultList = filterListById(employeeList, inputId);
			}
		}while(resultList.size()!=0);
		System.out.printf("Name: ");
		sc.nextLine();
		String inputName = sc.nextLine();
		System.out.printf("Salary: ");
		double inputSalary = sc.nextDouble();
		Employee employeeObj = new Employee(inputId, inputName, inputSalary);
		employeeList.add(employeeObj);
	}
	public static void removeEmployee(List<Employee> employeeList, Scanner sc) {
		System.out.printf("\nType in employee's id: ");
		int inputId = sc.nextInt();
		Employee resultEmployee = employeeList.stream().filter(x -> x.getId()==inputId).findFirst().orElse(null);
		int resultPosition = employeeList.indexOf(resultEmployee);
		if (resultEmployee==null) {
			System.out.printf("\nEmployee does not exist in the system.");
		}
		else {
			System.out.println("Confirm employee data before delete: ");
			System.out.println(resultEmployee.toString());
			System.out.printf("\nDo you want to delete this employee from database (y/n)? ");
			char option = sc.next().charAt(0);
			switch(option) {
				case 'y':
					employeeList.remove(resultPosition);
					break;
				case 'n':
					System.out.println("Removing process canceled.");
					break;
			}
		}
	}
	public static void getEmployeeList(List<Employee> employeeList) {
		System.out.println("\nEmployee List: ");
		for (Employee employeeObj : employeeList) {
			System.out.println(employeeObj.toString());
		}
	}
	public static void updateSalary(List<Employee> employeeList, Scanner sc) {
		System.out.printf("\nType in employee's id to get a salary update: ");
		int inputId = sc.nextInt();
		Employee resultEmployee = employeeList.stream().filter(x -> x.getId()==inputId).findFirst().orElse(null);
		if (resultEmployee==null) {
			System.out.printf("\nEmployee does not exist in the system.");
		}
		else {
			double oldSalary = resultEmployee.getSalary();
			System.out.println("Confirm employee data before uptade: ");
			System.out.println(resultEmployee.toString());
			System.out.printf("\nDo you want to update this employee salary (y/n)? ");
			char option = sc.next().charAt(0);
			switch(option) {
				case 'y':
					System.out.println("\n1 - Raise");
					System.out.println("2 - Cut");
					System.out.printf("\nType in update type: ");
					int optionUpdate = sc.nextInt();
					switch (optionUpdate) {
						case 1:
							System.out.printf("\nRaise amount (in %%): ");
							double raisePercentage = sc.nextDouble();
							resultEmployee.raiseSalary(raisePercentage);
							System.out.printf("\nEmployee's salary was raised, old salary: %.2f, new salary: %.2f", oldSalary, resultEmployee.getSalary());
							break;
						case 2:
							System.out.printf("\nCut amount (in %%): ");
							double cutPercentage = sc.nextDouble();
							resultEmployee.cutSalary(cutPercentage);
							System.out.printf("\nEmployee's salary was cut, old salary: %.2f, new salary: %.2f", oldSalary, resultEmployee.getSalary());
							break;
					}
					break;
				case 'n':
					System.out.println("Removing process canceled.");
					break;
			}
		}
	}
	public static int menu(Scanner sc) {
		for (int i=0; i<3; i++) {
			System.out.println();
		}
		System.out.printf("\n---MENU---");
		System.out.printf("\n1 - Add new employee");
		System.out.printf("\n2 - Remove employee");
		System.out.printf("\n3 - Get employee list");
		System.out.printf("\n4 - Update salary");
		System.out.printf("\n5 - Exit");
		System.out.printf("\nSelect option: ");
		int option = sc.nextInt();
		return option;
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int option=0;
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.printf("\nFirst launch - initial configuration");
		System.out.printf("\nInitial amount of employees to be registered: ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("\nEmployee #"+(i+1)+": ");
			System.out.printf("Id: ");
			int inputId = sc.nextInt();
			List<Employee> resultList;
			do {
				resultList = filterListById(employeeList, inputId);
				if (resultList.size()!=0) {
					System.out.printf("Please type in another id, this one is been used: ");
					inputId = sc.nextInt();
					resultList = filterListById(employeeList, inputId);
				}
			}while(resultList.size()!=0);
			System.out.printf("Name: ");
			sc.nextLine();
			String inputName = sc.nextLine();
			System.out.printf("Salary: ");
			double inputSalary = sc.nextDouble();
			Employee employeeObj = new Employee(inputId, inputName, inputSalary);
			employeeList.add(employeeObj);
		}
		do {
			option = menu(sc);
			switch(option) {
				case 1:
					addEmployee(employeeList, sc);
					break;
				case 2:
					removeEmployee(employeeList, sc);
					break;
				case 3:
					getEmployeeList(employeeList);
					break;
				case 4:
					updateSalary(employeeList, sc);
					break;
				case 5:
					System.out.println("Exiting...");
					break;
			}
		}while(option!=5);
		sc.close();
	}
}