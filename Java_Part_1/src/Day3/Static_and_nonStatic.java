package Day3;

public class Static_and_nonStatic {
// global variable used across all functions -condition
	String name; //non static global variables
	static int age; // static global function, it created in global only
	
	

	public static void main(String[] args) { //static function
//static function can only access static stuff (function, variables)
	sum();  //Okay when call static function
	//sendmail(); //error when call non-static function
	
	age=35;  //Okay when call static variable    
	//name="Ahmed"; //error when call non-static variable
	
	}

	
	public static void sum(){	//static function
	int x=100; //local Variable used across sum function only
		
	} 
	public void sendmail(){ //non-static function 
		int y=300; //local Variable used across (sendmail) function only
		
		//non-static function can call all types of stuff (function, variables)
		sum();  //Okay when call static function
		sendmail(); //error when call non-static function
		
		age=35;  //Okay when call static variable    
		name="Ahmed"; 
	}
}
