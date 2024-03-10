package entities_chapter14;

public class ImportedProduct extends Product{
	private Double customsFee;

	public ImportedProduct() {
	}
	public ImportedProduct(String inputName, Double inputPrice, Double customsFee) {
		super(inputName, inputPrice);
		this.customsFee = customsFee;
	}
	public void setCustomsFee(Double inputFee) {
		this.customsFee = inputFee;
	}
	public Double getCustomsFee() {
		return customsFee;
	}
	public Double totalPrice() {
		return (double)(customsFee + super.getPrice());
	}
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		sb.append(" - $");
		sb.append(super.getPrice());
		sb.append(" - ($"+totalPrice()+" w/ customs fee)");
		return sb.toString();
	}
}
