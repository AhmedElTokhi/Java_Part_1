package Day3;

public class constructors {

	public static void main(String[] args) {

		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.mod="No constructor car";
		a.price=33333;
		System.out.println(a.mod);
		System.out.println(a.price);
		
		System.out.println("------------new object values passed to cnstructor----------------");
		
		Car d=new Car("xxx Car", 4444);
		System.out.println(d.mod);
		System.out.println(d.price);
		
	
	}
	// will start in video day 3 41:44 min
}
