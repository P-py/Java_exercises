package entities_chapter14;

import entities.enums.Color;

public class Circle extends Shape{
	private Double radius;
	
	public Circle() {
		super();
	}
	public Circle(Color inputColor, Double inputRadius) {
		super(inputColor);
		this.radius = inputRadius;
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double inputRadius) {
		this.radius = inputRadius;
	}
	public String toString() {
		return super.getColor()+" CIRCLE";
	}
	@Override
	public Double area() {
		return Math.PI*(Math.pow(radius, 2));
	}
}
