package A1_java_Part_1_Java_Introduction;
/*
 * product of numbers from a lowerbound to an upperbound using a while-loop
 */
public class Lesson5_Exercise_5_5_While_Loop { //save as "While_Loop_excersie_5_5.java"

	public static void main(String[] args) {
		int number1=1; 	  //Declare variable number1 and initialize it to 1
		int number2=10;  //Declare variable number2 and initialize it to 100
		int product=1;	  //
		
		
		int i=number1;        //Declare variable number3 and initialize it to 0 to use it in while loop;
		while (i<number2){   
		i++;
		product = product * number1;
		++number1;
		}
		System.out.println("The product of numbers between "+number1+" and "+number2+" is "+product );
	}
}
