package A1_java_Part_1_Java_Introduction;
/*
 * Find the sum and average from a lowerbound to an upperbound
 */
public class Lesson8_2_2_Type_Casting_Test { //save as Lesson8_2_2_Type_Casting_Test.java 

	public static void main(String[] args) {
		int lowerbound=0, upperbound=1000;
		int sum=0;			//sum type is "int"
		double average;	//average type is "double" 
		
		//compute The sum in "int"
		for (int i=0; i<=upperbound; i++){
			sum+=i;
		}
		System.out.println("The sum from "+lowerbound+" to "+upperbound+" is "+sum);
		
		//compute the average in "double"
		average=sum/(upperbound-lowerbound+1);
		System.out.println("The average 1 is "+ average+"----//incorrect value");
		
		average=(double)sum /(upperbound-lowerbound+1);
		//the value of sum (of int) is first converted to double. Subsequently, double/int produces a double.
		// ***but actual result not do it***
		System.out.println("The average 2 is "+ average+"----//incorrect value");
		
		average=sum/1000;
		System.out.println("The average 3 is "+ average+"----//incorrect value");
		
		average= sum/1000.0;
		//int/double produces an double (of 500.5).
		
		System.out.println("The average 4 is "+ average+"--------//Correct value");
		
		average=(double) (sum/1000);
		//int/int produces an int (of 500), which is casted to double (of 500.0) and assigned to average (of double).
		System.out.println("The average 5 is "+ average+"----//incorrect value");
		
	}

}
