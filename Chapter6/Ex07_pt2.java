package chapter06;

import java.util.Scanner;
import java.util.Locale;

public class Ex07_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i;
		double square, cube;
		for (i=1; i<=N; i++) {
			square = Math.pow(i, 2);
			cube = Math.pow(i, 3);
			System.out.printf("%d %.0f %.0f\n", i, square, cube);
		}
		sc.close();
	}
}