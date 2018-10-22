import java.util.*;
public class SumOfNumbers{
public static void main(String[] args){
Scanner reader = new Scanner(System.in);
int sum = 0;
int read;
do{
sum += read;
System.out.printIn("Sum now:"+ sum);
read = Integer.parseInt(reader.nextLine());
} 
while(read!=0);
   System.out.println("sum in the end:" +sum);
reader.close();
} 
