package entities_chapter14;

public class BusinessAccount extends Account{
	private Double loanLimit;
	private Double debt;
	
	public BusinessAccount() {
		super();
	}
	public BusinessAccount(Integer inputNumber, String inputHolder, Double inputBalance, Double loanLimit, Double debt) {
		super(inputNumber, inputHolder, inputBalance);
		this.loanLimit = loanLimit;
		this.debt = debt;
	}
	public Double getDebt() {
		return debt;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double inputAmount) {
		this.loanLimit = inputAmount;
	}
	public String loan(double inputAmount) {
		if (inputAmount>loanLimit) {
			return "This amount is bigger than your loan limit.";
		}
		else {
			deposit(inputAmount);
			loanLimit -= inputAmount;
			debt += loanLimit;
		}
		return null;
	}
	public String payLoan(double inputAmount) {
		if (debt < inputAmount) {
			return "The amount you're trying to pay is bigger than your debt.";
		}
		else {
			debt -= inputAmount;
			loanLimit += inputAmount;
			return "Successfully paid debt.";
		}
	}
	@Override
	public void withdraw(double inputAmount) {
		super.withdraw(inputAmount);
		balance -= 2.0;
	}
}
