package chapter04;

import java.util.Locale;
import java.util.Scanner;

public class Ex03{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		int diferenca;
		
		System.out.println("Digite 4 inteiros em sequencia.");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = ((A*B)-(C*D));
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		sc.close();
	}
}