import javax.swing.JOptionPane;
public class HightFinder{
public static void main(String args[]){
String ab, b, alpha;
ab = JOptionPane.showInputDialog("Enter THE VALUE OF AB");
int valAB = Integer.parseInt(ab);
b = JOptionPane.showInputDialog("Enter THE VALUE OF B");
int valB = Integer.parseInt(b);
 alpha = JOptionPane.showInputDialog("Enter THE VALUE OF ALPHA");
int valALPHA = Integer.parseInt(alpha);
double DC = (valAB * Math.tan(valB) * Math.tan(valALPHA))/(Math.tan(valALPHA) - Math.tan(valB));
JOptionPane.showMessageDialog(null,"the hight is:"+ DC);
  System.exit(0);
	}
}