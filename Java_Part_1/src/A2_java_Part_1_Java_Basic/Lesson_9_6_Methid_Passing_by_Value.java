package A2_java_Part_1_Java_Basic;

public class Lesson_9_6_Methid_Passing_by_Value {
	
		   public static void main(String... args) {
		      
			  int number = 8;                // primitive type
		      System.out.println("caller:  BEFORE calling the method, number is: " + number);  // 8
		      
		      int result = increment(number); // invoke method increment
		      System.out.println("caller: AFTER calling the method, number is: " + number);   // 8
		      
		      System.out.println("The result received from increment method is: " + result);  // 9	      
		      
		   }


//////////////Main Method increment//////////////
		   public static int increment(int number) {
			  System.out.println();
			  System.out.println("Method: Inside method, before operation, number is " + number); // 8
		      ++number;  // change the parameter
		      
		      System.out.println("Method: Inside method, after operation, number is " + number);  // 9
		      System.out.println();
		      return number;
		   }
		}