package chapter15;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HotelManager{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.printf("\nRoom number: ");
		int number = sc.nextInt();
		System.out.printf("\n");
		
		sc.close();
	}
}