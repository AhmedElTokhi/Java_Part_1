package Day2;

public class TowD_array_Exercise_Integer {
	//-----------------------------------------------------------------
	 // Creates a 2D array of integers, fills it with increasing
	 // integer values, then prints them out.
	 //-----------------------------------------------------------------
	 
	public static void main(String[] args) {
		
		int x [][]=new int [5][10];
		for (int R=0;R<x.length; R++){
			for(int C=0; C<x[R].length; C++){
			x [R][C]=R*10+C;	
			}
		}
		//Print x array
		
		//System.out.println(x[][C]+"\t");
		System.out.print("# |"+ "\t");
		for (int Header=0;Header<x[0].length; Header ++){
			System.out.print(Header +"\t");
		}
		System.out.println();
		System.out.print("--+");
		for (int Header=0;Header<x[0].length; Header ++){
		System.out.print("--------");
		}
		System.out.println();
		for (int RP=0;RP<x.length; RP++){
			System.out.print(RP +" |"+ "\t");	
			for(int CP=0; CP<x[RP].length; CP++){
				System.out.print(x[RP][CP]+"\t");
			}
				System.out.println();
		}

	}
}
