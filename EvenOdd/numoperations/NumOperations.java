import java.util.*;
import static java.lang.System.out;
public class NumOperations{
public int addNum(int x, int y)
{
return(x+y);
}
public int subNum(int x , int y)
{
return(x-y);
}
public int multiplyNum(int x , int y)
{
return (x*y);
}
public double divideNum(int x , int y)
{
return(x/y);
}
public static void main(String args[]){
NumOperations NewOp=new NumOperations();
Scanner input = new Scanner(System.in);
 out.print("\n\tenter the first number");
 int num1=input.nextInt();
 out.print("\n\tenter the second number");
 int num2=input.nextInt();
 out.println("\n\tthe sum ="+NewOp.addNum(num1,num2));
 out.println("\n\tthe difference ="+NewOp.subNum(num1,num2));
 out.println("\n\tthe quotience ="+NewOp.divideNum(num1,num2));
 out.println("\n\tthe product ="+NewOp.multiplyNum(num1,num2));
	}
}