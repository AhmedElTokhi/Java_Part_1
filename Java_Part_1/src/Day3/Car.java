package Day3;

public class Car {
String mod;
int price;
//int wheels;
static int wheels=6;   //(Case2) static values like (car wheels number) can be stored in static objects. 	

//constructor
 //-overloading "that is mean 2functions or constructor with SAME name DIFFERANT arguments" like current sample
	/*public Car(String m, int p){     // we hash this code to use the next constructor example
	mod=m;  
	price=p;
	}*/

	public Car(String mod, int price){
	this.mod=mod;            //mod=: Mod here is a global variable of public class so i have to qualify it with (This.) java keyword without keyword will consider all (mod)is local variable.  
	this.price=price;                    //=mod: Mod here is a local variable
		}
	
	public Car(){
	System.out.println("In car constructor no arguments");
	}





	public static void main(String[] args) {
	// Create the object of public class Car
	Car c1= new Car();
	c1.mod="Opel";
	c1.price=5464213;
	// (Case2)static function can only access static stuff (function, variables)
	//c1.wheels=4; //(case2)can remove it from class object and use its initial value in public class.
		c1.start();  //call a start function that will print mod value of calling object c1
		c1.accel();	 
		
	Car c2=new Car();
	c2.mod="BMW";
	c2.price= 54648979;
	//(Case2)static function can only access static stuff (function, variables)
	//c2.wheels=5; //(case2)can remove it from class object and use its initial value in public class.
		c2.start();  //call a start function that will print mod value of calling object c2
		c2.accel();
		
		System.out.println("-----non Statcic object throw class object-------");
		System.out.println(c1.mod);  //can call non static object inside static function (main) throw class object c1  (Ahmed Comment) 
		System.out.println(c2.mod);
		
		//static 
		//static function can only access static stuff (function, variables)
		System.out.println("-----Static object-------");
		System.out.println(wheels);//okay when try to call static object inside static function (main).
		//System.out.println(price);  //error when try to call non static object inside static function (main).
		//System.out.println(mod);  //error when try to call non static object inside static function (main).
		System.out.println(Car.wheels);
		System.out.println(c1.wheels);
		System.out.println(c2.wheels);
		
		fillgas(100);
		Car.fillgas(100);
		c1.fillgas(50);
	}
public void start(){
	System.out.println(mod+" Starting");
	System.out.println(wheels);

}
public void accel(){
	System.out.println(mod+" accelerating");
}	

public static void fillgas(int quantitiy){
	
}
//will complete from Video3 Min 20:00	
}
