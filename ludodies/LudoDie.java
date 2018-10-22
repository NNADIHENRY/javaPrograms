import java.util.*;
public class LudoDie{

public static void LudoFace(int ludo){
Random randNum = new Random();
for (int i=1; i<=2; i++){
int Ludoface = 1 + randNum.nextInt(6);
  System.out.printf("%2d",Ludoface);
//if (i%5 ==0)
System.out.println();
}
}

public static void main(String[] args){
LudoDie.LudoFace(2);
}
}