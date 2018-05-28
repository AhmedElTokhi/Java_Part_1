package A2_java_Part_1_Java_Basic;

public class Lesson_3_5_1_Sum1To100 {
	   public static void main(String[] args) {
		      int sum = 0, number = 1;
		      double average;
		      
		      while (number <= 100) {
		         sum += number;      // Final sum is int 5050
		         ++number;
		      }
		      average = sum / 100;   // Won't work (average = 50.0 instead of 50.5)
		      System.out.println("Average is " + average);  // Average is 50.0
		      
		      
		      average = (double)sum / 100;     // Cast sum from int to double before division
		      System.out.println("Average is " + average);  // Average is 50.5
		      
		      average = sum / (double)100;     // Cast 100 from int to double before division
		      System.out.println("Average is " + average);  // Average is 50.5
		      
		      average = sum / 100.0;
		      System.out.println("Average is " + average);  // Average is 50.5
		      
		      average = (double)(sum / 100);   // Won't work. because of () get high priority 
		      								   //so it converted to int before convert it to double 
		      System.out.println("Average is " + average);  // Average is 50.0 

		      // Increment/Decrement
		      int x = 5;
		      System.out.println(x++);  // Print x (5), then increment x (=6). Output is 5. (x++ returns the oldX.)
		      
		      x = 5;
		      System.out.println(++x);  // Increment x (=6), then print x (6). Output is 6. (++x returns x+1.)

		   }

}
