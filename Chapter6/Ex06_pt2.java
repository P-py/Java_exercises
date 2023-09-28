package chapter06;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i;
		for (i=0; i<=N; i++) {
			if (N%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}