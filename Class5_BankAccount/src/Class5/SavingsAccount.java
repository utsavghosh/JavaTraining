/**
 * 
 */
package Class5;

/**
 * @author BYO
 *
 */
public class SavingsAccount extends Account {
	double interestRate;

    public SavingsAccount(int acctNum, String name) {
        super(acctNum, name);
        this.interestRate = 4.0;
        this.balance = 1000;
    }
    public void accDetails() {
    	System.out.println("Account number : "+ acctNum+" Account Name : "+ name);
    }
    public double interestPerYear() {
 	        return balance * interestRate/100;
    }
}
