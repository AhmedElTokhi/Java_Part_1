package A2_java_Part_1_Java_Basic;

public class Lesson_5_9_Exercise_Loop_nested_Loop {
	   public static void main(String[] args) {

		   int maxrow = 8;
		      for (int row = 0; row <= maxrow; ++row) {
        		         
		    	  System.out.print(row+" ");
        		         if ((row % 2) == 0) {   // print a leading space for even-numbered rows
        		        	   System.out.print(" ");
        		        	}
		         for (int column = 0; column <= maxrow; ++column) {
		        	 System.out.print("# ");
		            }
		         System.out.println();
		         }
   } 
}


