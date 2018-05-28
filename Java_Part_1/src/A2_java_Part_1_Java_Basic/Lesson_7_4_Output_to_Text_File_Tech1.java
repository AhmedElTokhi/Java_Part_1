package A2_java_Part_1_Java_Basic;
/*
 * Output to File.
 * Technique 1: Declare "throws FileNotFoundException" in the enclosing main() method
 */
import java.io.File;
import java.util.Formatter;             // <== note
import java.io.FileNotFoundException;   // <== note

public class Lesson_7_4_Output_to_Text_File_Tech1 {
	  public static void main(String[] args) throws FileNotFoundException {   // <== note
	    // Construct a Formatter to write formatted output to a text file 
	    
		Formatter out = new Formatter(new File("out.txt"));
	    // Write to file with format() method (similar to printf())
	    int num1 = 1234;
	    double num2 = 55.66;
	    String name = "Paul";
	    
	    out.format("Hi %s,%n", name);
	    out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1 + num2);
	    out.close();                 // Close the file
	    System.out.println("Done");  // Print to console
	  }
	}
