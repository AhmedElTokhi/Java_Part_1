package A2_java_Part_1_Java_Basic;

public class Lesson_5_5_Exercise_Loop_Flow_Control_CozaLozaWoza  {		//save as Lesson_5_5_Exercise_Loop_Flow_Control_CozaLozaWoza.java 
	
	public static void main (String [] arg){
		
		int lowerval=1, upperval=110;
	    //boolean Printed=false; 
		
		for (int number = lowerval; number <=upperval; ++number){   
	         // Print "Coza" if number is divisible by 3
	         if ( number %3== 0) {
	            System.out.print("Coza");
	            //Printed=true;
	            System.out.print((number %11==0) ? "\n" : " ");
	       
	         }else if (number %5== 0) {       // Print "Loza" if number is divisible by 5
	            System.out.print("Loza");
	            //Printed=true;
	            System.out.print((number %11==0) ? "\n" : " ");
	         
	         }else if (number %7== 0){
	        	 System.out.print("Woza");
	        	 //Printed=true;
	        	 System.out.print((number %11==0) ? "\n" : " ");
	         
	         }else{System.out.print(number);
	    	 //Printed=true;
	    	 System.out.print((number %11==0) ? "\n" : " ");}     // Conditional Operator in Print

	        // if (Printed)
	        	// System.out.print((number %11==0) ? "\n" : " ");	 
		}
	}
	}

