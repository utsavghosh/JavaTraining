/**
 * 
 */
package Class5;

/**
 * @author BYO
 *
 */
public class Account {
	    public String name;
	    public int acctNum;
	    public double balance;
	    public double interestRate;

	    public Account(int acctNum, String name) {
	        this.acctNum = acctNum;
	        this.name = name;
	        this.balance = 0.0;
	        this.interestRate = 0.0;
	    }

	    public double interestPerYear() {
	        return balance * interestRate;
	    }

	    public void deposit(float amount) { /*...*/ }
	    public void withdraw(float amount) { /*...*/ }
	    

}


