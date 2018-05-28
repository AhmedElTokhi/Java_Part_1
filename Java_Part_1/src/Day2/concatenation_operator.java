package Day2;

public class concatenation_operator {

	public static void main(String[] args) {
      //concatenation operator (+).
		
		String x= "Hello";
		String y="World";
		int a=100;
		int b=200;
	
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println("////////////////////////");
	  
      //concatenation string and numbers
		System.out.println(a+b+x+y);
	  //after string can not concatenate sum of numbers So have to use ( ).  
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
	}
	// Next: While Loop.
}
