package Day1;

public class Day1 {

	public static void main(String[] args) {
		// Print & Println
		System.out.println("Automation test Day 1");
		System.out.print("Learning Selenium"+ " -- ");
		System.out.println("Using http://qtpselenium.com");
		
		System.out.println("-------------------------------");
		System.out.println("First line");
		System.out.println("Second line");
		System.out.println("Third Line");
		
	 // Data type
		byte H=99;
		
		int a=100;
		System.out.println(a);
		a=200;
		System.out.println(a);
		
		
		int b=999999999; //32
	    long c=999999999; //64
	   
	    double E=155.234;
	    System.out.println(E);
	    E=45;
	    System.out.println(E);
	   
	    char Q='A';
	   
	    boolean W1= true;
	    
	 // Comparison operators < > <= >= ==
	    System.out.println(1000 > 200);
	    
	    int i= 300;
	    int j=400;
	    System.out.println(i == j);
		
	 // If statement
	    
	    if (i>j){
	    	System.out.println("i is =" +i+" and it is greateer than j");
	    	
	    }else {
	    	System.out.println("j is="+j+" and it is greateer than i");
	    }
	    
	 // find the greatest Value of 3 using IF statement.
	    int x=700;
	    int y=500;
	    int z=300;
	    if (x>y & x>z){
	    	System.out.println("X="+x+" is greatest");
	    }else if (y > z){
	    	System.out.println("Y="+y+" is greatest");
	    }else{
	    	System.out.println("Z="+z+" Is greatest");
	   }
 
		String str= "We are learing Java for selenium";
		System.out.println(str);
 	}

}
