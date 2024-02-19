package chapter10;

import java.util.Scanner;
import java.util.Locale;

public class Ex10{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nAmount of students: ");
		int n = sc.nextInt();
		String namesVector[] = new String[n];
		double grades1Vector[] = new double[n];
		double grades2Vector[] = new double[n];
		for (int i=0; i<n; i++) {
			System.out.printf("Type in name of person #%d: ", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			namesVector[i] = name;
			System.out.printf("Type in grade 1 of person #%d: ", i+1);
			double grade1 = sc.nextDouble();
			grades1Vector[i] = grade1;
			System.out.printf("Type in grade 2 of person #%d: ", i+1);
			double grade2 = sc.nextDouble();
			grades2Vector[i] = grade2;
		}
		System.out.println("\nApproved students: ");
		for (int i=0; i<n; i++) {
			if (((grades1Vector[i]+grades2Vector[i])/2)>6.0) {
				System.out.println(namesVector[i]);
			}
		}
		
		sc.close();
	}
}