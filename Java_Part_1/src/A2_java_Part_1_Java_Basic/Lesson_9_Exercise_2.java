package A2_java_Part_1_Java_Basic;

import java.util.Scanner;    // Needed to use the Scanner

public class Lesson_9_Exercise_2 {
	   
	public static void main(String [] args) {
	
		int number=0;
		
	    // Construct a Scanner named "sc" for scanning System.in (keyboard)
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Please enter integer number: ");  // 1)Show prompting message
	
		number= sc.nextInt();          	   // 2) Use nextInt() to read an int from end user
		hasEight(number);				   // 3) assign entered value to method(hasEight)   
	
		
		if (hasEight(number)== true){	   // 5) Check method(hasEight)returned value and display appropriate message 
			
			System.out.println("The number "+number+" have 8 number");
		}else{
			System.out.println("The number "+number+" not have 8 number");
		}
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