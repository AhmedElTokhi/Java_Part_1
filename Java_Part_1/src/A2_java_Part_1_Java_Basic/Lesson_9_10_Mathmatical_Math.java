package A2_java_Part_1_Java_Basic;


public class Lesson_9_10_Mathmatical_Math {
	public static void main (String ...args){
	
		int secretNumber = (int)Math.random()*100;  // Generate a random int between 0 and 99
		System.out.println(secretNumber); 

		double radius = 5.5;
		double area = radius*radius*Math.PI;
		System.out.println("The area1 is: "+area );

		area = Math.pow(radius, 2)*Math.PI;         // Not as efficient as above
		System.out.println("The area2 is: "+area);  

		int x1 = 1, y1 = 1, x2 = 2, y2 = 2;
		double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("The distance1 is: "+distance);

		int dx = x2 - x1;
		int dy = y2 - y1;
		distance = Math.sqrt(dx*dx + dy*dy);        // Slightly more efficient
		System.out.println("The distance2 is: "+distance);
	}
}
