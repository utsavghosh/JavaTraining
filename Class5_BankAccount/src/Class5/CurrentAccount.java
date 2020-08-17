package Class5;

public class CurrentAccount extends Account {
	//double interestRate;

    public CurrentAccount(int acctNum, String name) {
        super(acctNum, name);
        this.interestRate = 2.0;
    }

}
