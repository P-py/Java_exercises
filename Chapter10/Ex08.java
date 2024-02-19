package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex08{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int countPairs=0;
		double sumPairs=0;
		int number;
		
		System.out.printf("\nLength of the vectors: ");
		int n = sc.nextInt();
		int numbersVector[] = new int[n];
		for (int i=0; i<numbersVector.length; i++) {
			System.out.printf("\nType in a number: ");
			numbersVector[i] = (number = sc.nextInt());
			if (number%2==0) {
				countPairs++;
				sumPairs += (double)number;
			}
		}
		if (countPairs==0) {
			System.out.println("\nNO PAIR NUMBERS");
		}
		else {
			System.out.printf("\nPAIR NUMBERS AVERAGE = %.2f", sumPairs/countPairs);
		}
		
		sc.close();
	}
}