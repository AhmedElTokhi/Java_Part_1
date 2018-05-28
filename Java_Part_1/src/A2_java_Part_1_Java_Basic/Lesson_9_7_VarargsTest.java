package A2_java_Part_1_Java_Basic;

public class Lesson_9_7_VarargsTest {

		// A method which takes a variable number of arguments (varargs)
		   public static void doSomething(String... strs) {
		      System.out.print("Arguments are: ");
		      for (String str : strs) {					//looping through variable as an Array
		         System.out.print(str + ", ");
		      }
		      System.out.println();
		      System.out.println();
		   }
		 
		// A method which takes exactly two arguments
		   public static void doSomething(String s1, String s2) {
		      System.out.println("Overloaded version with 2 args: " + s1 + ", " + s2);
		      System.out.println();
		   }
		 
		   // Cannot overload with this method - crash with varargs version
		   // public static void doSomething(String[] strs)
		 
		 // Test main() method
		 // Can also use String... instead of String[]
		   public static void main(String... args) {
		      doSomething("Hello", "world", "again", "and", "again");
		      doSomething("2nd Hello", "world");
		 
		      String[] strs = {"apple", "orange"};
		      doSomething(strs);  // invoke varargs version
		   }
	}
