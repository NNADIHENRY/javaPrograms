import javax.swing.*;
public class AreaCircleCalc{
public static void main(String args[]){
	String num = JOptionPane.showInputDialog("Enter the value of r:");
int numVal = Integer.parseInt(num);
double area = Math.PI*Math.pow(numVal,2);
JOptionPane.showMessageDialog(null," Area = " + area + " cm2 " );
	System.exit(0);
	}
}