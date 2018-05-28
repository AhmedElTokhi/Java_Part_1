package A2_java_Part_1_Java_Basic;
/*
 * Excercise_Input_Circle_circumference
 */
import java.util.Scanner;    // Needed to use the Scanner
public class Lesson_7_2_1_Excercise_Input_Circle_Computation {
	
	   public static void main(String[] args) {
	      // Declare variables
	      
	      double radius, area, circumference;
	      String str;
	      // Construct a Scanner named "in" for scanning System.in (keyboard)
	      
	      Scanner in = new Scanner(System.in);

	      // Read inputs from keyboard 
	      System.out.print("Enter the radius: ");  // Show prompting message
	      radius = in.nextDouble();         // Use nextInt() to read an int
	      
	      System.out.print("The area is: ");  // Show prompting message
	      area = in.nextDouble();      // Use nextDouble() to read a double
	      
	      circumference = radius*2*Math.PI;

	      // Formatted output via println()
	      System.out.println("The circumference is: "+ circumference);
	 
	      // close the input
	      in.close();
	   }
	}

