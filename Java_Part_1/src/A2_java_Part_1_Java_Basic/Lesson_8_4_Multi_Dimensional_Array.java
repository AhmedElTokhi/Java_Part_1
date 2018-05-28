package A2_java_Part_1_Java_Basic;
/*
- Define 2dimention array.

 */
public class Lesson_8_4_Multi_Dimensional_Array {
	public static void main(String[] args){

		int grid0[][] = new int[12][8];   // a 12×8 grid of int
		grid0[0][0] = 8;
		grid0[1][1] = 5;
		
		System.out.println("The array Number of rows is: "+grid0.length);      // 12 Row
		System.out.println("The array Number of coulmns is: "+grid0[0].length);   // 8 8 columns		

		grid0[0][0]= 10;
		System.out.println("The value of array position [0][0] is: "+grid0[0][0]);
		
		grid0[0][1]=20;
		System.out.println("The value of array position [0][1] is: "+grid0[0][1]);
		System.out.println();
		
System.out.println("////////////Fill and Print 2D array");
		
	      int[][] grid1 = new int[12][8];   // A 12x8 grid, in [row][col] or [y][x]
	      int numRows = grid1.length;       // 12
	      int numCols = grid1[0].length;    // 8
	   
	      // Fill in grid
	      for (int row = 0; row < numRows; ++row) {
	         for (int col = 0; col < numCols; ++col) {
	            grid1[row][col] = row*numCols + col + 1;
	         }
	      }
	   
	      // Print grid
	      for (int row = 0; row < numRows; ++row) {
	         for (int col = 0; col < numCols; ++col) {
	            System.out.printf("%3d", grid1[row][col]);
	            
	            //System.out.print("   "+grid1[row][col]);
	         }
	         System.out.println();
	      }
System.out.println();

System.out.println("////////////2D With Different Length");

	      int[][] grid3 = {						//define 2D array with different rows length (using values)
	    	        		{1, 2},
	    	        		{3, 4, 5},
	    	        		{6, 7, 8, 9}
	    	      		};
	    	 
	    	      // Print grid
	    	      for (int y = 0; y < grid3.length; ++y) {
	    	         for (int x = 0; x < grid3[y].length; ++x) {
	    	            System.out.printf("%2d", grid3[y][x]);
	    	         }
	    	         System.out.println();
	    	      }
	    	 
	    	      int[][] grid4 = new int[3][];    //define 2D array with different rows length (using length)
	    	      grid4[0] = new int[2];
	    	      grid4[1] = new int[3];
	    	      grid4[2] = new int[4];
	    	 
	    	      // Print grid - all elements init to 0
	    	      for (int y = 0; y < grid4.length; ++y) {
	    	         for (int x = 0; x < grid4[y].length; ++x) {
	    	            System.out.printf("%2d", grid4[y][x]);
	    	         }
	    	         System.out.println();
	    	      }
	    	 }
	}
