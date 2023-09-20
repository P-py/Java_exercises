package chapter04;

import java.util.Locale;
import java.util.Scanner;

public class Ex04{
	public static void main(String[] args){
		//config
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//variables
		int number, hours_worked;
		float salary_per_hour;
		float salary;
		
		System.out.println("Type in the following data of the worker: ");
		System.out.println("-> Number");
		System.out.println("-> Worked hours");
		System.out.println("-> Salary per hour");
		
		System.out.print("\n->");
		number = sc.nextInt();
		
		System.out.print("->");
		hours_worked = sc.nextInt();
		
		System.out.print("->");
		salary_per_hour = sc.nextFloat();
		
		salary = hours_worked*salary_per_hour;
		
		System.out.printf("\nNUMBER = %d\n", number);
		System.out.printf("SALARY = $%.2f", salary);
		
		sc.close();
	}
}