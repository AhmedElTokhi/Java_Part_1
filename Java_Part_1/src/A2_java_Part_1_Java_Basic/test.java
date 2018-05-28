package A2_java_Part_1_Java_Basic;

import java.util.Scanner;

public class test {

	public static void print(char [] arr) {
        for(int i = 0 ; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] array = scan.next().toCharArray();
        print(array);
        scan.close();
   }

}