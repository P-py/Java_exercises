package entities_chapter13;

public class Product {
	private String name;
	private Double price;
	
	public Product() {
	}
	public Product(String inputName, Double inputPrice) {
		this.name = inputName;
		this.price = inputPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
