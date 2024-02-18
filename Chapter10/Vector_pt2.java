package chapter10;

import java.util.Locale;
import java.util.Scanner;
import entities_chapter10.Product;

public class Vector_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nNumber of products: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.printf("\nProduct #%d name: ", i+1);
			String name = sc.nextLine();
			System.out.printf("\nProduct #%d price: ", i+1);
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		System.out.printf("Average price: %.2f", sum/n);
		
		sc.close();
	}
}