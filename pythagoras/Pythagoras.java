import java.util.*;
public class Pythagoras{
public static void main(String args[]){
	Scanner input=new Scanner(System.in);
System.out.print("\n\tenter the value of a");
double a = input.nextInt();
System.out.print("\n\tenter the value of b");
double b = input.nextInt();
System.out.print("\n\tenter the value of c");
double c = input.nextInt();
double j = Math.pow(c,2);
double k = Math.pow(b,2);
double i = Math.pow(a,2);
if (c == 0){
System.out.printf("\n\tc  = "+Math.sqrt( k + i));
}
if (b==0){
System.out.printf("\n\tb = "+Math.sqrt(j - i));
}
else if (a==0){
System.out.printf("\n\ta = "+Math.sqrt(j - k));
}  
else
	System.out.print("\n\tthere must be an unknown!!");
	}
}