package A2_java_Part_1_Java_Basic;
/*
 * Trying if-else statement.
 */

public class Lesson_5_2_Exercise_CheckPassFail { 	//Saved as "Lesson5_2_Exercise_CheckPassFail.java" 
	public static void main (String [] args){		//Program entry Point
		
		System.out.println("----Exercise 1-------");
		//Exercise CheckPassFail (if-else)
		
		int mark=50;
		System.out.println("the mark is "+ mark);
		
		if (mark>=50){
			System.out.println("PASS");
		}else{
			System.out.println("Fail");
		}
		System.out.println("Done");
		System.out.println();
		System.out.println("----Exercise 2-------");
		
		//Exercise CheckOddEven (if-else)
		int n=50;
		
		System.out.print("The Number is " + n);
		
		if (n % 2 > 0){
			System.out.println(" is even");
		}else{
			System.out.println(" is odd");
			System.out.println();
			
			System.out.println("----Exercise 3--nested-if-----");	
		
		int number=3;
		if (number == 1){
			System.out.println("The number is One");
		}else if (number == 2){
			System.out.println("The number is Two");
		}else if (number == 3){
			System.out.println("The number is Three");
		}else if (number == 4){
			System.out.println("The number is Four");
		}else if (number == 5){
			System.out.println("The number is Five");
		}else if (number == 6){
			System.out.println("The number is Six");
		}else if (number == 7){
			System.out.println("The number is seven");
		}else if (number == 8){
			System.out.println("The number is eight");
		}else if (number == 9){
			System.out.println("The number is Nine");
		}else if (number == 10){
			System.out.println("The number is Ten");
		}else{
			System.out.println("The number out of 1st 10 numbers");
		}
		System.out.println();
		
		
		System.out.println("----Exercise 3--Switch-Case-----");
		
		switch (number) {
		   case 1: System.out.println("The number is One"); break;		   
		   case 2: System.out.println("The number is Two"); break;
		   case 3: System.out.println("The number is Three"); break;
		   case 4: System.out.println("The number is Four"); break;
		   case 5: System.out.println("The number is Five"); break;
		   case 6: System.out.println("The number is Six"); break;
		   case 7: System.out.println("The number is seven"); break;
		   case 8: System.out.println("The number is eight"); break;
		   case 9: System.out.println("The number is Nine"); break;
		   case 10: System.out.println("The number is Ten"); break;
		   default: System.out.println("The number out of 1st 10 numbers");
		}
		
		
		System.out.println();
		
		
		System.out.println("----PrintDayInWord--nested If-----"); 
		
		if (number == 0){
			System.out.println("This is Saturday");
		}else if (number == 1){
			System.out.println("This is Sunday");
		}else if (number == 2){
			System.out.println("This is Monday");
		}else if (number == 3){
			System.out.println("This is Tuesday");
		}else if (number == 4){
			System.out.println("This is Wednesday");
		}else if (number == 5){
			System.out.println("This is Thursday");
		}else if (number == 6){
			System.out.println("This is Friday");
		}else 
			System.out.println("No a valid day");
		
		System.out.println();
		
		
		System.out.println("----PrintDayInWord--Swich Cases-----"); 
		
		switch(number){
		case 0: System.out.println("This is Saturday"); break;
		case 1: System.out.println("This is Sunday"); break;
		case 2: System.out.println("This is Monday"); break;
		case 3: System.out.println("This is Tuesday"); break;
		case 4: System.out.println("This is Wednesday"); break;
		case 5: System.out.println("This is Thursday"); break;
		case 6: System.out.println("This is Friday"); break;
		default:System.out.println("No a valid day"); break;
		
		}
	}
  }
}
