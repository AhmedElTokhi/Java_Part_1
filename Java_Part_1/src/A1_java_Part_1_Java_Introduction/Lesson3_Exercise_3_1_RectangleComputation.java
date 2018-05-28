package A1_java_Part_1_Java_Introduction;
/*
 * Print the  area and perimeter of a rectangle, given its length and width.
 */

public class Lesson3_Exercise_3_1_RectangleComputation { //saved as RectangleComputation_Excersise.java

	public static void main(String[] args) {
	// Declare double (real-number) variables to hold area, perimeter.
		double area, perimeter;
		
		int x=5; //declare rectangle length variable and assign value.
		int y=7; //declare rectangle width variable and assign value.
		
		//calculate rectangle area, perimeter.
		perimeter=5+5+7+7;
		area= 5*7;
		
		//print result
		
	System.out.println("The rectangle X= "+x+" and Y= "+y);
	System.out.println("The area is "+ area);
	System.out.println("The perimeter is "+ perimeter);
	}

}
