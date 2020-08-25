
package CalculatorImportPackage;

import Calculator.CalculatorCode;
import java.util.Scanner; // This will import just the Scanner class.


public class CalculatorImportCode {

	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter any one of the following:\n1 to Substract\n2 to add\n3 to divide\n4 to multiply\n5 to find factorial\n6 to reverse the number");
		Scanner scan = new Scanner(System.in);
		CalculatorCode calc = new CalculatorCode();
		x = scan.nextInt();
		switch(x) {
		case 1:
			double a,b;
			System.out.println("\nEnter the first number to substract");
			a = scan.nextDouble();
			System.out.println("\nEnter the second number to substract from the first number");
			b = scan.nextDouble();
			System.out.println("The result of first number - second number is : " + calc.substract(a,b));
			break;
		case 2:
			System.out.println("\nEnter the first number to add");
			a = scan.nextDouble();
			System.out.println("\nEnter the second number to add to the first number");
			b = scan.nextDouble();
			System.out.println("The result of first number + second number is : " + calc.add(a,b));
			break;
		case 3:
			System.out.println("\nEnter the first number to divide");
			a = scan.nextDouble();
			System.out.println("\nEnter the second number to divide to the first number");
			b = scan.nextDouble();
			System.out.println("The result of first number / second number is : " + calc.divide(a,b));
			break;
		case 4:
			System.out.println("\nEnter the first number to mul");
			a = scan.nextDouble();
			System.out.println("\nEnter the second number to mul to the first number");
			b = scan.nextDouble();
			System.out.println("The result of first number * second number is : " + calc.multiply(a,b));
			break;
		case 5:
			System.out.println("\nEnter the number to find factorial");
			y = scan.nextInt();
			System.out.println("The result of factorial of number is : " + calc.factorial(y));
			break;
		case 6:
			System.out.println("\nEnter the number to find reverse");
			y = scan.nextInt();
			System.out.println("The result of reverse of number is : " + calc.reverse(y));
			break;
		default:
			System.out.println("Wrong entry!! Try again");
			break;
		}
		scan.close();
		
			
			
			
		}
		

	}


