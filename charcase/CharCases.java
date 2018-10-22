import javax.swing.JOptionPane;
public class CharCases{
public static void main(String args[]){
	String name = JOptionPane.showInputDialog("Enter your name");
int length = name.length();
String lower = name.toLowerCase();
String upper = name.toUpperCase();
char c = name.charAt(3);
JOptionPane.showMessageDialog(null,"uppercase is: \t\t"   +upper+
"lowercase is:\t\t"   +lower+  "length is:\t\t"  +  length+    "fourth character is:\t\t"    +c);
	}
}