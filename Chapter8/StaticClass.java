package chapter08;

import java.util.Scanner;
import java.util.Locale;

//V2
import util.Calculator;

public class StaticClass {
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//V2
		//Calculator calc = new Calculator();
		//V3
		
		System.out.print("Enter a radius value: ");
		double radius = sc.nextDouble();
		
		//V1
		//double c = circumference(radius);
		//double v = volume(radius);
		//V2
		//double c = calc.circumference(radius);
		//double v = calc.volume(radius);
		
		//V3
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f", PI);
		
		sc.close();
	}
}