package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Vector{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nNumber of heights: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i=0; i<n; i++) {
			System.out.printf("\nHeight #%d: ", i+1);
			vect[i] = sc.nextDouble();
		}
		double sum=0;
		for (int i=0; i<n; i++) {
			sum+=vect[i];
		}
		System.out.printf("Average height: %.2f", sum/n);
		
		sc.close();
	}
}