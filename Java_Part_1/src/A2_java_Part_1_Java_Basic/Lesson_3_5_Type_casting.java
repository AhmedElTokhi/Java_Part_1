package A2_java_Part_1_Java_Basic;

public class Lesson_3_5_Type_casting {
	public static void main (String []args){
		//Type casting
	    double d = 3.5;
	    int i;
	    //i = d;            // Compilation Error: possible loss of precision (assigning a double value to an int variable)
	    //int sum = 55.66f; // Compilation Error: possible loss of precision (assigning a float value to an int variable)
	    
	    //Explicit Type Casting
	    i = (int) d;    // Cast double value of 3.5 to int 3. Assign the resultant value 3 to i
	                    // Casting from double to int truncates.

	    int xx = 3;
	    double dd;
	    dd = xx;           // OK, no explicit type casting required
	                       // d = 3.0
	    dd = (double) xx;  // Explicit type casting operator used here
	    System.out.println("The int value "+xx);
	    System.out.println("Explicit type casting\nThe double value "+dd);

	    double aDouble = 55;   // Compiler auto-casts int 55 to double 55.0
	    double nought = 0;     // Compiler auto-casts int 0 to double 0.0
	                           // int 0 and double 0.0 are different.
	    
	    System.out.println("\nCompiler auto-casts\n--------------------");
	    System.out.println("The double value "+aDouble);
	    System.out.println("The double value "+nought);
}
	
}
