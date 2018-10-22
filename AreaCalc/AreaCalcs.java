import javax.swing.*;
public class AreaCalcs{
public static void main(String[] args){
String rad = JOptionPane.showInputDialog(null, "enter the radius of the circle");
int Aval = Integer.parseInt(rad);
Double D =  Math.PI * Math.pow(rad,2);
JOptionPane.showInputDialog(null, "the area of the is:"+ D);
	System.exit(0);
	}
}