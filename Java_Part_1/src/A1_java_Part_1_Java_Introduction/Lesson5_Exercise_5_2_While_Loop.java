package A1_java_Part_1_Java_Introduction;
/*
 * Sum Odd value from a lowerbound to an upperbound using a while-loop
 */

public class Lesson5_Exercise_5_2_While_Loop {     // Save as "While_Loop_excersie_5_2.java"

	public static void main(String[] args) {

			int lowerbound=1;     //declare integer variable and initiate it to 1
			int upperbound=1000;  //declare integer variable and initiate it to 1000
			int sum =0;           //declare integer variable and initiate it to 0 to accumulate the numbers 
			
			// use while loop to sum number from lowerbound to upperbound
			int number=lowerbound; 
			while (number<=upperbound){
				sum=sum+number;    //accumulate number into sum
				number=number+2;  		   // increment number with 1
			}
		      //Print result
			System.out.println("The sum of odd numbers from "+lowerbound+" to "+upperbound+" is "+sum);
		}
	}