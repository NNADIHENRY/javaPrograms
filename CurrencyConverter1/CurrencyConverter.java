import java.util.Scanner;
public class CurrencyConverter{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
	System.out.print("\n\tEnter the amount in dollar($):");
double dollarAmount=input.nextDouble();
double nairaEquivalent= dollarAmount*160;
double gbpEquivalent= dollarAmount*0.62;
double indianrupeeEquivalent= dollarAmount*62.28;
 System.out.printf("\n\t%10s%.2f","NairaEquivalent =  ",nairaEquivalent);
 System.out.printf("\n\t%10s%.2f","GBPEquivalent=     ",gbpEquivalent);
 System.out.printf("\n\t%10s%.2f","indianrupeeEquivalent=  ",indianrupeeEquivalent);
	}
}