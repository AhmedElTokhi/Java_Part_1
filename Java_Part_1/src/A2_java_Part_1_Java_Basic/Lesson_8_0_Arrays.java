package A2_java_Part_1_Java_Basic;
/*
 1- Define array.
 2- array exception.
 */
public class Lesson_8_0_Arrays {
	public static void main(String [] args){
		int[] marks0;  			// 1- Declare an int array named marks
					  			// 	  marks contains a special value called null.
		
		int marks1[];  			// Same as above, but the above syntax recommended
		marks1 = new int[5];   	// Allocate 5 elements via the "new" operator
		
		// Declare and allocate a 20-element array in one statement via "new" operator
		int[] factors1 = new int[20];	// Declare, allocate a 6-element array thru initialization
		int[] numbers = {11, 22, 33, 44, 55, 66}; // size of array deduced from the number of items

		
		int[] marks2 = new int[5];   // Declare & allocate a 5-element int array
		// Assign values to the elements
		marks2[0] = 95;				// Array index start from 0
		marks2[1] = 85;
		marks2[2] = 77;
		marks2[3] = 69;
		marks2[4] = 66;				// 2- If program use array index out side [0 to arrayname.length -1]
									//	  the java display exception java.lang.ArrayIndexOutOfBoundsException
		System.out.println(marks2[0]);
		System.out.println(marks2[3] + marks2[4]);
		
		int[] factors2 = new int[6];       // Declare and allocate a 5-element int array
		int numFactors2 = factors2.length;  // numFactor is 5
		System.out.println("the factors2 array MAX. Length is "+factors2.length);
		
		// 3- In other words, for each reference to an array element, the index is checked against the array's length
		// 	  It is important to note that checking array index-bound consumes computation power, which inevitably slows down the processing. 
	}

}
