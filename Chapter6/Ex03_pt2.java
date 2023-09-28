package chapter06;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_pt2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("a");
		int N = sc.nextInt(), i;
		double nota1, nota2, nota3, media;
		for(i=0; i<N; i++) {
			System.out.printf("\nTeste %d - digite 3 notas para obter a media\n", i+1);
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			media = ((nota1*2)+(3*nota2)+(5*nota3))/10;
			System.out.printf("%.1f\n", media);
		}
		sc.close();
	}
}