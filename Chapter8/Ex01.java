package chapter08;

import java.util.Scanner;
import java.util.Locale;
import entities_chapter08.Rectangle;

public class Ex01{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle retangulo1 = new Rectangle();
		
		System.out.printf("\nEnter rectangle width and height: ");
		retangulo1.width = sc.nextDouble();
		retangulo1.height = sc.nextDouble();
		
		System.out.printf("A=%.2f, P=%.2f, D=%.2f", retangulo1.area(), retangulo1.perimeter(), retangulo1.diagonal());
		
		sc.close();
	}
}