import javax.swing.JOptionPane;
public class AngleFinders{
public static void main(String[] args){
String a,b,c;
 a = JOptionPane.showInputDialog("enter the value of a");
b = JOptionPane.showInputDialog("enter the value of b");
c = JOptionPane.showInputDialog("enter the value of c");
int Aval = Integer.parseInt(a);
int Bval = Integer.parseInt(b);
int Cval = Integer.parseInt(c);
if (Aval == 0){
JOptionPane.showMessageDialog(null, "the value of a is: "+ (180 - (Cval + Bval)));
			}
if (Bval == 0){
JOptionPane.showMessageDialog(null, "the value of b is: "+ (180 - (Cval + Aval)));
}
if (Cval == 0){
JOptionPane.showMessageDialog(null, "the value of c is: "+ (180 - (Aval + Bval)));
}
if (Cval != 0 & Aval != 0 & Bval != 0){
JOptionPane.showMessageDialog(null, "there must be an unknown");
	  }
	System.exit(0);
      }
}