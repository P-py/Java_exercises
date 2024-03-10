package entities_chapter14;

public abstract class TaxPayer {
	private String name;
	private Double income;
	
	public TaxPayer() {
	}
	public TaxPayer(String inputName, Double inputIncome) {
		this.name = inputName;
		this.income = inputIncome;
	}
	public String getName() {
		return name;
	}
	public Double getIncome() {
		return income;
	}
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setIncome(Double inputIncome) {
		this.income = inputIncome;
	}
	public abstract Double tax();
}