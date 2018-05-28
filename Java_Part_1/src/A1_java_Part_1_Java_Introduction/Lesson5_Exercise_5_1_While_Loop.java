package A1_java_Part_1_Java_Introduction;
/*
 * Sum from a lowerbound to an upperbound using a while-loop
 */

public class Lesson5_Exercise_5_1_While_Loop {     // Save as "While_Loop_excersie_5_1.java"

	public static void main(String[] args) {

			int lowerbound=9;     //declare integer variable and initiate it to 9
			int upperbound=888;  //declare integer variable and initiate it to 888
			int sum =0;           //declare integer variable and initiate it to 0 to accumulate the numbers 
			
			// use while loop to sum number from lowerbound to upperbound
			int number=lowerbound; 
			while (number<=upperbound){
				sum=sum+number;    //accumulate number into sum
				++number;  		   // increment number with 1
			}
		      //Print result
			System.out.println("The sum from "+lowerbound+" to "+upperbound+" is "+sum);
		}
	}