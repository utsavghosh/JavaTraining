/**
 * 
 */
package BankAccountCode;

import java.util.*;

/**
 * @author BYO
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter 1 to create savings account. 2 to create current account");
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		if (userInput == 1) {
			System.out.println("Enter account number of your choice");
			int accNo = scan.nextInt();
			System.out.println("Enter account name of your choice");
			String accNme = scan.next();
			System.out.println("Enter initial balance of your choice\n For savings account minimum balance is 2000");
			double iniBal = scan.nextDouble();
			SavingsAccount sa = new SavingsAccount(accNo, accNme, iniBal);
			sa.display();
			System.out.println("\nEnter 1 to deposit or 2 to withdraw");
			int userInput2 = scan.nextInt();
			if (userInput2 == 1) {
				System.out.println("\nEnter the amount you want to deposit");
				double amt = scan.nextDouble();
				sa.deposit(amt);
							
			}
			else {
				System.out.println("\nEnter the amount you want to withdraw");
				double amt = scan.nextDouble();
				sa.withdraw(amt);
				System.out.println("\nEnd");
			}
				
			
			
			
		}
		else {
			System.out.println("Enter account number of your choice");
			int accNo = scan.nextInt();
			System.out.println("Enter account name of your choice");
			String accNme = scan.next();
			System.out.println("Enter initial balance of your choice\n For current account minimum balance is 4000");
			double iniBal = scan.nextDouble();
			CurrentAccount sa = new CurrentAccount(accNo, accNme, iniBal);
			sa.display();
			System.out.println("\nEnter 1 to deposit or 2 to withdraw");
			int userInput2 = scan.nextInt();
			if (userInput2 == 1) {
				System.out.println("\nEnter the amount you want to deposit");
				double amt = scan.nextDouble();
				sa.deposit(amt);
											
			}
			else {
				System.out.println("\nEnter the amount you want to withdraw");
				double amt = scan.nextDouble();
				sa.withdraw(amt);
				System.out.println("\nEnd");
			}
			
		}

	}

}
