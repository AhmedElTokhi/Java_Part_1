package A1_java_Part_1_Java_Introduction;
/*
 * Sum the odd numbers and the even numbers from a lowerbound to an upperbound
 */

public class Lesson6_A_Conditional_or_Decision {// Lesson6_A_Conditional_or_Decision .java"

	public static void main(String[] args) {
		int lowerbond=0; int upperbound=1000; // lowerbound initiate it to 1 and upperbound initiate it to 1000
		int sumodd=0; // create variable to sum odd numbers
		int sumeven=0; //create variable to sum even numbers
		int number=lowerbond;
		
		
		while (number<=upperbound){
			if (number %2==0){ // number is divided by 2 there is no remainder, it is mean (even)
				sumeven += number; // Same as sumEven = sumEven + number
			}else{  // if 1st condition not applied it is mean the number is(odd)
				sumodd += number; // Same as sumodd = sumodd + number
			}
			number++;  //next number
		}
	      // Print the result
		System.out.println("the sum of odd numbers between "+lowerbond+" and "+upperbound+ " is "+sumodd);
		System.out.println("the sum of even numbers between "+lowerbond+" and "+upperbound+ " is "+sumeven);
		System.out.println("The different between the two sum is "+(sumeven-sumodd));
	}

}
