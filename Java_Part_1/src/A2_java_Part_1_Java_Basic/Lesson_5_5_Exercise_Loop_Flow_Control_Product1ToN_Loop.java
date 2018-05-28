package A2_java_Part_1_Java_Basic;

public class Lesson_5_5_Exercise_Loop_Flow_Control_Product1ToN_Loop {
	
	public static void main (String [] arg){
		
		int product=1;
		int lowerval=1, upperval=13;
		
		for (int number = lowerval; number <=upperval; ++number){
			product*=number;
		}
		System.out.println("The product Value from "+lowerval+" to "+upperval+" = "+product);
	} 
}
