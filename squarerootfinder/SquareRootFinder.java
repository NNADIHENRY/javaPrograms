import java.util.*;
public class SquareRootFinder{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
System.out.println("\n\tenter a number");
int num = input.nextInt();
if(num>0)
  System.out.printf("the square root of "+num+"is"+Math.sqrt(num));
else
  System.out.println("negative values don't have square root");
	}
}