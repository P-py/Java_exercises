package chapter15;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Main{
	public static void method1() {
		System.out.println("-METHOD 1 START-");
		method2();
		System.out.println("-METHOD 1 END-");
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-METHOD 2 START-");
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf("\nPlease type in a valid position\n");
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.printf("\nThe input for position must be a number.\n");
			e.printStackTrace();
		}
		sc.close();
		System.out.println("\n-METHOD 2 END-");
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		method1();
		System.out.printf("\nEnd.");
	}
}