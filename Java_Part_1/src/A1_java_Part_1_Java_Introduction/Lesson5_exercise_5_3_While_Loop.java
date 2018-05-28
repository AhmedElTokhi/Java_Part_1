package A1_java_Part_1_Java_Introduction;
/*
 * Sum the numbers between from a lowerbound to an upperbound that are divisible by 7 using a while-loop
 */

public class Lesson5_exercise_5_3_While_Loop {     // Save as "While_Loop_excersie_5_3.java"

	public static void main(String[] args) {

			int lowerbound=7;     //declare integer variable and initiate it to 7
			int upperbound=1000;  //declare integer variable and initiate it to 1000
			int sum =0;           //declare integer variable and initiate it to 0 to accumulate the numbers 
			
			// use while loop to sum number from lowerbound to upperbound
			int number=lowerbound; 
			while (number<=upperbound){
				sum=sum+number;    //accumulate number into sum
				number=number+7;  		   // increment number with 7
			}
		      //Print result
			System.out.println("The sum of numbers divisible by 7 from "+lowerbound+" to "+upperbound+" is "+sum);
		}
	}