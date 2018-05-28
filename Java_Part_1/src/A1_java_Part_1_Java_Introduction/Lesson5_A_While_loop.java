package A1_java_Part_1_Java_Introduction;
/*
 * Sum from a lowerbound to an upperbound using a while-loop
 */

public class Lesson5_A_While_loop {     // Save as "While_loop.java"

	public static void main(String[] args) {
		int lowerbound=1;     //declare integer variable and initiate it to 1
		int upperbound=1000;  //declare integer variable and initiate it to 1000
		int sum =0;           //declare integer variable and initiate it to 0 to accumulate the numbers 
		
		// use while loop to sum number from lowerbound to upperbound
		int number=lowerbound; 
		while (number<=upperbound){
			sum=sum+number;    //accumulate number into sum
			++number;  		   // increment number with 1
		}
	      //Print result
		System.out.println("The summ from "+lowerbound+" to "+upperbound+" is "+sum);
	}
}