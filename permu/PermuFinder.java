import java.util.*;
import static java.lang.System.out;
public class PermuFinder{
public static void main(String arg[]){
 Scanner input=new Scanner(System.in);
long factn=1;
long factnr=1;
long permu=1;
out.print("\n\tenter the value of n");
int n=input.nextInt();
out.print("\n\tenter the value of r");
int r=input.nextInt();
int nr =n-r;
for(int i=n; i>=1; i--){
factn *= i;
}
for (int a = nr; a>=1; a--){
factnr *= a;
}
permu = (factn / factnr);
out.print("\n\t"+n+"P"+r+" is = "+permu);
  }
}

    