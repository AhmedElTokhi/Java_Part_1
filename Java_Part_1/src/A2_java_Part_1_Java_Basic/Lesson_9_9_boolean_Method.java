package A2_java_Part_1_Java_Basic;
/**
 *  Testing boolean method (method that returns a boolean value)
 */

public class Lesson_9_9_boolean_Method {

	   // This method returns a boolean value
	   /*public static boolean isOdd(int number) {
	      if (number % 2 == 1) {
	         return true;
	      } else {
	         return false;
	      }
	   }
	
// This seemingly correct codes produces false for -5, because -5%2 is -1 instead of 1. 
//So You use the following code
//////////////////////code version 2///////
	/*   public static boolean isOdd(int number) {
	   if (number % 2 == 0) {
		      return false;
		   } else {
		      return true;
		   }
		}
/*the correct answer, but is poor. For boolean method, you can simply return the resultant 
 * boolean value of the comparison, instead of using a conditional statement, as follow:*/
//////////////////////code version 3///////	   
	   public static boolean isEven(int number) {
		   return (number % 2 == 0);
		}
		public static boolean isOdd(int number) {
		   return !(number % 2 == 0);
		}

	   public static void main(String[] args) {
	      System.out.println("The 5 number is odd? "+isOdd(5));  // true
	      System.out.println("The 6 number is odd? "+isOdd(6));  // false
	      System.out.println("The -5 number is odd? "+isOdd(-5)); // false
System.out.println("---------------");
	      System.out.println("The 5 number is even? "+isEven(5));  // true
	      System.out.println("The 6 number is even? "+isEven(6));  // false
	      System.out.println("The -5 number is even? "+isEven(-5)); // false

	   }
	}
