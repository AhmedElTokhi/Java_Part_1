package A1_java_Part_1_Java_Introduction;
/*
Lesson 12.  Mixing int and double, and Type Casting
*/
public class Lesson8_2_1_Type_Casting_Operator {

	public static void main(String[] args) {
		
		double d=5.5;
		int i;
	
		i=(int)d;		//assign an double value to a integer variable using (type casting)operator 
		
		System.out.println("The double valriable valueis "+d);
		System.out.println("The integer variable contain part of double value("+d+") after use (type casting) operator that = "+i);
		
		i=(int)100.12;	//assign an double value to a integer variable using (type casting)operator
		System.out.println("The integer variable contain part of double value (100.12) after use (type casting) operator that = "+i);
	}

}
