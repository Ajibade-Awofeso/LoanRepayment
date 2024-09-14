
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float johnI = 2400;
		CurrentAccount johnA = new CurrentAccount();
		LoanAccount johnL = new LoanAccount(18000);
		float johnR = johnI - 1550;
		int johnM = 0;
		
		float maryI = 2500;
		SavingsAccount maryA = new SavingsAccount(150);
		LoanAccount maryL = new LoanAccount(20000);
		float maryR = maryI - 1325;
		int maryM = 0;
		
		while(johnL.getBalance() > 0) {
			johnL.MakePayment(250);
			johnA.MakeDeposit(johnR);
			
			johnA.addInterest();
			johnL.addInterest();
			
			johnM++;
		}
		
		while(maryL.getBalance() > 0) {
			maryL.MakePayment(225);
			maryA.MakeDeposit(maryR);
			
			maryA.addInterest();
			maryL.addInterest();
			
			maryM++;
		}
		
		System.out.println("John repaid his loan after " + johnM + " months. His current account balance at that time was £" + johnA.getBalance());
		System.out.println("Mary repaid her loan after " + maryM + " months. Her savings account balance at that time was £" + maryA.getBalance());
	}

}
