package A1_java_Part_1_Java_Introduction;
/*
 * Print the surface area and volume of a cylinder, given its radius and height .
 */
public class Lesson3_Exercise_3_2_Cylindercaculation {

	public static void main(String[] args) {
		// declare variables that hold cylinder surface area an volume 
		double radius, area, volume, Height;
		// Declare double variables(PI) and assign value 
		double PI=3.14159265;
		//assign value for (radius) variable
		radius=1.2;
		//assign value for (Height) variable
		Height=5;
				
		//cylinder area and volume
		area= (2*PI*radius*Height+2*PI*radius*radius);
		volume=PI*radius*radius*Height;
		
		//print result
		
		System.out.println("The cylinder Radius= "+radius+" and Height= "+Height);
		System.out.println("The Area is "+area);
		System.out.println("The Volume is "+volume);
		
		
		
	}

}
