package entities_chapter14;

import entities.enums.Color;

public abstract class Shape {
	private Color color;
	
	public Shape() {
	}
	public Shape(Color inputColor) {
		this.color = inputColor;
	}
	public void setColor(Color inputColor) {
		this.color = inputColor;
	}
	public String getColor() {
		return color.toString();
	}
	public abstract Double area();
}
