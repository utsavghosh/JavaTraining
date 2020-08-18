/**
 * 
 */
package BankAccountCode;

/**
 * @author BYO
 *
 */
final public class CurrentAccount extends Account{
	double interest = 2.0f;
	final double minBalance = 4000.0;
	public CurrentAccount(int a, String b, double c) {
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
		System.out.println("Your balance after deposit is : "+ amount);
		
	}
	public void withdraw(double d) {
		if (amount-d < minBalance) {
			System.out.println("Unauthorised: withdrawal amount would make your balance less than minimun required");
			return;
		}
		amount-=d;
		System.out.println("Your balance after withdrawal is : "+ amount);
		
	}
	
}
