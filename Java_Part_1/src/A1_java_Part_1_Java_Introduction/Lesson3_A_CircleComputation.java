package A1_java_Part_1_Java_Introduction;
/*
 * Print the area and circumference of a circle, given its radius.
 */
public class Lesson3_A_CircleComputation { //saved as CircleComputation.java

	public static void main(String[] args) {
		// Declare double (real-number) variables to hold radius, area and circumference
		double radius, area, circumference;
		// Declare double variables(PI) and assign value 
		double PI=3.14159265;
		//assign value for (radius) variable
		radius=1.2;
		
		//calculate area and circumference
		area= radius * radius * PI;
		circumference= 2 * radius * PI;
		
		// print result
		System.out.print("the radius is ");
		System.out.println(radius);
		
		System.out.print("the area is ");
		System.out.println(area);
		
		System.out.print("The circumference is ");
		System.out.println(circumference);
		
		
		
	}

}
