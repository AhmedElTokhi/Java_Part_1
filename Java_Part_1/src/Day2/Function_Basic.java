package Day2;

public class Function_Basic {

	public static void main(String[] args) {
		//Run function in main ...so can create it out and call it in main.
		//function run code lines in sequence.
		Testme();
		Testme();
		Testme();
		System.out.println("In Main");
		Third_Function();
	}

	public static void Testme() {
		System.out.println("In Test me");
	}
	public static void Third_Function() {
		System.out.println("Third Function");
	}
	// Next: Function PassIn Value.	
}
