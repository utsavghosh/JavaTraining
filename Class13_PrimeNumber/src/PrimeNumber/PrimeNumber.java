package PrimeNumber;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ente the number till where you want to find the prime numbers\n");
		try {
			n = scan.nextInt();
			if(n>0) {
				prime(n);
			}
			else {
				System.out.println("Please enter positive integer\n");
			}
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Please enter only integers\n");
		}
			

	}
	
	public static void prime(int x) {
		int i;
		//boolean isPrime = true;
		if (x==0 || x==1)
			System.out.println("Not a prime\n");
		else {
			for (i=2;i<=x;i++) {
				boolean isPrime = true;
				for (int j=2;j<=i/2;j++) {
					if (i%j==0) {
						isPrime = false;
						break;
				}
				
				}
				if(isPrime == true)
					System.out.println("\nPrime Number: "+ i);
				
			}
			
		}
		
	}

}
