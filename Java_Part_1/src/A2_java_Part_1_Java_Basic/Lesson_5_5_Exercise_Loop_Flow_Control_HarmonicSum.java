package A2_java_Part_1_Java_Basic;
/*
 *
 * */

public class Lesson_5_5_Exercise_Loop_Flow_Control_HarmonicSum  {		//save as Lesson_5_5_Exercise_Loop_Flow_Control_HarmonicSum.java 
	
	public static void main (String [] arg){
		
		int n=500;
		double L2R=0, R2L=0;
		
		for (int number = 1; number <=n; ++number){
			L2R+=(double)1/number;
		}
		System.out.println("The Harmonic Sum L2R = "+L2R);
//------------------------		
		for (int number = n; number >=1; --number){
			R2L+=(double)1/number;
		}
		System.out.println("The Harmonic Sum R2L = "+R2L);
		
		System.out.println("The R2L have more than L2R with "+ (R2L-L2R));
	} 
}
