package chapter14;

import entities_chapter14.Account;
import entities_chapter14.BusinessAccount;
import entities_chapter14.SavingsAccount;

public class Main{
	public static void main(String[] args) {
		Account acc = new Account(1001, "Pedro", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "João", 0.0, 5000.0, 0.0);
		
		//UPCASTING
		Account acc2 = bacc;
		Account acc3 = new BusinessAccount(1003, "Augusto", 0.0, 2000.0, 0.0);
		Account acc4 = new SavingsAccount(1004, "Carlos", 0.0, 0.25);
		
		//DOWNCASTING
		BusinessAccount bacc2 = (BusinessAccount) acc2;


		if (acc4 instanceof BusinessAccount) {
			BusinessAccount bacc3 = (BusinessAccount) acc4;
		}
		else if (acc4 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc4;
		}
		
		Account acc5 = new Account(1005, "Luiz", 1000.0);
		acc5.withdraw(100.0);
		System.out.println(acc5.getBalance());
		
		Account acc6 = new SavingsAccount(1006, "Ronaldo", 1000.0, 0.25);
		acc6.withdraw(100.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new BusinessAccount(1007, "JG", 1000.0, 0.0, 0.0);
		acc7.withdraw(100.0);
		System.out.println(acc7.getBalance());
	}
}