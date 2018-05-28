package Day2;

public class Tow_dimension_array {

	public static void main(String[] args) {

		  //(2 dimension)Arrays [Rows][Column]
		String x[][]=new String [3][4];
	  //First Row
		x [0][0]="0,0 value";
		x [0][1]="0,1 Value";
		x [0][2]="0,2 Value";
		x [0][3]="0,3 Value";

	  //Second Row
		x [1][0]="1,0 value";
		x [1][1]="1,1 Value";
		x [1][2]="1,2 Value";
		x [1][3]="1,3 Value";
		
	  //Third Row
		x [2][0]="2,0 value";
		x [2][1]="2,1 Value";
		x [2][2]="2,2 Value";
		x [2][3]="2,3 Value";
		
	  //Print No of rows		
		System.out.println("Array rows No. " + x.length);
	  //Print No of columns of 2 dimension arrays
		System.out.println("ArraY column No." + x[0].length);		
		
		System.out.println("//////////////////////////////");
				
		for (int r=0; r<x.length; r++){
			for (int c=0; c<x[r].length; c++){
			System.out.print(x[r][c]+"--");
			}
			System.out.println();
		}		
		
		System.out.println("/////////////same result using simple inner for loop/////////////////");
		int row=x.length;
		int col=x[0].length;
		
		for (int r=0; r<row; r++){
			for (int c=0; c<col; c++){
			System.out.print(x[r][c]+"--");
			}
			System.out.println();
		}		
		
		  //Every variable/arrays can store ONLY Its Data Type not other type as following
		// int a1=1111;    // Integer variable store number .....it is okay.  
		// int x1= "ssss"; // Integer variable store string .....it is NOT accepted.
		// String Z1=2222; // string variable store integer .....it is NOT accepted.
			    
		 //some times we deal with unknown data type of	variables/ arrays so we can use (object).
			Object ar[]=new Object[4];
			 ar[0]="Hello";
			 ar[1]=01234567;
			 ar[2]=true;
			 ar[3]=11.11;
			 
			 System.out.println("//////////////////////////////");
			 for (int i=0; i<ar.length;i++){
			 System.out.println("objcet array is "+ ar[i]);
			 }
	}
	// Next: Function in day2 video 48:44 Min.
	
}
