import javax.swing.JOptionPane;
public class CharCase1{
public static void main(String[] args){
String name = JOptionPane.showInputDialog("plz enter your name");
String upper = name.toUpperCase();
char forth = name.charAt(3);
String lower = name.toLowerCase();
int length = name.length();
String reverse = "";
for(int i = length-1; i>=0; i--){
reverse += name.charAt(i);
}
JOptionPane.showMessageDialog(null,"\n\tyour name in uppercase is:"+upper);
JOptionPane.showMessageDialog(null,"\n\tyour name in lowercase is:"+lower);
JOptionPane.showMessageDialog(null,"\n\tyour name lenght is:"+length);
JOptionPane.showMessageDialog(null,"\n\tyour name 4th character is:"+forth);
JOptionPane.showMessageDialog(null,"\n\tyour name in reverse is:"+reverse);
 }
}