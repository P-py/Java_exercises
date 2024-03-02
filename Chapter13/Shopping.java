package chapter13;

import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import entities_chapter13.Order;
import entities_chapter13.OrderItem;
import entities_chapter13.Product;
import entities_chapter13.Client;

public class Shopping{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String name;
		String email;
		LocalDate birthDate;
		OrderStatus status;
		int itemsAmount;
		
		System.out.printf("Name: ");
		name = sc.nextLine();
		System.out.printf("Email: ");
		email = sc.nextLine();
		System.out.printf("Birth Date (DD/MM/YYYY): ");
		birthDate = LocalDate.parse(sc.nextLine(), formatter);
		Client clientObj = new Client(name, email, birthDate);
		
		System.out.printf("\nEnter order data: ");
		System.out.printf("\nStatus: ");
		status = OrderStatus.valueOf(sc.nextLine().toUpperCase());
		
		Order orderObj = new Order(LocalDateTime.now(), status, clientObj);
		
		System.out.printf("\nAmount of items in the order: ");
		itemsAmount = sc.nextInt();
		
		for (int i=0; i<itemsAmount; i++) {
			System.out.printf("\nEnter #%d data: \n", i+1);
			readOrderData(sc, orderObj);
		}
		
		System.out.println(orderObj);
		
		sc.close();
	}
	public static void readOrderData(Scanner sc, Order orderObj) {
		sc.nextLine();
		System.out.printf("Product name: ");
		String productName = sc.nextLine();
		System.out.printf("Product price: ");
		double productPrice = sc.nextDouble();
		Product productObj = new Product(productName, productPrice);
		
		System.out.printf("Product quantity: ");
		int productQuantity = sc.nextInt();
		OrderItem orderItemObj = new OrderItem(productQuantity, productPrice, productObj);
		
		orderObj.addOrderItem(orderItemObj);
	}
}