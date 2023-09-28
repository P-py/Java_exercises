package chapter06;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), i, x;
		int contagemIn = 0, contagemOut = 0;
		for (i=0; i<N; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				contagemIn++;
			}
			else{
				contagemOut++;
			}
		}
		System.out.printf("%d in\n", contagemIn);
		System.out.printf("%d out\n", contagemOut);
		
		sc.close();
	}
}