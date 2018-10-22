import java.util.*;
public class Matrics{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("\n\t how many rows are in the first matrics");
int row1=input.nextInt();
System.out.print("\n\t how many column are in the first matrics");
int column1=input.nextInt();
System.out.print("\n\t how many rows are in the second matrics");
int row2=input.nextInt();
System.out.print("\n\t how many column are in the second matrics");
int column2=input.nextInt();

if (row1==row2 && column1==column2){
  System.out.print("\n\tenter the element of first matrics in a row wise");
{
  int a = row1 * column1;
  for (int i=a; i >= 1; i--){
  int A = input.nextInt();
		}
int c = A;
 System.out.print("\n\tenter the element of the second matrics in a row wise order");
 int b = row2*column2;
 for (int j=b; j >= 1; j--){
 int B = input.nextInt();
		}
int C = B;
int n = (c * C);
}
System.out.println("\n\t the sum of the two matrics is:["+ n +"]");
}
else
{
System.out.print("\n\tcnt add matrics that are nt of the same value");
	    }
	}
}