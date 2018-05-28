package A2_java_Part_1_Java_Basic;

public class Lesson_5_2_Conditional_Flow_Control {    
	public static void main (String [] args) {
		
		int mark=50, a=10, b=5, max, abs;
		
		if (mark >= 50) 
			   System.out.println("PASS");   // Only one statement, can omit { } but NOT recommended
			else {                           // More than one statements, need { }
			   System.out.println("FAIL");
			   System.out.println("Try Harder!");
			   System.out.println("------------"); 
			   }
			   
			   System.out.println((mark >= 50) ? "++PASS" : "FAIL");
			   max = (a > b) ? a : b;   // RHS returns a or b
			   abs = (a > 0) ? a : -a;  // RHS 
			   
			   
			}
	
	}

