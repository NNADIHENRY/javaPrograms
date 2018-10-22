import javax.swing.JOptionPane;
public class KmEquiv{
public static void main(String args[]){
	String x = JOptionPane.showInputDialog("Enter the speed in M/hr:");
double Xval = Double.parseDouble(x);
double km = (Xval * 1.621);
JOptionPane.showMessageDialog(null,"the value in KM/hr : "+ km);
	System.exit(0);
	}
}