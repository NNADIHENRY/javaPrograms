import java.util.*;
public class NumBase{
public static void main(String args[]){
  Scanner input = new Scanner(System.in);
System.out.print("\n\tEnter the integer number");
  int num = input.nextInt();
String bina = Integer.toBinaryString(num);
String octal = Integer.toOctalString(num);
String hex = Integer.toHexString(num);
System.out.println("\n\t"+num+"in binary is"+bina);
System.out.println("\n\t"+num+"in octal is"+octal);
System.out.println("\n\t"+num+"in hex is"+hex);
	}
}