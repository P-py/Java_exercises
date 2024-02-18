package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.printf("\nAmount of numbers: ");
		int n = sc.nextInt();
		int[] negativeNumbersVect = new int[n];
		int negativeNumbersCount = 0;
		for (int i=0; i<negativeNumbersVect.length; i++) {
			System.out.printf("\nNumber #%d: ", i+1);
			int number = sc.nextInt();
			if (number<0) {
				negativeNumbersVect[negativeNumbersCount] = number;
				negativeNumbersCount++;
			}
		}
		System.out.println("\nNEGATIVE NUMBERS: ");
		for (int i=0; i<negativeNumbersCount; i++) {
			System.out.println(negativeNumbersVect[i]);
		}
		sc.close();
	}
}