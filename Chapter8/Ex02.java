package chapter08;

import java.util.Scanner;
import java.util.Locale;
import entities_chapter08.Employee; 

public class Ex02{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee1 = new Employee();
		
		System.out.printf("\nName:");
		employee1.Name = sc.nextLine();
		System.out.printf("\nGross Salary: ");
		employee1.grossSalary = sc.nextDouble();
		System.out.printf("\nTax: ");
		employee1.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee #1: %s, $%.2f", employee1.Name, employee1.netSalary());
		System.out.printf("\nWhich percentage to increase salary?");
		employee1.IncreaseSalary(sc.nextDouble());
		
		System.out.printf("\nEmployee #1 data update: %s, $%.2f", employee1.Name, employee1.netSalary());
		
		sc.close();
	}
}