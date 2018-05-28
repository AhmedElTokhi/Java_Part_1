package Day2;

public class For_Loop {

	public static void main(String[] args) {
		for (int i=0; i<10; i++){ 
			System.out.println(i+"- Hello World");
		}
		
		int sum=0;
		for (int n=0; n<=100; n++){
					sum=sum+n;
		}
		System.out.println("sum of 1st 100 number is "+sum);
	}
	// Next: Arrays (1 dimension array).
}
