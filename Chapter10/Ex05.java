package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex05{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nAmount of numbers: ");
		int n = sc.nextInt();
		double largestNumber=0;
		int positionLargest=0;
		double numbersVector[] = new double[n];
		for (int i=0; i<numbersVector.length; i++) {
			System.out.printf("\nType in a number: ");
			double number = sc.nextDouble();
			numbersVector[i] = number;
		}
		for (int i=0; i<numbersVector.length; i++) {
			if (i==0) {
				largestNumber = numbersVector[i];
				positionLargest = i;
			}
			else {
				if (numbersVector[i]>largestNumber) {
					largestNumber = numbersVector[i];
					positionLargest = i;
				}
			}
		}
		System.out.printf("\nLARGEST NUMBER: %.2f", largestNumber);
		System.out.printf("\nLARGEST NUMBER POSITION: %d", positionLargest);
		
		sc.close();
	}
}