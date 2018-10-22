import java.util.*;
public class AngleFinder{
public static void main(String args[]){
	Scanner input=new Scanner(System.in);
System.out.print("\n\tenter the value of A");
double a = input.nextInt();
System.out.print("\n\tenter the value of B");
double b = input.nextInt();
System.out.print("\n\tenter the value of C");
double c = input.nextInt();
String v = "";
if (c == 0){
System.out.printf("\n\tc  = "+(180-(b + a)));
}
if (b = v){
System.out.printf("\n\tb = "+(180-(c + a)));
}
else if (a==0){
System.out.printf("\n\ta = "+(180-(b + c)));
}  
else
	System.out.print("\n\tthere must be an unknown!!");
	}
}