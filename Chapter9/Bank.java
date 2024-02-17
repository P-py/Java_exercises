package chapter09;

import entities_chapter09.BankAccount;
import java.util.Locale;
import java.util.Scanner;

public class Bank{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String option;
		String menuOption = "";
		double initialDeposit = 0;
		
		System.out.printf("Enter account number: ");
		int number = sc.nextInt();
		System.out.printf("\nEnter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		do {
			System.out.printf("\nWill there be a initial deposit (y/n)? ");
			option = sc.nextLine();
			if (option.equals("y")) {
				System.out.printf("Initial deposit value: ");
				initialDeposit = sc.nextDouble();
			}
			else if (option.equals("n")){
				initialDeposit = 0;
			}
		}while(!(option.equals("y")||option.equals("n")));
		
		BankAccount account = new BankAccount(number, holder, initialDeposit);
		System.out.println();
		System.out.println(account.toString());
		
		System.out.println("-MENU-");
		System.out.println("1 - Deposit");
		System.out.println("2 - Withdraw");
		System.out.println("3 - Change holder name");
		System.out.println("4 - Exit");
		
		do {
			sc.nextLine();
			System.out.printf("\nOperation option: ");
			menuOption = sc.nextLine();
			
			if (menuOption.equals("1")) {
				System.out.printf("\nEnter a deposit value: ");
				double depositValue = sc.nextDouble();
				account.balanceDeposit(depositValue);
				System.out.println(account.toString());
				sc.nextLine();
			}
			else if (menuOption.equals("2")) {
				System.out.printf("\nEnter a value to withdraw: ");
				double withdrawValue = sc.nextDouble();
				account.balanceWithdraw(withdrawValue);
				System.out.println(account.toString());
				sc.nextLine();
			}
			else if (menuOption.equals("3")) {
				System.out.printf("\nEnter new holder name: ");
				String newHolderName = sc.nextLine();
				account.setName(newHolderName);
				System.out.println(account.toString());
			}
			else if (menuOption.equals("4")) {
				System.out.println("Exiting...");
			}
			
		}while(!(menuOption.equals("4")));
		sc.close();
	}
}