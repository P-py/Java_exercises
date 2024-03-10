package entities_chapter14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate manufactureDate;
	
	public UsedProduct() {
	}
	public UsedProduct(String inputName, Double inputPrice, String inputDate) {
		super(inputName, inputPrice);
		this.manufactureDate = LocalDate.parse(inputDate, formatter);
	}
	public String getManufactureDate() {
		return formatter.format(manufactureDate).toString();
	}
	public void setManufactureDate(String inputDate) {
		manufactureDate = LocalDate.parse(inputDate, formatter);
	}
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		sb.append(" (used) - $");
		sb.append(super.getPrice());
		sb.append(" - (Manufacture date: "+getManufactureDate()+")");
		return sb.toString();
	}
}