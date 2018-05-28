package A2_java_Part_1_Java_Basic;

public class Lesson_4_2_Strings {

	public static void main(String []args){
		
		//String s3 = "A \"string\" nested \\inside\\ a string"
		//String s4 = "Hello, \u60a8\u597d!"   // "Hello, 您好!"				
		//String s5 = "Hi, I'm a string!"      // Single quote OK

	//4.1 String and '+' Operator
		int x1=1, average=10, a=1, b=1;
		double y1=1.2, y2=2.2;
		
		System.out.println(1 + 2);
		System.out.println(1.2 + 2.2);
		
		System.out.println("Hello" + "world");
		System.out.println("Hi" + ", " + "world" + "!");

		System.out.println("The number is " + 5);
		System.out.println("The average is " + average + "!");

		System.out.println("How about " + a + b); //covert int to string
		System.out.println("-----------------");

	//4.2 String Operations
		String str = "Java is cool!";
		System.out.println(str.length());       // return int 13
		System.out.println(str.charAt(2));      // return char 'v'
		System.out.println(str.charAt(5));      // return char 'i'
		System.out.println("-----------------");
		 
	// Comparing two Strings
		String anotherStr = "Java is COOL!";
		
		System.out.println(str.equals(anotherStr));           // return boolean false
		System.out.println(str.equalsIgnoreCase(anotherStr)); // return boolean true
		System.out.println(anotherStr.equals(str));           // return boolean false
		System.out.println(anotherStr.equalsIgnoreCase(str)); // return boolean true
		// (str == anotherStr) to compare two Strings is WRONG!!!
		System.out.println("-----------------");
		
		System.out.println(str.length());            // return int 13
		System.out.println(str.charAt(2));           // return char 'v'
		System.out.println(str.substring(5,10));     // return String "Jav"
		System.out.println(str.indexOf('a'));        // return int 1
		System.out.println(str.lastIndexOf('a'));    // return int 3
		System.out.println(str.endsWith("cool!"));   // return boolean true
		System.out.println(str.toUpperCase());       // return a new String "JAVA IS COOL!"
		System.out.println(str.toLowerCase());       // return a new String "java is cool!"
		System.out.println("-----------------");
	// 4.3  String/Primitive Conversion
		//"String" to "int/byte/short/long"
		
		String inStr = "55";
		
		int number1 = Integer.parseInt(inStr);   // number <- 5566
		System.out.println(number1);
		// Input to Integer.parseInt() must be a valid integer literal
		//number = Integer.parseInt("abc");       // Runtime Error: NumberFormatException
		byte number2= Byte.parseByte(inStr);
		System.out.println(number2);
		short number3= Short.parseShort(inStr);
		System.out.println(number3);
		long number4= Long.parseLong(inStr); 
		System.out.println(number4);
		System.out.println("--------");
		
		//"String" to "double/float"
		String inStr2 = "55.66";
		float aFloat = Float.parseFloat(inStr2);         // aFloat <- 55.66f
		System.out.println(aFloat);
		double aDouble = Double.parseDouble(inStr2);  // aDouble <- 1.2345
		System.out.println(aDouble);
		System.out.println("--------");
		//aDouble = Double.parseDouble("abc");            // Runtime Error: NumberFormatException

		//"String" to "char"
		// Converting from binary to decimal
		String msg = "101100111001!";
		int pos = 0;
		while (pos < msg.length()) {
		   char binChar = msg.charAt(pos);   // Extract character at pos
		   // Do something about the character
		   System.out.println(binChar);
		   ++pos;
		}
		System.out.println("--------");

		//"String" to "boolean"
		String boolStr = "true";
		boolean done = Boolean.parseBoolean(boolStr);  // done <- true
		System.out.println(boolStr);
		boolean valid = Boolean.parseBoolean("false"); // valid <- false
		System.out.println(valid);
		System.out.println("--------");
		
	//Primitive (int/double/float/byte/short/long/char/boolean) to "String"
	
		// String concatenation operator '+' (applicable to ALL primitive types)
		String s1 = 123 + "";    // int 123 -> "123"
		System.out.println(s1);
		String s2 = 12.34 + "";  // double 12.34 -> "12.34"
		System.out.println(s2);
		String s3 = 'c' + "";    // char 'c' -> "c"
		System.out.println(s3);
		String s4 = true + "";   // boolean true -> "true"
		System.out.println(s4);
		
		// String.valueOf(aPrimitive) is applicable to ALL primitive types
		String s11 = String.valueOf(12345);   // int 12345 -> "12345"
		String s12 = String.valueOf(true);    // boolean true -> "true"
		double d = 55.66;
		String s13 = String.valueOf(d);       // double 55.66 -> "55.66"
		 
		// toString() for each primitive type
		String s14 = Integer.toString(1234);  // int 1234 -> "1234"
		String s5 = Double.toString(1.23);   // double 1.23 -> "1.23"
		//--char c1   = Character.toString('z'); // char 'z' -> "z"
		 
		// char to String
		char c = 'a';
		//--String s15 = c;       // Compilation Error: incompatible types
		String s16 = c + "";  // Convert the char to String
		 
		// boolean to String
		boolean done1 = false;
		String s7 = done + "";    // boolean false -> "false"
		String s8 = Boolean.toString(done);
		String s9 = String.valueOf(done);

		
	}
}
