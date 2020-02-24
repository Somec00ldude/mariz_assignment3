package mariz_problem2;

public class SavingsAccountTest {
	public SavingsAccountTest()
	{
		
	}

	public static void main(String[] args) {
		SavingsAccount saver1, saver2;
		saver1 = new SavingsAccount(2000.00);
		saver2 = new SavingsAccount(3000.00);
		SavingsAccount.modifyInterestRate(0.04);
		for(int i = 1; i<13; i++)
		{
			System.out.println("Month " + i);
			saver1.calculateMonthlyInterest();
			System.out.print("Saver 1: $");
			saver1.getsavingsBalance();
			saver2.calculateMonthlyInterest();
			System.out.print("Saver 2: $");
			saver2.getsavingsBalance();

		}
		SavingsAccount.modifyInterestRate(0.05);
		System.out.println("Month 13 at 5% interest");
		saver1.calculateMonthlyInterest();
		System.out.print("Saver 1: $");
		saver1.getsavingsBalance();
		saver2.calculateMonthlyInterest();
		System.out.print("Saver 2: $");
		saver2.getsavingsBalance();

	}

}
