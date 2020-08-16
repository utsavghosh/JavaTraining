/**
 * 
 */
package Class5;

/**
 * @author BYO
 *
 */
public class SavingsAccount extends Account {
	//double interestRate;

    public SavingsAccount(int acctNum, String name) {
        super(acctNum, name);
        this.interestRate = 4.0;
    }
}
