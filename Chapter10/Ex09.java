package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex09{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nAmount of people: ");
		int n = sc.nextInt(), largestAge=0, largestPosition=0;
		int agesVector[] = new int[n];
		String namesVector[] = new String[n];
		for (int i=0; i<n; i++) {
			System.out.printf("\nType in person #%d name: ", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			namesVector[i] = name;
			System.out.printf("\nType in person #%d age: ", i+1);
			int age = sc.nextInt();
			agesVector[i] = age;
		}
		for (int i=0; i<agesVector.length; i++) {
			if (i==0) {
				largestAge = agesVector[i];
				largestPosition = i;
			}
			else {
				if (agesVector[i]>largestAge) {
					largestAge = agesVector[i];
					largestPosition = i;
				}
			}
		}
		System.out.println("\nOLDEST PERSON: ");
		System.out.println(namesVector[largestPosition]);
		
		
		sc.close();
	}
}