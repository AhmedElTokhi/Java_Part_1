package Day2;

public class Utility_Functions {

	public static void main(String[] args) {
	
		/* System.out.println("------0< n <1-------");
		System.out.println(Math.random());
		
		System.out.println("------0< n <10-------");
		System.out.println(Math.random()*10);
		
		System.out.println("------0< n <100-------");
		System.out.println(Math.random()*100);
		
		
		double d=(Math.random()*10);
	  //int x=d; //it is not possible to but double value in integer variable.
	    int f=(int)d;	
		
	    System.out.println("///////////////////////////");
		System.out.println(d);
		System.out.println("---The integer after remove decimal value---");
		System.out.println(f); */
		generateRandomeNumber(35);
	}
	
	//0< n <100
	public static int generateRandomeNumber(int n){
	
	double d=(Math.random()*n);
	int h=(int)d;
	System.out.println(d);
	return h;
}
// Next: Video Day3.	
}
