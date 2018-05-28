package A2_java_Part_1_Java_Basic;

public class Lesson_3_8_Relational_and_Logical_Operators {
	public static void main(String[] args) {
		int age = 18;
		double weight = 71.23;
		int height = 191;
		boolean married = false;
		boolean attached = false;
		char gender = 'm';
					      
		System.out.println(!married && !attached && (gender == 'm')); 
		System.out.println(married && (gender == 'f'));
		System.out.println((height >= 180) && (weight >= 65) && (weight <= 80));
		System.out.println((height >= 180) || (weight >= 90));
		
		//unmarried male, age between 21 and 35, with height above 180, and weight between 70 and 80
		System.out.println(!married && (gender=='m'&&(age>=21)&&(age <35)&& (height >180)&&(weight>=70)&&(weight<=80)));
		
		/*
		 Exercise: Given the year, month (1-12), and day (1-31), write a boolean expression which returns true for dates before October 15, 1582 (Gregorian calendar cut over date).
		 Ans: (year < 1582) || (year == 1582 && month < 10) || (year == 1582 && month == 10 && day < 15)
		 */
		int year =1580, month= 9, day=9;
		// correct values is that satisfy at lest 1 condition.
		System.out.println("------------");
		System.out.println((year < 1582) || (year == 1582 && month < 10) || (year == 1582 && month == 10 && day < 15));
		
	 }
}
	
