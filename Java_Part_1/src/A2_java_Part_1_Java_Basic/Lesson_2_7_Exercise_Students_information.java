package A2_java_Part_1_Java_Basic;
/*
 The program will maintain information about students
 */

public class Lesson_2_7_Exercise_Students_information { //saved as "The system shall maintain information about students.java"
	public static void main(String[] args) {
	byte id, year_of_study;
	String name, address, degree ="B.Sc.", GPA_average;
	char gender;
	short height, weight;
	boolean Scholar, tuitiongrant;
	long phonenumber; 
	int DOB= 2147483647;
//---------------------------------------	 
//	float average = 55.66;      // Error! RHS is a double. Need suffix 'f' for float.
	float average = 55.66f;
//---------------------------------------


	char letter = 'a';                 // Same as 97
	char anotherLetter = 98;           // Same as the letter 'b'
	System.out.println(letter);        // 'a' printed
	System.out.println(anotherLetter); // 'b' printed instead of the number
	anotherLetter += 2;                // 100 or 'd'
	System.out.println(anotherLetter); // 'd' printed
	
}
}
