package Day3;

public class pass_variable_valeand_referance_excersie {

	
/**
 * Impossible Swap function in Java
 * @author www.codejava.net
 */
public static class Swap {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x(1) = " + x);
        System.out.println("y(1) = " + y);
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        swap(x, y);
        System.out.println("x(2) = " + x);
        System.out.println("y(2) = " + y);
    }
}

}
