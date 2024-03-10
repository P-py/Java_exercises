package entities_chapter14;

public class Product{
	private String name;
	private Double price;
	
	public Product() {
	}
	public Product(String inputName, Double inputPrice) {
		this.name = inputName;
		this.price = inputPrice;
	}
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setPrice(Double inputPrice) {
		this.price = inputPrice;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" - $");
		sb.append(price);
		return sb.toString();
	}
}
