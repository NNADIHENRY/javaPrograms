import java.util.*;
public class NameReverse{
public static void main(String args[]){
   Scanner input=new Scanner(System.in);
	System.out.print("\n\tenter your name");
String name = input.nextLine();
int length = name.length();
String reverse = "";
for (int i = length-1; i>=0; i--)
reverse = reverse + name.charAt(i);
	System.out.print("\n\t the reverse of the name is:" +reverse);
    }
}