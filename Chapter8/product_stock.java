package chapter08;

import java.util.Scanner;
import java.util.Locale;

import entities_chapter08.Product;

public class product_stock{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String answer = "n";
		int operationAmount;
		String operation;

		
		System.out.println("Enter product data:");
		System.out.printf("\nName: ");
		String name = sc.nextLine();
		System.out.printf("\nPrice: ");
		double price = sc.nextDouble();
		System.out.printf("\nInitial amount of the product: ");
		int quantity = sc.nextInt();
		
		Product produto1 = new Product(name, price, quantity);
		
		do {
			sc.nextLine();
			System.out.printf("##Product data update##\n");
			System.out.printf("%s, $%.2f, %d units, Total: %.2f\n", produto1.name, produto1.price, produto1.quantity, produto1.totalValueInStock());
			System.out.printf("Do you want to mod the stock? (y/n): ");
			answer = sc.nextLine();
			if (answer.equals("y")) {
				System.out.printf("\nOperation type (a to add, r to remove): ");
				operation = sc.next();
				if (operation.equals("a")) {
					System.out.printf("\nOperation amount: ");
					operationAmount = sc.nextInt();
					produto1.addProducts(operationAmount);
				}
				else if (operation.equals("r")) {
					System.out.printf("\nOperation amount: ");
					operationAmount = sc.nextInt();
					produto1.addProducts(operationAmount);
				}
			}
			else if (answer.equals("n")){
				System.out.printf("...\n");
			}
		}while(!(answer.equals("n")));
		
		
		sc.close();
	}
}