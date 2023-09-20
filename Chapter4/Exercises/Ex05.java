package chapter04;

import java.util.Locale;
import java.util.Scanner;

public class Ex05{
	public static void main(String[] args) {
		//config
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//variables and constants
		int code1, code2;
		int amount1, amount2;
		float price1, price2;
		float value;
		
		System.out.println("Type in the code, amount and price of 2 products.");
		System.out.println("The input should be in the format: [code] [amount] [price].");
		
		code1 = sc.nextInt();
		amount1 = sc.nextInt();
		price1 = sc.nextFloat();
		
		code2 = sc.nextInt();
		amount2 = sc.nextInt();
		price2 = sc.nextFloat();
		
		value = ((amount2*price2)+(amount1*price1));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", value);
		
		sc.close();
	}
}