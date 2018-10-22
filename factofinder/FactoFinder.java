import java.util.*;
import static java.lang.System.out;
public class FactoFinder{
public static void main(String arg[]){
 Scanner input=new Scanner(System.in);
 long facto=1;
out.print("\n\tenter a number");
int num=input.nextInt();
if (num>1){
for(int i=num; i>=1; i--)
{
 facto *= i;
}
out.println("\n\t"+num+"!="+facto);
}
else if(num==0||num==1)
{
out.print("\n\t"+num+"!="+facto);
    }
  }
}