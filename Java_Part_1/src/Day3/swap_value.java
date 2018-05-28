package Day3;

public class swap_value {
int x;
int y;
	public static void main(String[] args) {
		swap_value p =new swap_value();
		p.x=10;
		p.y=20;
		System.out.println(p.x+" --- "+p.y);
		swap(p.x, p.y);
		System.out.println("----swapvalue by new objects ----"); 
		System.out.println(p.x+" --- "+p.y);
		swapvalue(p);
		System.out.println("----swapvalue by referance ----");
		System.out.println(p.x+" --- "+p.y);
	}

	public static void swap (int a, int b){ //pass by value to other reference
		int temp=a;
		a=b;
		b=temp;		
	}
	public static void swapvalue(swap_value t){//pass by object reference 
		int temp= t.x;
		t.x=t.y;
		t.y=temp;
	}
}
