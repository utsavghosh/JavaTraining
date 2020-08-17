/**
 * 
 */
package Class5;

/**
 * @author BYO
 *
 */
public class Class5_BankAccountMain {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(123,"UG");
		double totInterest;
		totInterest = sa.interestPerYear();
		System.out.println("total interest in a year in savings account : "+totInterest);
		sa.accDetails();
		CurrentAccount ca = new CurrentAccount(123,"UG");
		totInterest = ca.interestPerYear();
		System.out.println("total interest in a year in current account : "+totInterest);
		ca.accDetails();
		
		

	}

}
