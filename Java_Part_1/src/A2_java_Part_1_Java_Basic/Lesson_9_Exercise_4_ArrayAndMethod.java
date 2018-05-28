package A2_java_Part_1_Java_Basic;

import java.util.Scanner;


public class Lesson_9_Exercise_4_ArrayAndMethod {

	public static void main (int [] args){
	
	 int [] numbers = new int [5];
		
	 Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<numbers.length; i++){
		
			System.out.println("Please enter 5 numbers: ");
			numbers [i]= sc.nextInt();
			sc.close();
		}
		printArray(numbers);
		
	}		

		public static void printArray (int [] numbers){
			
		}

		//public static void printArray(float[] array)
		//public static void printArray(double[] array)
		
		
	}
