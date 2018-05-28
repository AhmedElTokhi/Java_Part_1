package A2_java_Part_1_Java_Basic;
/*
 * Excercise_Input_Circle_circumference & sentinel value
 */
import java.util.Scanner;

public class Lesson_7_2_1_Excercise_User_Input_Sentinel_Value {
	public static void main (String [] args){
	
		double radius, area, circumference;
	
		Scanner in= new Scanner(System.in);
	
		// Read first input
		System.out.println("Enter a positive radius value or -1 to exit: ");
		radius = in.nextDouble();

	while (radius != -1) {  // Continue only if input is not -1
		System.out.println("Enter The area value: ");
		area = in.nextDouble();
		
		circumference = radius*2*Math.PI;
		
		System.out.println("The circumference is : "+circumference);
		
	   // Read next input (Take note that you need to repeat these statements)
	   System.out.print("Enter a positive radius value or -1 to exit: ");
	   radius = in.nextDouble();
	}
	System.out.println("The "+radius+" is not valid value");
in.close();
}
}
