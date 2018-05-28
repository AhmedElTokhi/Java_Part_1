package A2_java_Part_1_Java_Basic;

public class Lesson_5_5_Exercise_Loop_Flow_Control_Do_while {		//saved as (Lesson_5_2_Exercise_Loop_Flow_Control) 

	public static void main (String [] args){
		/* Write a program called SumAndAverage 
		 * to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average. The output shall look like:
		 * The sum is 5050
		 * The average is 50.5 
		 */
////////////////////////////////////////////////////////////////////
System.out.println("---------- Do - While ------------");

	      double average;       // average in double
	      int lowerbound = 1;   // The lowerbound to sum
	      int upperbound = 100; // The upperbound to sum
		
		int number = lowerbound;
		int sum = 0;
		do{
			sum += number;
			++number;
			
		}while (number <= upperbound); {		
		
		System.out.println("The sum is "+ sum);
		average = (double) sum/upperbound;
		System.out.println("The average is "+ average);
		
		
	}

 }
	
	
}
