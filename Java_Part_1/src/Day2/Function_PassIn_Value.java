package Day2;

public class Function_PassIn_Value {

	public static void main(String[] args) {
	// can pass value in function when it defined with variables.
		int S= Sum_3(1,2,3);
		if (S>100){
			System.out.println("Greater that 100");
		}else{
			System.out.println("Less than 100");
		}
	//can call a function many times with different arguments (input values).
		//Sum_3(100,200,300); // up to input value (3 integer) it call sum_3 that have 3 integer variables. 
		Sum_3("Hello",200,300); // up to input value (1 String and 2 integer) it call sum_3 that have (1 String and 2 integer) variables.
		Sum_3(11, 22, 33);
		// I have an error because (a,b,c,i) is local variables in other function
		//System.out.println(a+" + " +b+ " + " +c+" = "+i); 

		int w=sum(100);
		System.out.println("sum of 100 is "+w);
		int q=sum(200);
		System.out.println("Sum of 200 is "+q);
		
	}
// Void- is return type of function for any number of arguments.
	public static int Sum_3(int a,int b,int c){
	int i=a+b+c;  //Local variable
	System.out.println(a+" + " +b+ " + " +c+" = "+i);
	return i;
} 
	public static void Sum_3(String a,int b,int c){
		int i=b+c;
		System.out.println(a+" " +b+ " + " +c+" = "+i);
		
	//If not use void function i have to use (Return) return variable. 
	} 
	
	public static int sum(int n){
		int sum=0;
		for (int i=0;i<=n;i++ ){
			sum=sum+i;
		}
		return sum;
	}
	// Next: Utility Functions in video Day2 01:05:55 Min.	
}
