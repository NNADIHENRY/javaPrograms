import java.util.Scanner;
public class Even{
public static void main(String[] args){
Scanner acc = new Scanner(System.in);
	System.out.println("enter the value of the number");
int num =acc.nextInt ();
String evenstatement = "\tis Even";
String oddstatement = "\tis Odd";
if (num%2 == 0)
System.out.println("\n number"+""+ evenstatement);
else
System.out.println("\n number"+""+ oddstatement);
	}
}