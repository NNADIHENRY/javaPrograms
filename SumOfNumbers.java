import java.util.Scanner;
public class SumOfNumbers{
public static void main(String[] args){
 Scanner reader = new Scanner(System.in);
int sum = 0;
int read=0;
do{
sum = sum+read;
  System.out.println(read+" + "+read+"  = " +sum);
read = Integer.parseInt(reader.nextLine());
} 
while(read!=0);
  System.out.println("sum in the end:" +sum);
reader.close();
	}
}
