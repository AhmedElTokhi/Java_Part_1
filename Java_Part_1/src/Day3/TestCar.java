package Day3;

public class TestCar {

	public static void main(String[] args) {
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();

		
		
		a.mod="A";
		b.mod="B";
		c.mod="C";
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		System.out.println("-----------------");
		
		a=b;
		System.out.println(a.mod);
		b=c;
		System.out.println(b.mod);
		c=a;
		System.out.println(c.mod);
		System.out.println("-------After update common referance----------");
		//now a and b are 2 reference for same object so if when i change value i will affect in (a and b). 
		c.mod="XXXX";
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
	}

}
