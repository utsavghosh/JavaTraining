/**
 * 
 */

/**
 * @author BYO
 *
 */
public class EMICalcProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double loanAmount = 200000;
		double ROI = 20.0;
		double time = 2.0;
		double tenure = time * 12; // since emi is monthly, convert time in years to months
		System.out.println("EMI formula: EMI = (P X R/12) X [ (1+R/12) ^N] / [ (1+R/12) ^N-1]");
		System.out.println("Principal : " + loanAmount);
		System.out.println("Rate of Interest : " + ROI);
		// System.out.println("Tenure : "+time);
		double tempVal1 = 1 + (ROI / (12 * 100));// math temp element to calculate value till tenure duration
		// System.out.println(tempVal1);
		double tempVal2 = Math.pow(tempVal1, tenure);// math temp element to calculate numerator and denominator
		// System.out.println(tempVal2);
		double EMI = loanAmount * (ROI / (12 * 100)) * (tempVal2 / (tempVal2 - 1));// putting values to equation
		System.out.println("Monthly EMI would be : " + EMI);


	}

}
