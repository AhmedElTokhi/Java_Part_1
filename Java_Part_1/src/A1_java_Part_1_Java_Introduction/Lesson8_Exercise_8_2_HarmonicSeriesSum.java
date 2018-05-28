package A1_java_Part_1_Java_Introduction;
/*
1.	Write a program called HarmonicSeriesSum to compute the sum of a harmonic series 1 + 1/2 + 1/3 + 1/4 + .... + 1/n, where n = 1000.
*/
public class Lesson8_Exercise_8_2_HarmonicSeriesSum {   //saved as Lesson8_Exercise_8_2_HarmonicSeriesSum.java

	public static void main(String[] args) {
		int max=1000;	// create integer variable max and initiate it to 1000.
		double sum=0.0;	// create double variable sum and initiate it to 0.0.
		
			for (int n=1; n<=max; n*=2){ //Start loop that sum 1+ 1/n that increased by (double of 2) every loop.
				double x=1.0/n;				//calculate 1/n in  x variable per loop.
				sum +=x;					//Accumulate double numbers in  sum variable.
			}
				//Print
			
		System.out.println("Sum of 1+ 1/2+ 1/4+ 1/8+ 1/16...1/"+max+" = "+sum);
		}	

}
