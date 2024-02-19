package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex11{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double shortestHeight=0, greaterHeight=0;
		int shortestPosition=0, greaterPosition=0;
		double menCount=0, womenCount=0, sumHeightWomen=0;
		
		System.out.printf("\nAmount of people: ");
		int n = sc.nextInt();
		double heightVector[] = new double[n];
		String genderVector[] = new String[n];
		for (int i=0; i<n; i++) {
			System.out.printf("\nHeight of person #%d: ", i+1);
			heightVector[i] = sc.nextDouble();
			System.out.printf("\nGender of person #%d (M/F): ", i+1);
			sc.nextLine();
			genderVector[i] = sc.nextLine().toUpperCase();
		}
		for (int i=0; i<n; i++) {
			if (i==0) {
				shortestHeight=heightVector[i];
				greaterHeight=heightVector[i];
				shortestPosition=i;
				greaterPosition=i;
			}
			else {
				if (heightVector[i]>greaterHeight) {
					greaterHeight=heightVector[i];
					greaterPosition=i;
				}
				else if (heightVector[i]<shortestHeight) {
					shortestHeight=heightVector[i];
					shortestPosition=i;
				}
			}
		}
		for (int i=0; i<n; i++) {
			if (genderVector[i].equals("M")) {
				menCount++;
			}
			else if (genderVector[i].equals("F")) {
				sumHeightWomen+=heightVector[i];
				womenCount+=1.0;
			}
		}
		System.out.printf("\nShortest height: %.2f", shortestHeight);
		System.out.printf("\nGreater height: %.2f", greaterHeight);
		System.out.printf("\nAverage height between women: %.2f", (double)(sumHeightWomen/womenCount));
		System.out.printf("\nAmount of men: %.0f", menCount);
		
		sc.close();
	}
}