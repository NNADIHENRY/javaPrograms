import java.util.*;
public class AreaCalc{
public static void main(String args[]){
Scanner input=new Scanner (System.in);
	System.out.println("\n\t enter the value of radius:");
int rad=input.nextInt();
double area = Math.PI* Math.pow(rad,2);
	System.out.printf("\n\t%10s%.2f","the area=", area);
	}
}