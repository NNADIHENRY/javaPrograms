import java.util.*;
public class LudoDie{
public static void main(String args[]){
    Random randNum = new Random();
for (int i=1; i<=30; i++){
int Ludoface = 1+ randNum.nextInt(6);
  System.out.printf("%d",Ludoface);
if (i%5 ==0)
System.out.println();
		}
	}
}