package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_chapter14.Business;
import entities_chapter14.IndividualPayer;
import entities_chapter14.TaxPayer;

public class TaxCalculator{
	static Scanner sc = new Scanner(System.in);
	public static void menuOptions() {
		System.out.println("\n-MENU-");
		System.out.println("1 - Register individual tax payer");
		System.out.println("2 - Register company");
		System.out.println("3 - Delete registered individual/company");
		System.out.println("4 - View taxes");
		System.out.println("6 - Exit");
	}
	public static void addIndividual(List<TaxPayer> payersList) {
		System.out.printf("Individual's full name: ");
		String name = sc.nextLine();
		System.out.printf("Last year total income: ");
		double income = Double.valueOf(sc.nextLine());
		System.out.printf("Health expenses: ");
		double expenses = Double.valueOf(sc.nextLine());
		TaxPayer individualObj = new IndividualPayer(name, income, expenses);
		payersList.add(individualObj);
		System.out.println("\nTax payer successfully registered.");
	}
	public static void addCompany(List<TaxPayer> payersList) {
		System.out.printf("Company name as registered: ");
		String name = sc.nextLine();
		System.out.printf("Last year total income: ");
		double income = Double.valueOf(sc.nextLine());
		System.out.printf("Number of employees: ");
		int numberofEmployees = Integer.valueOf(sc.nextLine());
		TaxPayer companyObj = new Business(name, income, numberofEmployees);
		payersList.add(companyObj);
		System.out.println("\nTax payer successfully registered.");
	}
	public static void deleteRegister(List<TaxPayer> payersList) {
		if (payersList.isEmpty()) {
			System.out.println("\nYour payers database is empty - Can't delete any.");
		}
		else {
			viewTaxes(payersList);
			System.out.printf("\nType in the id to delete ('c' to cancel): ");
			String option = sc.nextLine();
			switch(option.toUpperCase()) {
				case "C":
					System.out.println("Operation canceled.");
					break;
				default:
					payersList.remove((Integer.valueOf(option))-1);
					System.out.println("Tax register successfully removed.");
					break;
			}
		}
	}
	public static void viewTaxes(List<TaxPayer> payersList) {
		if (payersList.isEmpty()) {
			System.out.println("\nYour payers database is empty - Can't view taxes.");
		}
		else {
			System.out.printf("\n-PAYERS LIST-");
			double taxSum = 0;
			int count = 0;
			for (TaxPayer payer : payersList) {
				System.out.printf("\nID %d - %s - income of $%.2f - tax debt of $%.2f", count+1, payer.getName(), payer.getIncome(), payer.tax());
				taxSum += payer.tax();
				count++;
			}
			System.out.printf("\n\nTOTAL TAXES: %.2f", taxSum);
		}
	}
	public static void dataOptionsIndividual() {
		System.out.println("1 - Name");
		System.out.println("2 - Income");
		System.out.println("3 - Expenses");
	}
	public static void dataOptionsBusiness() {
		System.out.println("1 - Name");
		System.out.println("2 - Income");
		System.out.println("3 - Number of employees");
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<TaxPayer> payersList = new ArrayList<>();
		
		String option;
		do {
			menuOptions();
			System.out.printf("\nType in action id: ");
			option = sc.nextLine();
			switch(Integer.valueOf(option)) {
				case 1: 
					addIndividual(payersList);
					break;
				case 2:
					addCompany(payersList);
					break;
				case 3:
					deleteRegister(payersList);
					break;
				case 4:
					viewTaxes(payersList);
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.printf("\nPlease type in a valid option/action.");
			}
		}while(Integer.valueOf(option)!=6);
		
		
		sc.close();
	}
}