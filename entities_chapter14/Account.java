package entities_chapter14;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
		
	}
	public Account(Integer inputNumber, String inputHolder, Double inputBalance) {
		this.number = inputNumber;
		this.holder = inputHolder;
		this.balance = inputBalance;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer inputNumber) {
		this.number = inputNumber;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String inputHolder) {
		this.holder = inputHolder;
	}
	public Double getBalance() {
		return balance;
	}
	public void withdraw(double inputAmount) {
		this.balance -= inputAmount + 5.0;
	}
	public void deposit(double inputAmount) {
		this.balance += inputAmount;
	}
}
