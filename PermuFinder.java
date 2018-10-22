import java.util.*;
public class PermuFinder{
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
System.out.print("\n\tenter the value of n");
int n = input.nextInt();
System.out.print("\n\tenter the value of r");
int r = input.nextInt();
int factoNR = (n - r);
int factR = 1;
int factN = 1;
for (int i = n; i>=1; i--)
factN *= i;
for (int i = factoNR; i>=1; i--)
factR *= i;
int permu = (factN / factR);
System.out.print("\n\t"+n+"P"+r+"="+permu);
	}
}