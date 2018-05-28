package A2_java_Part_1_Java_Basic;
/*
 * Testing Scanner's nextLine()
 */
import java.util.Scanner;    // Needed to use the Scanner

public class Lesson_7_2_2_Input_via_Keyboard_have_white_space {
	   public static void main(String[] args) {
	      
		  Scanner in = new Scanner(System.in);
	      
		  System.out.print("Enter a string (with space): ");
	      // Use nextLine() to read entire line including white spaces, 
	      //   but excluding the terminating newline.
	      
		  String str  = in.nextLine();        // Use nextline() to read a entire line
	      System.out.printf("%s%n", str);
	      
	      in.close();						 // Close the file
	   }
	}
