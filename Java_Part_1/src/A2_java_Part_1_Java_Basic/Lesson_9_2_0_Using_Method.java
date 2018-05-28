package A2_java_Part_1_Java_Basic;

public class Lesson_9_2_0_Using_Method {              // The entry main method
		   
			public static void main(String[] args) {
		      double r = 1.1, area, area2;
		    
		      area = getArea(r);								// Call (Invoke) method getArea()				
		      System.out.println("area is " + area);
		      
		      area2 = getArea(2.2);				      			// Call method getArea() again
		      System.out.println("area 2 is " + area2);
		     
		      System.out.println("area 3 is " + getArea(3.3));	// Call method getArea() one more time
		   }

/////// min() method ////////////		 
		   // Method getArea() Eefinition.
		   // Compute and return the area (in double) of circle given its radius (in double).
		   public static double getArea(double radius) {
		      return radius * radius * Math.PI;
		   }
		}

