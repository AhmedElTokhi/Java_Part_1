package A2_java_Part_1_Java_Basic;
/*
 Hex2Bin to convert a hexadecimal string into its equivalent binary string.
 */
import java.util.Scanner;

public class Lesson_8_1_Exercise_Array_for_Table_Lookup {
	
	public static void main(String [] arg){
	
	String[] hexBits = {"0000", "0001", "0010", "0011",		//Create string "hexBits" array that store Hexa Decimal code
            			"0100", "0101", "0110", "0111",
            			"1000", "1001", "1010", "1011",
            			"1100", "1101", "1110", "1111"};
	
	
	Scanner sc= new Scanner (System.in);					// Create new Scanner "To Receive user input value"

	System.out.println("Enter a Hexadecimal string -Without space-: ");	 	// Print MSG to end user.
	String txt= sc.next();									// receive user input and Store it in String variable "txt".
	
	System.out.print("The equivalent binary for hexadecimal "+txt+" is: "); //display MSG for user.
	for (int i=0; i<txt.length(); ++i){						//for loop based on entered value length
		
	System.out.print(hexBits[i]+" ");						//Print "Hexa Decimal" code after look up User value in "hexBits" array
		}		
	
	sc.close();		//close the input
  }
 }

