package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex02{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nAmount of numbers: ");
		int n = sc.nextInt();
		double vect[] = new double[n];
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			System.out.printf("\nType in a number: ");
			double number = sc.nextDouble();
			vect[i] = number;
			sum += number;
		}
		System.out.println("\nVALUES LIST: ");
		for (int i = 0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.printf("\nSUM = %.2f", sum);
		System.out.printf("\nAVERAGE = %.2f", sum/n);
		
		sc.close();
	}
}