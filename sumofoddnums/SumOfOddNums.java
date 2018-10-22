import java.util.*;
public class SumOfOddNums{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
System.out.print("\n\tenter the number");
int num = input.nextInt();
int sum = 0;
for (int i = 1; i <= num; i+=2)
{
   sum += i;
}
      System.out.println("\n\tsum  =  "+sum);
	}
}