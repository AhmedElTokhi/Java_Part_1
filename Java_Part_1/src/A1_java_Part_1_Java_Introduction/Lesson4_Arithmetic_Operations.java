package A1_java_Part_1_Java_Introduction;
/*
 * Test Arithmetic Operations
 */
public class Lesson4_Arithmetic_Operations { //save as Arithmetic_Operations.java

	public static void main(String[] args) {
		int number1=98; //Declare variable number1 and initialize it to 98 
		int number2=5;  //Declare variable number2 and initialize ot to 5
		int sum,difference, product, quotation, remainder; //declare 5 integer variable to hold result 
		
		//Perform arithmatic operations
		sum = number1 + number2;
		difference=number1 - number2;
		product=number1 * number2;
		quotation=number1 / number2;
		remainder=number1 % number2;
		
		//print result
		//Print description
		System.out.print("The sum, difference, Product, quotation and remainder of ");
		System.out.println(number1 +" and "+number2+" are "+sum+ ", "+difference+", "+product+", "+quotation+" and "+remainder);
		
		++number1; //Increment stored value in "number1" by 1
				   //Same as "number1=number1+1"
		--number2;//Decrement stored value in "number2" by 1
		           //Same as "number2=number2-1"
		quotation=number1 / number2;
		
		System.out.println("Number1 after increment is "+ number1); //Print description and variable
		System.out.println("Number 2 after decrement is "+ number2);
		System.out.println("The new wuotation of" +number1+ " and "+number2+ " is " +quotation);
	}

}
