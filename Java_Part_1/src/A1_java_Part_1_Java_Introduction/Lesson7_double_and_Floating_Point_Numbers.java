package A1_java_Part_1_Java_Introduction;
/*
 * Convert temperature between Celsius and Fahrenheit
 */

public class Lesson7_double_and_Floating_Point_Numbers { //saved as Lesson7_double_and_Floating_Point_Numbers.java 

	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		celsius=37.5;
		fahrenheit=celsius*9.0/5.0+32.0;
		System.out.println("C degree "+celsius+" = fahernheit degree "+fahrenheit);
		
		fahrenheit=100;
		celsius=(fahrenheit-32.0)*5.0/9.0;
		System.out.println("fahernheit degree "+fahrenheit+" = C degree "+celsius);
	}

}
