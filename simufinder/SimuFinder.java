import java.util.Scanner;
import static java.lang.System.out;
public class SimuFinder{
public static void main(String arg[]){
 Scanner input=new Scanner(System.in);
System.out.print("\n\tEnter the value of the coefficient of x in equa. one");
double a = input.nextDouble();
System.out.print("\n\tEnter the value of the coefficient of y in equa. one");
double b = input.nextDouble();
System.out.print("\n\tEnter the value of the constant in equa. one");
double c = input.nextDouble();
System.out.print("\n\tEnter the value of the coefficient of x in equa. two");
double d = input.nextDouble();
System.out.print("\n\tEnter the value of the coefficient of y in equa. two");
double e = input.nextDouble();
System.out.print("\n\tEnter the value of the constant in equa. two");
double f = input.nextDouble();
double x = ((c*d)-(a*f))/((b*d)-(a*e));
double y = ((c-b)*x)/(a);
System.out.println("\n\tthe value for y = " +String.format("%.3f",x));
System.out.println("\n\tthe value for x = " +String.format("%.3f",y));
	}
}