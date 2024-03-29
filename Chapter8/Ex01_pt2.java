package chapter08;

import java.util.Scanner;
import java.util.Locale;

import util.CurrencyConverter;

public class Ex01_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("\nAmount to be paid in R$: %.2f", result);
		
		sc.close();
	}
}