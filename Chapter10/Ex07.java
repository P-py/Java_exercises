package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex07{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nLength of the vectors: ");
		int n = sc.nextInt();
		double vectorAverage, vectorSum=0;
		double numbersVector[] = new double[n];
		for (int i=0; i<numbersVector.length; i++) {
			System.out.printf("\nType in a number: ");
			double number = sc.nextDouble();
			numbersVector[i] = number;
			vectorSum += number;
		}
		vectorAverage = vectorSum/numbersVector.length;
		System.out.printf("\nVECTOR AVERAGE: %f", vectorAverage);
		System.out.println("\nNUMBERS BELOW AVERAGE: ");
		for (int i=0; i<numbersVector.length; i++) {
			if (numbersVector[i]<vectorAverage) {
				System.out.println(numbersVector[i]);
			}
		}
		
		sc.close();
	}
}