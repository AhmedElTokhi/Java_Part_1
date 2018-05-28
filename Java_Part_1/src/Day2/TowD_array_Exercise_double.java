package Day2;

public class TowD_array_Exercise_double {

public static void main(String[] args) {
		
	double x [][]=new double [5][5];
		for (int R=0;R<x.length; R++){
			for(int C=0; C<x[R].length; C++){
			x [R][C]=(Math.random());	
			}
		}
		//Print x array
		
		System.out.print("# |"+ "\t");
		for (int Header=0;Header<x[0].length; Header ++){
			System.out.print(Header +"\t"+"\t"+"\t");
		}
		System.out.println();
		System.out.print("--+");
		for (int line=0;line<x[0].length; line ++){
		System.out.print("------------------------");
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
