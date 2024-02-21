package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex_matrices{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int negativeCount = 0;
		
		System.out.printf("\nType in the order of the array: ");
		int n = sc.nextInt();
		System.out.printf("\nNow type in the elements of the array: \n");
		int[][] mat = new int[n][n];
		int diagonalMatrice[] = new int[n];
		
		//i -> lines / mat.length
		//j -> columns / mat[i].length
		//for (int i=0; i<n; i++) {
		for (int i=0; i<mat.length; i++) {
			//for (int j=0; j<n; j++) {
			for (int j=0; j<mat[i].length; j++) {	
				int number = sc.nextInt();
				mat[i][j] = number;
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				int number = mat[i][j];
				if (i==j) {
					diagonalMatrice[i]=number;
				}
				if (number<0) {
					negativeCount++;
				}
			}
		}
		for (int i=0; i<diagonalMatrice.length; i++) {
			System.out.printf("%d ", diagonalMatrice[i]);
		}
		System.out.println("\n"+negativeCount);
		sc.close();
	}
}