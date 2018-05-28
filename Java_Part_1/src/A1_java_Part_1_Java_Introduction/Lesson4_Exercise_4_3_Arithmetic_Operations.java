package A1_java_Part_1_Java_Introduction;
/*
 * Test Arithmetic Operations Exercise_4_3
 */
public class Lesson4_Exercise_4_3_Arithmetic_Operations { //save as Arithmetic_Operations_Exercise_4_3.java

	public static void main(String[] args) {
		int number1=98; //Declare variable number1 and initialize it to 98 
		int number2=5;  //Declare variable number2 and initialize it to 5
		int number3=77; //Declare variable number3 and initialize it to 77

		int i=0;        //Declare variable number3 and initialize it to 0 to use it in while loop;
		
		while (i<31){   
			i++;
			number1  = number1 + number1;
			System.out.println("The sum of 98 for "+i+" time= "+number1 );
	}
		System.out.println("===================");
		int x=0;
		
		while (x<31){
			x++;
			number2  = number2 + number2;
			System.out.println("The sum of 5 for "+i+" time= "+number2 );
	}

		System.out.println("===================");
		int y=0;
		
		while (y<31){
			y++;
			number3  = number3 + number3;
			System.out.println("The sum of 77 for "+i+" time= "+number3 );
	}

		
}
}