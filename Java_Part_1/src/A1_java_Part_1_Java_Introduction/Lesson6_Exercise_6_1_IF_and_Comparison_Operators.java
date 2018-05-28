package A1_java_Part_1_Java_Introduction;
/*
 sum all the integers between 1 and 1000, that are divisible by 13, 15 or 17, but not by 30.
 */
public class Lesson6_Exercise_6_1_IF_and_Comparison_Operators { //Lesson6_Exercise_6_1_IF_and_Comparison_Operators

	public static void main(String[] args) {
		int lowerbond=0; int upperbound=1000; // lowerbound initiate it to 1 and upperbound initiate it to 1000
		int sum=0; // create variable to sum odd numbers
		int number=lowerbond;


		for(number=1; number <=upperbound;number++){
			// If it's divisible by 13 or 15 or 17 and not divisible by 30 and add it to sum.  
			if ((number % 13 == 0 || number % 15 == 0 || number % 17 == 0) &&number % 30 != 0) {
			    sum += number; 	
			}
	 }
		// Print the result
				System.out.println("The sum of odd that divisible by 13, 15 or 17 numbers between "+lowerbond+" and "+upperbound+ " is "+sum);
	}
}
