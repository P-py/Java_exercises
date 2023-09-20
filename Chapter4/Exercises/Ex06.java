package chapter04;

import java.util.Locale;
import java.util.Scanner;

public class Ex06{
	public static void main(String[] args) {
		//config
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double triangle_area, circle_area, trapezium_area;
		double square_area, rectangle_area;
		
		System.out.println("Type in the same line the A, B, C values.");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangle_area = (A*C)/2;
		circle_area = Math.PI*Math.pow(C, 2);
		trapezium_area = (A+B)*C/2;
		square_area = Math.pow(B, 2);
		rectangle_area = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", triangle_area);
		System.out.printf("CIRCULO: %.3f\n", circle_area);
		System.out.printf("TRAPEZIO: %.3f\n", trapezium_area);
		System.out.printf("QUADRADO: %.3f\n", square_area);
		System.out.printf("RETANGULO: %.3f\n", rectangle_area);
		
		sc.close();
	}
}