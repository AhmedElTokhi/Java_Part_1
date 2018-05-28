package A2_java_Part_1_Java_Basic;

import java.util.Scanner;    // Needed to use the Scanner

public class Lesson_9_Exercise_1 {
	   
	public static void main(String[] args) {
	
		int number=0;
		
	    // Construct a Scanner named "sc" for scanning System.in (keyboard)
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Please enter integer number: ");  // 1)Show prompting message
	
		number= sc.nextInt();          // 2) Use nextInt() to read an int from end user
		isOdd(number);				   // 3) assign entered value to method(isOdd)   
	
		
		if (isOdd(number)== true){		// 5) Check method(isOdd)returned value and display appropriate message 
			
			System.out.println("The number "+number+" is odd");
		}else{
			System.out.println("The number "+number+" is even");
		}
	sc.close();
	}
	   	
	public static boolean isOdd(int number) {   // 4) method (isOdd) check assigned value and return (true/ flase)
		if (number % 2 == 0) {
			return false;
		} else {
			return true;
			   }
	}
}