package entities_chapter14;

public class Business extends TaxPayer{
	private Integer numberOfEmployees;
	
	public Business() {
		super();
	}
	public Business(String inputName, Double inputIncome, Integer inputEmployees) {
		super(inputName, inputIncome);
		this.numberOfEmployees = inputEmployees;
	}
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(Integer inputEmployees) {
		this.numberOfEmployees = inputEmployees;
	}
	@Override
	public Double tax() {
		if (numberOfEmployees>=10) {
			return getIncome()*0.14;
		}
		else {
			return getIncome()*0.16;
		}
	}
}
