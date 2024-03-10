package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities_chapter14.Product;
import entities_chapter14.UsedProduct;
import entities_chapter14.ImportedProduct;

public class ProductRegister{
	static Scanner sc = new Scanner(System.in);
	
	public static void addProduct(List<Product> productList) {
		System.out.printf("Name: ");
		String name = sc.nextLine();
		System.out.printf("Price: ");
		Double price = Double.valueOf(sc.nextLine());
		Product productObj = new Product(name, price);
		productList.add(productObj);
		System.out.println("Product successfully added to database.");
	}
	public static void addImportedProduct(List<Product> productList) {
		System.out.printf("Name: ");
		String name = sc.nextLine();
		System.out.printf("Price: ");
		Double price = Double.valueOf(sc.nextLine());
		System.out.printf("Customs fee: ");
		Double customsFee = Double.valueOf(sc.nextLine());
		Product importedProductObj = new ImportedProduct(name, price, customsFee);
		productList.add(importedProductObj);
		System.out.println("Product successfully added to database.");
	}
	public static void addUsedProduct(List<Product> productList) {
		System.out.printf("Name: ");
		String name = sc.nextLine();
		System.out.printf("Price: ");
		Double price = Double.valueOf(sc.nextLine());
		System.out.printf("Manufacture date (DD/MM/YYYY):  ");
		String date = sc.nextLine();
		Product usedProductObj = new UsedProduct(name, price, date);
		productList.add(usedProductObj);
		System.out.println("Product successfully added to database.");
	}
	public static void viewDatabase(List<Product> productList) {
		System.out.println("\n-PRODUCT LIST-");
		for (Product productObj : productList) {
			System.out.println(productObj.priceTag());
		}
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> productList = new ArrayList<>();
		
		System.out.printf("\nEnter the number of products to be registered: ");
		int amount = Integer.valueOf(sc.nextLine());
		
		for (int i=0; i<amount; i++) {
			System.out.printf("\nProduct #%d data:\n", i+1);
			String option;
			do {
				System.out.printf("Commoun, used or imported (c/u/i)? ");
				option = sc.nextLine();
			}while(!(option.toLowerCase().equals("c"))&&!(option.toLowerCase().equals("u"))&&!(option.toLowerCase().equals("i")));
			switch(option.toLowerCase()) {
				case "c":
					addProduct(productList);
					break;
				case "u":
					addUsedProduct(productList);
					break;
				case "i":
					addImportedProduct(productList);
					break;
			}
		}	
		viewDatabase(productList);
		sc.close();
	}
}