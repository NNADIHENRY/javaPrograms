import java.util.*;
public class Quadratic{
public static void main(String args[]){
	Scanner input=new Scanner(System.in);
  System.out.print("\n\tenter the value of A");
int a=input.nextInt();
  System.out.print("\n\tenter the value of B");
int b=input.nextInt();
  System.out.print("\n\tenter the value of C");
int c=input.nextInt();
double f = Math.pow(b,2);
double d = (f - 4 * a * c);
double j = (-b + (Math.sqrt(d))) / (2 * a);
double k = (-b - (Math.sqrt(d))) / (2 * a);
if (a == 0){
     System.out.print("\n\tthe co-efficient of a can not be 0");
 }
else if (d < 0){
    System.out.print("\n\tcomplex root");
 }
else
   System.out.println("\n\tX = " +j+ "  or  " +k);
     }
}