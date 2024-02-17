package entities_chapter09;

public class BankAccount{
	private int AccountNumber;
	public String Name;
	private double AccountBalance;
	
	public BankAccount(int number, String name){
		this.AccountBalance = 0;
		this.Name = name;
		this.AccountNumber = number;
	}
	public BankAccount(int number, String name, double deposit) {
		balanceDeposit(deposit);
		this.Name = name;
		this.AccountNumber = number;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getName() {
		return Name;
	}
	public double getBalance() {
		return AccountBalance;
	}
	public double getAccountNumber() {
		return AccountNumber;
	}
	public void balanceWithdraw(double amount){
		this.AccountBalance -= (amount+5.0);
	}
	public void balanceDeposit(double amount) {
		this.AccountBalance += amount;
	}
	public String toString() {
		return  "Account "+this.AccountNumber+", Holder: "+this.Name+", Balance: "+this.AccountBalance;
	}
}