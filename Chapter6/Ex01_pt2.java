package chapter06;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(), i;
		for (i=0; i<=number; i++) {
			if (i!= 0 && i%2!=0) {
				System.out.printf("%d\n", i);
			}
		}
		sc.close();
	}
}