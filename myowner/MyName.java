import javax.swing.JOptionPane;
public class MyName{
public static void main(String[] args){
 String name = JOptionPane.showInputDialog("\n\tEnter your name");
//String NameVal = String.parseStrng(name);
JOptionPane.showMessageDialog(null,name);
   System.exit(0);
}
}