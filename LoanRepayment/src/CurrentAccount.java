
public class CurrentAccount {

	private static float interestRate = 0.0005f;
	private float balance;
	
	CurrentAccount(float balance){
		this.balance = balance;
	}
	
	CurrentAccount(){
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

