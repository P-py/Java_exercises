package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nAmount of numbers: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		for (int i=0; i<vect.length; i++) {
			System.out.printf("\nType in a number: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("\nNegative numbers: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i]<0) {
				System.out.printf("%d\n", vect[i]);
			}
		}
		sc.close();
	}
}