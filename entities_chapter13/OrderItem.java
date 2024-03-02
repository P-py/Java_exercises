package entities_chapter13;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
	}
	public OrderItem(int inputQuantity, double inputPrice, Product inputProduct) {
		this.quantity = inputQuantity;
		this.price = inputPrice;
		this.product = inputProduct;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void addQuantity(int inputQuantity) {
		quantity += inputQuantity;
	}
	public void removeQuantity(int inputQuantity) {
		quantity += inputQuantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product inputProduct) {
		this.product = inputProduct;
	}
	public Double subTotal() {
		return (double)(price*quantity);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName()+", $");
		sb.append(price+", ");
		sb.append("Quantity: "+quantity+", ");
		sb.append("Subtotal: $"+subTotal());
		return sb.toString();
	}
}