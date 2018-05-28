package A2_java_Part_1_Java_Basic;
/*
 * Testing to scan a text file value
 */
import java.util.Scanner;    // Needed to use the Scanner
import java.io.File;                    // Needed for file operation
import java.io.FileNotFoundException;   // Needed for file operation

public class Lesson_7_2_3_Input_via_Text_File {
	   public static void main(String[] args) throws FileNotFoundException {
		
		      Scanner in = new Scanner(new File("in.txt"));  // Scan input from text file
		      
		      int num1 = in.nextInt();      // Read int
		      double num2 = in.nextDouble();   // Read double
		      String name = in.next();         // Read String
		 
		      System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", name, num1, num2, num1+num2);
		      in.close();					   // Close the file
		   }
		}

