package A2_java_Part_1_Java_Basic;
/*
 * Illustrate "int" overflow
 */
public class Lesson_3_4_Overflow_and_underflow {
	   public static void main(String[] args) {
	      // Range of int is [-2147483648, 2147483647]
	      int i1 = 2147483647;  // maximum int
	      System.out.println(i1 + 1);   // -2147483648 (overflow!)
	      System.out.println(i1 + 2);   // -2147483647
	      System.out.println(i1 * i1);  // 1
	      
	      int i2 = -2147483648;  // minimum int
	      System.out.println(i2 - 1);   // 2147483647 (overflow!)
	      System.out.println(i2 - 2);   // 2147483646
	      System.out.println(i2 * i2);  // 0
	     
	      // underflow (truncated integer)
	      float x=1;
	      float y=2;
	      int z= 1/2; 	//is = 0.5 but will truncate digit after . because of integer value.
	      
	      System.out.println("Z value is "+z);
	    // can use (www.securecoding.cert.org)to ensure source code Overflow and underflow. 
	   }
}
