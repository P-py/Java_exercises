package chapter06;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i;
		int fatorial = 1;
		for (i=1; i<=N; i++) {
			fatorial = fatorial*i;
		}
		System.out.printf("%d\n", fatorial);
		sc.close();
	}
}