package A2_java_Part_1_Java_Basic;

public class Lesson_5_5_Loop_Flow_Control {
	public static void main (String []args){
	
		// Input with validity check
		boolean valid = false;
		System.out.println("The variable before= "+valid);
		int number=0;
		do {
			
		  // prompt user to enter an int between 1 and 10
	
		  // if the number entered is valid, set done to exit the loop
		  if (number >=1 && number <= 10) {
		     valid = true;
		  }
		} while (!valid);   // Need a semi-colon to terminate do-while
		System.out.println("The variable after= "+valid);
		
		
	//Empty for-loop
		//for ( ; ; ) { body }; 
		//will execute continuously (infinite loop). You need to use a break statement to break out the loop.
		
		
	//for-loop with Comma Separator
		/* 
		 * for (int row = 0, col = 0; row < SIZE; ++row, ++col); {
			   // Process diagonal elements
			   ......
				}*/

		
		
	}
}
