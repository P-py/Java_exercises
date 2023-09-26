package chapter06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		*/
		
		/*int number;
		number = sc.nextInt();
		
		int soma = 0;
		while (number != 0 ) {
			soma += number;
			number = sc.nextInt();
		}
		System.out.println(soma);
		*/
		System.out.println("Digite a quantidade de número a serem contados: ");
		int soma = 0;
		int N = sc.nextInt();
		for (int i = 0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.print(soma);
		
		sc.close();
		
	}
}