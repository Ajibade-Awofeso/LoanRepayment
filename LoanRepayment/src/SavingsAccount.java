
public class SavingsAccount {
	
	private static float interestRate = 0.004f;
	private float balance;
	
	SavingsAccount(float balance){
		this.balance = balance;
	}
	
	SavingsAccount(){
		this.balance = 0.0f;
	}
	
	float getBalance(){
		return this.balance;
	}
	
	void addInterest() {
		this.balance += this.balance * interestRate;
	}
	
	void MakeDeposit(float amount) {
		this.balance += amount;
	}
	

}
