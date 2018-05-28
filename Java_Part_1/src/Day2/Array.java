package Day2;

public class Array {

	public static void main(String[] args) {
		
		String username="XXXXX";
		String Password="YYYYY";
		String email="aa@aaa.com";
		String zip="123";
		
	  //(1 dimension)Arrays
	  //Read data from excel file and put it inside the array.
		String str[]= new String[4];
		str[0]="xxxx";
		str[1]="yyyy";
		str[2]="aa@aa.com";
		str[3]="123";
		
		int i[]= new int[3];
		i [0]=111;
		i [1]=222;
		i [2]=333;
		
		char j[]=new char[2];
		
	  //Length of arrays
		System.out.println("Str Array length "+ str.length);
		System.out.println("i Array length "+ i.length);
		System.out.println("j Array length "+ j.length);

	  //Print str array values
		for(int x=0; x< str.length; x++){
			System.out.println(str[x]);
		}
	  //Print i array Values in Ascending order
		for (int y=0;y< i.length; y++){
			System.out.println(i[y]);
		}
		//Print i array Values in descending order
		for (int y=i.length-1;y>=0 ; y--){
			System.out.println(i[y]);
		}	
		// Next: will start in 2 dimension array in (Day 2 video in 33:32 MIN). 
	}
	}
