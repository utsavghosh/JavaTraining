/**
 * 
 */
package BankAccountCode;

/**
 * @author BYO
 *
 */
public abstract class Account {
	int accountNumber;
	String accountName;
	double amount;
	public abstract void deposit(double d);
	public abstract void withdraw(double d);
	

}
