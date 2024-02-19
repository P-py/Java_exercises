package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex06{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nLength of the vectors: ");
		int n = sc.nextInt();
		int vectorA[] = new int[n];
		int vectorB[] = new int[n];
		int vectorC[] = new int[n];
		
		for (int i=0; i<vectorA.length; i++) {
			System.out.printf("\nType number #%d for Vector A: ", i+1);
			int number = sc.nextInt();
			vectorA[i] = number;
		}
		for (int i=0; i<vectorB.length; i++) {
			System.out.printf("\nType number #%d for Vector B: ", i+1);
			int number = sc.nextInt();
			vectorB[i] = number;
		}
		for (int i=0; i<vectorC.length; i++) {
			vectorC[i] = vectorA[i]+vectorB[i];
		}
		System.out.println("\nVECTOR C: ");
		for (int i=0; i<vectorC.length; i++) {
			System.out.printf("\n%d", vectorC[i]);
		}
		
		sc.close();
	}
}