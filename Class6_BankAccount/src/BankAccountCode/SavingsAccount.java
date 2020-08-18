/**
 * 
 */
package BankAccountCode;

/**
 * @author BYO
 *
 */
final public class SavingsAccount extends Account{
	double interest = 4.0f;
	final double minBalance = 2000.0;
	public SavingsAccount(int a, String b, double c) {
		super.accountName = b;
		super.accountNumber = a;
		super.amount = c;
	}
	public void display() {
		System.out.println("Your savings account details are:\n");
		System.out.println("Account Name : "+accountName);
		System.out.println("\nAccount Number : "+accountNumber);
		System.out.println("\nAccount opening balance : "+amount);
	}
	
	public void deposit(double d) {
		amount+=d;
		System.out.println("\nYour balance after deposit is : "+ amount);
		
	}
	public void withdraw(double d) {
		if (amount-d < minBalance) {
			System.out.println("\nUnauthorised: withdrawal amount would make your balance less than minimun required");
			return;
		}
		amount-=d;
		System.out.println("\nYour balance after withdrawal is : "+ amount);
		
	}
	

}
