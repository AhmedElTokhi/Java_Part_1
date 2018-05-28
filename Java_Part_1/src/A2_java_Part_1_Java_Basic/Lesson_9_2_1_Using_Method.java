package A2_java_Part_1_Java_Basic;
/** Example of Java Method definition and invocation */
public class Lesson_9_2_1_Using_Method {              // The entry main method
	   
	public static void main(String[] args) {

		int a = 6, b = 9, max, min;  //define variables (a, b, max, min)and add initialize value for (a, b).
		
		max = max(a, b);  // invoke method max() with arguments
		min = min(a, b);  // invoke method min() with arguments
		System.out.println(max + "," + min);
		
		a=5;			  // change variable "a" value = 5
		b=8;			  // change variable "b" value = 8
		System.out.println("The Max. of ("+a+", "+b+") is "+max(a, b)); // invoke method max()
		System.out.println("The Min. of ("+a+", "+b+") is "+min(a, b)); // invoke method min()
		}
	

////////max() method ////////////
		// The max() method returns the maximum of two given numbers
		public static int max(int number1, int number2) {
			
		//booleanExpr ? trueExpr : falseExpr
		return (number1 > number2) ? number1 : number2;
		}

//////// min() method ////////////
		// The min() method returns the minimum of two given numbers
		public static int min(int number1, int number2) {
		
		//booleanExpr ? trueExpr : falseExpr
		return (number1 < number2) ? number1 : number2;
		}
	}