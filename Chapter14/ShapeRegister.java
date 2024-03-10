package chapter14;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import entities_chapter14.Shape;
import entities_chapter14.Circle;
import entities_chapter14.Rectangle;
import entities.enums.Color;

public class ShapeRegister{
	static Scanner sc = new Scanner(System.in);
	public static void addRectangle(List<Shape> shapeList) {
		System.out.printf("Color (BLACK/BLUE/RED): ");
		String color = sc.nextLine();
		System.out.printf("Width: ");
		double width = Double.valueOf(sc.nextLine());
		System.out.printf("Height: ");
		double height = Double.valueOf(sc.nextLine());
		Shape shapeObj = new Rectangle(Color.valueOf(color.toUpperCase()), width, height);
		shapeList.add(shapeObj);
	}
	public static void addCircle(List<Shape> shapeList) {
		System.out.printf("Color (BLACK/BLUE/RED): ");
		String color = sc.nextLine();
		System.out.printf("Radius: ");
		double radius = Double.valueOf(sc.nextLine());
		Shape shapeObj = new Circle(Color.valueOf(color.toUpperCase()), radius);
		shapeList.add(shapeObj);
	}
	public static void viewShapes(List<Shape> shapeList) {
		System.out.println("\n-SHAPE LIST-");
		for (Shape shapeObj : shapeList) {
			System.out.printf("\n%s - %.2f", shapeObj, shapeObj.area());
		}
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Shape> shapeList = new ArrayList<>();
		
		System.out.printf("\nType in the number of shapes to be registered: ");
		int amount = Integer.valueOf(sc.nextLine());
		for (int i = 0; i<amount; i++) {
			System.out.printf("\nShape #%d data: \n", i+1);
			String option;
			do {
				System.out.printf("Rectangle or circle (r/c)? ");
				option = sc.nextLine();
				switch(option.toUpperCase()) {
					case "R":
						addRectangle(shapeList);
						break;
					case "C":
						addCircle(shapeList);
						break;
					default:
						System.out.printf("\nPlease type in a valid option");
				}
			}while(!(option.toUpperCase().equals("R"))&&!(option.toUpperCase().equals("C")));
		}
		viewShapes(shapeList);
		
		sc.close();
	}
}