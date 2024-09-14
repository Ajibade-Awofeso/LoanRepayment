
public class LoanAccount {

	private static float interestRate = 0.009f;
	private float balance;
	
	LoanAccount(float balance){
		this.balance = balance;
	}
	
	float getBalance(){
		return this.balance;
	}
	
	void addInterest() {
		this.balance += this.balance * interestRate;
	}
	
	void MakePayment(float amount) {
		this.balance -= amount;
	}
	
}


