package A2_java_Part_1_Java_Basic;

public class Lesson_5_9_Exercise_Loop_nested_Loop_2 {
	public static void main (String [] args){

		int maxrow=9;

		for (int row = 1; row <= maxrow; ++row) {
	         
	    	  System.out.print(row+" ");
  		         if ((row % 2) == 0) {   // print a leading space for even-numbered rows
  		        	   System.out.print(" ");
  		        	}
	         for (int column = 0; column <= maxrow; ++column) {
	        	 System.out.print("# *");	 
	         }
	         System.out.print("\t");
	
	         	for(int x = row; x <= row; x++){

	         		for(int y = row; y <= ((maxrow*2)-x); y++){
	         			System.out.print("*");
	         		}

	         		for(int z = row; z <= ((x+(x-1))*2)-x; z++){
	         			System.out.print("  ");
	         		}

	         		for(int p = row; p <= ((maxrow*2)-x); p++){
	         			System.out.print("*");
	         		}
	         	
	         	System.out.print("\t");
	         		for(int y = x; y >= 1; y--){
	         			System.out.print(y);
	         		}
	         		
	         		for(int z =maxrow*2 ; z >= (row+(row-1)); z--){
	         			System.out.print(" ");
	         		}
	         		
	         		for(int y = 1; y <= (x); y++){
	         			System.out.print(y);
	         		}
	         	//Not completed 
	         	System.out.println();
	         }
		}
	}
}