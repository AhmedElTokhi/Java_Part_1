package A2_java_Part_1_Java_Basic;
/*
 GradesAverage,
 1- which prompts user for the number of students.
 2- Reads it from the keyboard, and saves it in an int variable called numStudents.
 3- It then prompts user for the grades of each of the students and saves them in an int array called grades.  
 4- Your program shall check that the grade is between 0 and 100.
 */
import java.util.Scanner;


public class Lesson_8_1_Exercise_GradesAverage {
	
	public static void main(String [] arg){
	
	
	int numStudents, sum = 0;
	
	Scanner Studentcount= new Scanner (System.in);
	
	System.out.println("Please enter number of student: ");
	numStudents= Studentcount.nextInt();
	
	int [] grades = new int [numStudents];
	int count= grades.length;
	
	for (int i=0; i<grades.length; ++i){
		
	 System.out.println("Please enter studient Number "+(i+1)+" Degree: ");
	 
	 int checknum= Studentcount.nextInt();
		
	 	while (checknum >100){
			System.out.println("Invalid grade, try again...");
			checknum= Studentcount.nextInt();	
	 		}	

	 	grades [i]=checknum;
		
		sum += grades [i];
	}	
	System.out.println("The average is : "+sum /count);

	Studentcount.close();		//close the input
  }
}
