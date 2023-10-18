package chapter08;

import java.util.Scanner;
import java.util.Locale;
import entities.Triangle;

public class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//double xA, xB, xC;
		//double yA, yB, yC;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		double areaX, areaY;
		System.out.printf("\nEnter the measures of triangle X: \n");
		
		//xA = sc.nextDouble();
		//xB = sc.nextDouble();
		//xC = sc.nextDouble();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.printf("\nEnter the measures of triangle Y: \n");
	
		//yA = sc.nextDouble();
		//yB = sc.nextDouble();
		//yC = sc.nextDouble();
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//double pX = (xA+xB+xC)/2;
		//double pY = (yA+yB+yC)/2;
		//areaX = Math.sqrt((pX*(pX-xA)*(pX-xB)*(pX-xC)));
		//areaY = Math.sqrt((pY*(pY-yA)*(pY-yB)*(pY-yC)));
		
		double pX = (x.a+x.b+x.c)/2;
		double pY = (y.a+y.b+y.c)/2;
		areaX = Math.sqrt((pX*(pX-x.a)*(pX-x.b)*(pX-x.c)));
		areaY = Math.sqrt((pY*(pY-y.a)*(pY-y.b)*(pY-y.c)));
		
		System.out.printf("\nX area: %.3f\nY area: %.3f", areaX, areaY);
		if (areaX>areaY) {
			System.out.printf("\nX's area is larger.");
		}
		else if (areaY>areaX) {
			System.out.printf("\nY's area is larger.");
		}
		else {
			System.out.printf("\nX's and Y's areas are equal.");
		}
		sc.close();
	}
}