import java.util.*;
public class MatrixMultiplication{
public static void main(String args[]){
int n,m,p,q,sum=0,c,d,k;Scanner input = new Scanner(System.in);
System.out.print("enter the number of rows and columns of the first matrics");
m=input.nextInt();
n=input.nextInt();
int first[][]=new int[m][n];
System.out.print("enter the elements of the first matrics");
for (c=0;c<m;c++)
for (d=0;d<n;d++)
first [c][d]=input.nextInt();
System.out.print("enter the number of rows and columns of the second matrics");

p=input.nextInt();
q=input.nextInt();
if (n!=p)
	System.out.println("matrices with entered order can not multiply each other");
else{
int second[][]=new int[p][q];
int multiply[][]=new int[m][q];
System.out.print("enter the elements of the second matrics");
for(c=0;c<p;c++)
for(d=0;d<q;d++)
second[c][d]=input.nextInt();
for(c=0;c<m;c++){
for(d=0;d<q;d++){
for(k=0;k<p;k++){
sum+=first[c][k]*second[k][d];
}
multiply[c][d]=sum;
sum=0;
}
}
System.out.println("product of entered matrices:");
for(c=0;c<m;c++)
for(d=0;d<q;d++)
System.out.print(multiply[c][d]+"\t");
System.out.print("\n");
		}
	      
	}
}