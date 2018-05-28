package A2_java_Part_1_Java_Basic;

public class Lesson_5_5_Exercise_Loop_Flow_Control_For_loop {		//saved as (Lesson_5_2_Exercise_Loop_Flow_Control) 

	public static void main (String [] args){
		/* Write a program called SumAndAverage 
		 * to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average. The output shall look like:
		 * The sum is 5050
		 * The average is 50.5 
		 */
////////////////////////////////////////////////////////////////////
		System.out.println("----------For loop-----(From: 1 To: 100)-------");
	      int sum = 0;          // Store the accumulated sum, init to 0
	      double average;       // average in double
	      int lowerbound = 1;   // The lowerbound to sum
	      int upperbound = 100; // The upperbound to sum

	      // Use a for-loop to sum from lowerbound to upperbound
	      for (int number = lowerbound; number <= upperbound; ++number) {
	         sum += number;     
	}

		System.out.println("The sum is "+ sum);
		average = (double) sum/upperbound;
		System.out.println("The average is "+ average);	

////////////////////////////////////////////////////////////////////
System.out.println("----------For loop-----(From: 111 To: 8899)-------");

	int sum2 = 0, count=0;          // Store the accumulated sum, init to 0
	double average2;       // average in double
	int lowerbound2 = 111;   // The lowerbound to sum
	int upperbound2 = 8899; // The upperbound to sum

	// Use a for-loop to sum from lowerbound to upperbound
	for (int number2 = lowerbound2; number2 <= upperbound2; ++number2) {
		sum2 += number2;     
		++count;
	}
	
	System.out.println("The count is "+ count);
	average2 = (double) sum2/count;
System.out.println("The average is "+ (double) average2);	

		
		
	}
	

 }

