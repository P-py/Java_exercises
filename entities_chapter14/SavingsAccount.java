package entities_chapter14;

public final class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(Integer inputNumber, String inputHolder, Double inputBalance, Double interestRate) {
		super(inputNumber, inputHolder, inputBalance);
		this.interestRate = interestRate;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance += balance*(interestRate);
	}
	
	@Override
	public void withdraw(double inputAmount) {
		balance -= inputAmount;
	}
}
