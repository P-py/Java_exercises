package chapter08;

import java.util.Scanner;
import java.util.Locale;
import entities_chapter08.Triangle;

public class Main_v2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//double xA, xB, xC;
		//double yA, yB, yC;
		//double areaX, areaY;
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.printf("\nEnter the measures of triangle X: \n");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.printf("\nEnter the measures of triangle Y: \n");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//double pX = (xA+xB+xC)/2;
		//double pY = (yA+yB+yC)/2;
		//areaX = Math.sqrt((pX*(pX-xA)*(pX-xB)*(pX-xC)));
		//areaY = Math.sqrt((pY*(pY-yA)*(pY-yB)*(pY-yC)));
		
		double areaX = x.area();
		double areaY = y.area();
		
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