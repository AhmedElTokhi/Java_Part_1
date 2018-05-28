package A1_java_Part_1_Java_Introduction;
/*
 * Sum of the square of all the numbers from a lowerbound to an upperbound using a while-loop
 */

public class Lesson5_Exercise_5_4_While_Loop {     // Save as "While_Loop_excersie_5_4.java"

	public static void main(String[] args) {

			int lowerbound=1;     //declare integer variable and initiate it to 1
			int upperbound=100;  //declare integer variable and initiate it to 100
			int sum =0;           //declare integer variable and initiate it to 0 to accumulate the numbers 
			
			// use while loop to sum number from lowerbound to upperbound
			int number=lowerbound;int i=1;int square=1; 
			while (i<=upperbound){
				i++;
				sum=sum+square;                 //accumulate "square" valueinto sum
				++number;    				// Increase variable number count with 1
				square=number*number;  		   // calculate square of number value and store it in "square" variable
			}
		      //Print result
			System.out.println("The sum of square numbers from "+lowerbound+" to "+upperbound+" is "+sum);
		}
	}