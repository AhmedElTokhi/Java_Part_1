package A2_java_Part_1_Java_Basic;
/* 
 * Print the minimum, maximum and bit-length for primitive types
 */
public class Lesson_2_7_Primitive_Types_Min_Max { //saved as Leason2_7_Primitive_Types_Min_Max.java
   public static void main(String[] args) {
      System.out.println();
      System.out.println("-----int--------");
	  // int (32-bit signed integer)
	  System.out.println("int(bit-length) = " + Integer.SIZE+" bit");
	  System.out.println("int(min) = " + Integer.MIN_VALUE);
      System.out.println("int(max) = " + Integer.MAX_VALUE);
      System.out.println();
      
      System.out.println("-----byte--------");
      // byte (8-bit signed integer)
      System.out.println("byte(bit-length)=" + Byte.SIZE+" bit");
      System.out.println("byte(min) = " + Byte.MIN_VALUE);
      System.out.println("byte(max) = " + Byte.MAX_VALUE);
      System.out.println();
      
      System.out.println("-----short--------");
      // short (16-bit signed integer)
      System.out.println("short(bit-length) = " + Short.SIZE+" bit");
      System.out.println("short(min) = " + Short.MIN_VALUE);
      System.out.println("short(max) = " + Short.MAX_VALUE);
      System.out.println();

      System.out.println("-----char--------");
      // char (16-bit character or 16-bit unsigned integer)
      System.out.println("char(bit-length) = " + Character.SIZE+" bit");
      System.out.println("char(min) = " + (int)Character.MIN_VALUE);
      System.out.println("char(max) = " + (int)Character.MAX_VALUE);
      System.out.println();
      
      System.out.println("-----Long--------");
      // long (64-bit signed integer)
      System.out.println("long(bit-length) = " + Long.SIZE+" bit");
      System.out.println("long(min) = " + Long.MIN_VALUE); 
      System.out.println("long(max) = " + Long.MAX_VALUE);
      System.out.println();
      
      
      System.out.println("-----float--------");
      // float (32-bit floating-point)
      System.out.println("float(bit-length) = " + Float.SIZE+" bit");
      System.out.println("float(min) = " + Float.MIN_VALUE);
      System.out.println("float(max) = " + Float.MAX_VALUE);
      System.out.println();
      
      System.out.println("-----double--------");
      // double (64-bit floating-point)
      System.out.println("double(bit-length) = " + Double.SIZE+" bit");
      System.out.println("double(min) = " + Double.MIN_VALUE);
      System.out.println("double(max) = " + Double.MAX_VALUE);
   }
}
