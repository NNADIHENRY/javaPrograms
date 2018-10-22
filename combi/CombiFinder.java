import java.util.*;
import static java.lang.System.out;
public class CombiFinder{
public static void main(String arg[]){
 Scanner input=new Scanner(System.in);
long factN=1;
long factNR=1;
long factr=1;
long combi=1;
out.print("\n\tenter the value of n");
int n=input.nextInt();
out.print("\n\tenter the value of r");
int r=input.nextInt();
int NR =n-r;
for(int i=n; i>=1; i--){
factN *= i;
}
for(int j=r; j>=1; j--){
factr *= j;
}
for (int j = NR; j>=1; j--){
factNR *= j;
}
combi = (factN / (factNR * factr));
out.print("\n\t"+n+"C"+r+" is = "+combi);
  }
}

    