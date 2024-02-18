package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex03{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nAmount of people: ");
		int n = sc.nextInt();
		int vect[] = new int[n];
		String under16List[] = new String[n];
		double heightSum=0;
		int under16Sum=0;
		for (int i=0; i<vect.length; i++) {
			System.out.printf("\nPerson #%d name: ", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("\nPerson #%d age: ", i+1);
			int age = sc.nextInt();
			if (age<16) {
				under16List[under16Sum]=name;
				under16Sum++;
			}
			System.out.printf("\nPerson #%d height: ", i+1);
			double height = sc.nextDouble();
			heightSum += height;
		}
		System.out.printf("\nAverage height: %.2f", heightSum/n);
		System.out.printf("\nUnder 16 percentage: %.2f", ((double)under16Sum/n)*100);
		System.out.println("\nUnder 16 names: ");
		for (int i=0; i<under16Sum; i++) {
			System.out.println(under16List[i]);
		}
		sc.close();
	}
}