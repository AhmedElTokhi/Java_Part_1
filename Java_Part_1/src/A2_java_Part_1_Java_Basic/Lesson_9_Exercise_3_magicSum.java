package A2_java_Part_1_Java_Basic;

import java.util.Scanner;    // Needed to use the Scanner

public class Lesson_9_Exercise_3_magicSum {
	   
	public static void main(String [] args) {
	
		int number=0, sum=0;
		int sentinel = -1;
		
	    // Construct a Scanner named "sc" for scanning System.in (keyboard)
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a positive integer or -1 to exit: ");  // 1)Show prompting message
		number= sc.nextInt();          	   // 2) Use nextInt() to read an int from end user
			
		while (number != sentinel) {  	   // Read until input is -1
		hasEight(number);				   // 3) assign entered value to method(hasEight)   
	
			if (hasEight(number)== true){  // 5) Check method(hasEight)returned value and display appropriate message 
				sum+= number;				
			}
			System.out.println("Enter a positive integer or -1 to exit: ");  // 1)Show prompting message
			number= sc.nextInt();          // 2) Use nextInt() to read an int from end user
		}
		System.out.println("The magic sum is: "+sum);
		sc.close();
	}

public static boolean hasEight(int number) {   // 4) method (hasEight) check assigned value and return (true/ flase)
	
	while (number>0)			
	{
		if (number % 10 == 8){
			number = number/10;
			return true;
		}
	return false;
	}
	return true;	 // asked to add it by java compiler but i don not know why??
}
}