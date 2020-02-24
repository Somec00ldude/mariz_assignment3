package mariz_problem2;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double bal)
	{
		this.savingsBalance = bal;
	}
	public void calculateMonthlyInterest()
	{
		this.savingsBalance = this.savingsBalance + (savingsBalance*annualInterestRate)/12;
	}
	public static void modifyInterestRate(double newval)
	{
		annualInterestRate = newval;
	}
	public void getsavingsBalance()
	{
		System.out.printf("%.2f", this.savingsBalance);
		System.out.println("");
	}
	

}
