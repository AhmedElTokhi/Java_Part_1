package A2_java_Part_1_Java_Basic;

public class Lesson_3_Arithmetic_Operators {
	   public static void main(String[] args) { 
		
		byte b1 = 1, b2 = 2;
//	    byte b3 = b1 + b2;  // Compilation Error: possible loss of precision
		                    // b1+b2 returns an int, cannot be assigned to byte
		
		byte b4 = 1;
//		byte b2 = -b4;  // Compilation Error: possible loss of precision
		                // -b1 returns an int, cannot be assigned to byte
		
	}
}
