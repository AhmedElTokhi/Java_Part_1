package A2_java_Part_1_Java_Basic;
/** Testing Method Overloading 
each version operates on different set of parameters - known as method overloading. 
The versions shall be differentiated by the (numbers, types, or orders) of the parameters*/

public class Lesson_9_8_Testing_Method_Overloading {

	   public static void main(String[] args) {
	      System.out.println("Average Methos Version 1 is: "+average(8, 6));     
	      													 // invoke "average" method version 1
	      System.out.println("Average Methos Version 2 is: "+average(8, 6, 9));  
	      													 // invoke "average" method version 2
	      System.out.println("Average Methos Version 3 is: "+average(8.1, 6.1)); 
	      													 // invoke "average" method version 3
	      System.out.println("Average Methos Version 3 is: "+average(8, 6.1));	 
	      										// int 8 autocast to double 8.0, invoke version 3

//System.out.println("Average Methos Version 3 is: "+average(1, 2, 3, 4));
	      // average(1, 2, 3, 4)  // Compilation Error - no such method
	   }
	   // Version 1 takes 2 int's
	   public static int average(int n1, int n2) {
	      return (n1 + n2)/2;  // int
	   }
	   // Version 2 takes 3 int's
	   public static int average(int n1, int n2, int n3) {
	      return (n1 + n2 + n3)/3;   // int
	   }
	   // Version 3 takes 2 doubles
	   public static double average(double n1, double n2) {
	      return (n1 + n2)/2.0;  // double
	   }
	}

