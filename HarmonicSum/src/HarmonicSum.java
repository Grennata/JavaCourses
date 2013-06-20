import java.io.*;


public class HarmonicSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxDenominator = 50000;
	      double sumL2R = 0.0;    
	      double sumR2L = 0.0;    
	   
	      for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
	    	  double division = 1/denominator;
	          sumL2R = sumL2R + division;
	      }
	      
	      for (int denominator = maxDenominator; denominator >= 1; --denominator) {
	    	  double division = 1/denominator;
	          sumR2L = sumR2L + division;
	      }
	      
	      System.out.println(sumL2R + " " + sumR2L);

	}

}
