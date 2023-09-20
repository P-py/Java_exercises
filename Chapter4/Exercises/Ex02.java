package chapter04;

import java.util.Locale;
import java.util.Scanner;

public class Ex02{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double radius;
		double area;
		
		System.out.print("Type in the radius of the circle:");
		radius = sc.nextDouble();
		
		area = Math.PI*Math.pow(radius, 2);
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
	}
}