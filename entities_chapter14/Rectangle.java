package entities_chapter14;

import entities.enums.Color;

public class Rectangle extends Shape{
	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}
	public Rectangle(Color inputColor, Double inputWidth, Double inputHeight) {
		super(inputColor);
		this.width = inputWidth;
		this.height = inputHeight;
	}
	public Double getWidth() {
		return width;
	}
	public Double getHeight() {
		return height;
	}
	public void setWidth(Double inputWidth) {
		this.width = inputWidth;
	}
	public void setHeight(Double inputHeight) {
		this.height = inputHeight;
	}
	public String toString() {
		return super.getColor()+" RECTANGLE";
	}
	@Override
	public Double area() {
		return height*width;
	}
}
