import java.util.Scanner;
public class TicketFee{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("\n\thow old are you? : \n\t");
int age = input.nextInt();
if(age >= 12 & age < 65)
  System.out.println("\n\tyour ticket fee is :  " +90.25);
else
  System.out.println("\n\tyour ticket fee is :  " +50.25);
     }
}