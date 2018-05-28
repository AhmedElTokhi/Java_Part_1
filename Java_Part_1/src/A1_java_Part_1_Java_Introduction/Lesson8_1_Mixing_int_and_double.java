package A1_java_Part_1_Java_Introduction;
/*
 Lesson 12.  Mixing int and double, and Type Casting
 */
public class Lesson8_1_Mixing_int_and_double { //save as Lesson8_1_Mixing_int_and_double.java 

	public static void main(String[] args) {
		int i=3;
		double d;
		
		d=i;		//assign an integer value to a double variable

		//Print variable d value to monitor result value have (.0)
		System.out.println("Double variable D ="+d);
		
		d=88;
		System.out.println("Double variable D new value="+d);
		double x=4.55; 
		int e;
		//CANNOT assign an double value to an integer variable DIRECTRLY
//		e=x;		
//		e=100.5; 	
	}

}
