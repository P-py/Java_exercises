package entities_chapter14;

public class IndividualPayer extends TaxPayer{
	private Double healthExpenses;
	
	public IndividualPayer() {
		super();
	}
	public IndividualPayer(String inputName, Double inputIncome, Double healthExpenses) {
		super(inputName, inputIncome);
		this.healthExpenses = healthExpenses;
	}
	public void setHealthExpenses(Double inputExpenses) {
		this.healthExpenses = inputExpenses;
	}
	public Double getHealthExpenses() {
		return healthExpenses;
	}
	@Override
	public Double tax() {
		if (getIncome()<20000.00) {
			if (healthExpenses!=0) {
				return (getIncome()*0.15) - (healthExpenses*0.5);
			}
			else {
				return getIncome()*0.15;
			}
		}
		else if (getIncome()>=20000.00) {
			if (healthExpenses!=0) {
				return (getIncome()*0.25) - (healthExpenses*0.5);
			}
			else {
				return getIncome()*0.25;
			}
		}
		return null;
	}
}
