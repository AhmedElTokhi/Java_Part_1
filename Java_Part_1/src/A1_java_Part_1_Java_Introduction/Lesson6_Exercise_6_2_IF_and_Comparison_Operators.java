package A1_java_Part_1_Java_Introduction;
/*
print all the leap years between AD1 and AD2010, and also print the number of leap years. 
*/
public class Lesson6_Exercise_6_2_IF_and_Comparison_Operators { //saved as Lesson6_Exercise_6_2_IF_and_Comparison_Operators.java 
	public static void main(String[] args) {
	int i=0; 			// create variable i and initialize it to 0.
	int count=0;		// create variable count and initialize it to 0.
	
	System.out.print("the leap years between AD1 and AD2010 Is ("); //print 1st part of text
	
	for (i=1;i <=2010; i++) { 						//for loop for years between 1 to 2010.
		if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)){ // leap year condition.
			count++;    					// Increment count +1.
			System.out.print(i+", ");		// Print year number as a 2nd section.
		}
}
	System.out.println(")");				// Print 3rd section of text.
	System.out.println("The leaps years count between AD1 to AD2010 is "+count); //print count of leap years
}
}