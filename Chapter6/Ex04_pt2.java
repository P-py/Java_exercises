package chapter06;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i;
		int num1, num2;
		for (i=0; i<N; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num2==0) {
				System.out.println("divisao impossivel");
			}
			else {
				System.out.printf("%.2f", ((float)num1/(float)num2));
			}
		}
		sc.close();
	}
}