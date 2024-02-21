package chapter10;

import java.util.Locale;
import java.util.Scanner;

public class Ex14{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nType in the M value for lines in the Matrix: ");
		int m = sc.nextInt();
		System.out.printf("\nType in the N value for lines in the Matrix: ");
		int n = sc.nextInt();
		
		int[][] matrix = new int[m][n];
		System.out.printf("\nType in the values in the format: \n");
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				System.out.printf("[n] ");
			}
			System.out.println();
		}
		for (int i=0; i<matrix.length; i++) {
			System.out.printf("->");
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("\nType in a number to search for it within the matrix: ");
		int number = sc.nextInt();
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (number == matrix[i][j]) {
					System.out.printf("Position %d, %d: \n", i, j);
					if (j>0){
						System.out.printf("Left: %d\n", matrix[i][j-1]);
					}
					if (j<(matrix[i].length-1)){
						System.out.printf("Right: %d\n", matrix[i][j+1]);
					}
					if (i>0) {
						System.out.printf("Up: %d\n", matrix[i-1][j]);
					}
					if (i<(matrix.length-1)) {
						System.out.printf("Down: %d\n", matrix[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}