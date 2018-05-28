package Day2;

public class While_Loop {

	public static void main(String[] args) {

		int i=0;      //initialization
				
		while (i<10){ //condition
			System.out.println(i);
			//i=i+1;  //Increment / Decrement
			// can use i++ to add 1.
			i++;
		}
		System.out.println("////////Decrement/////////");
		int x=10;
		while (x>0){ //condition
			System.out.println(x);
			x=x-1;  //Increment / Decrement
			// can use x-- to minus 1.
			//x--;
		}
		// Next: For Loop.
	}
}
