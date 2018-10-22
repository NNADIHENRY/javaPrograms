import java.util.*;
public class DiscountFinder{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
System.out.print("\n\tenter the price");
int price = input.nextInt();
if (price < 5000){
 System.out.print("\n\t you are not qualified");
}
else
 System.out.print("\n\tyour discout ="+0.02 * price);
      }
}