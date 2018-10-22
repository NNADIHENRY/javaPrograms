import java.util.*;
public class CharCase{
public static void main(String args[]){
Scanner input=new Scanner (System.in);
	System.out.println("\n\t Enter your name");
String name = input.nextLine();
String uppercase = name.toUpperCase();
String Lowercase = name.toLowerCase();
int length = name.length();
char fourth = name.charAt(3);
System.out.println("\n\t the name in uppercase is:"  +uppercase);
 System.out.println("\n\t the name in Lowercase is:"  +Lowercase);
System.out.println("\n\t the length of the name is:"  +length);
System.out.println("\n\t the character on the fourth position is:" +fourth);
	}
}