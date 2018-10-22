import java.util.*;
public class TimeTable{
public static void main(String[] args){
for(int i=2; i<=12; i++)
for(int j=1; j<=13; j++)
if(j!=13)
	System.out.println("\n\t"+i+" TIMES "+ j + " = " + (i*j)+ "\t"+i+" TIMES "+ j + " = " + (i*j)+ "\t" +i+ " TIMES "+ j + " = " + (i*j)+ "\t" +i+ " TIMES "+ j + " = " + (i*j));
else
	System.out.print("\t\t\n");
	}
}