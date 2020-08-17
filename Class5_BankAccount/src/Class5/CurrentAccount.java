package Class5;

public class CurrentAccount extends Account {
	double interestRate;

    public CurrentAccount(int acctNum, String name) {
        super(acctNum, name);
        this.interestRate = 2.0;
        this.balance = 1000;
    }
    public void accDetails() {
    	System.out.println("Account number : "+ acctNum+" Account Name : "+ name);
    }
    public double interestPerYear() {
 	        return balance * interestRate/100;
    }
}
