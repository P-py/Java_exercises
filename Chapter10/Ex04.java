package chapter10;

import java.util.Scanner;
import java.util.Locale;	

public class Ex04{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nAmount of numbers: ");
		int n = sc.nextInt();
		int numbersVector[] = new int[n];
		int positiveCount=0;
		for (int i=0; i<n; i++) {
			System.out.printf("\nType in a number: ");
			int number = sc.nextInt();
			numbersVector[i]=number;
			if (number%2==0) {
				positiveCount++;
			}
		}
		System.out.printf("\nPAIR NUMBERS: \n");
		for (int i=0; i<n; i++) {
			if (numbersVector[i]%2==0) {
				System.out.println(numbersVector[i]);
			}
		}
		System.out.printf("\nAMOUNT OF PAIR NUMBERS: %d", positiveCount);
		
		sc.close();
	}
}