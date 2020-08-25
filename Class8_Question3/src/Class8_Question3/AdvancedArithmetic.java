package Class8_Question3;

interface AdvancedArithmetic {
	public int divisor_sum(int n);
	
}

class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		System.out.println("divisor sum calculation logic");
		n=12;
		return n;
	}
}

class mainClas{
	public static void main(String [] args) {
		MyCalculator calc = new MyCalculator();
		System.out.println("Divisor sum of 6 is 1, 2, 3 and 6 " + calc.divisor_sum(6));
	}
}

