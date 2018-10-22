import java.util.*;
public class Month{
public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.print("\n\tenter the month");
int month = input.nextInt();
String Month = "";
int numOfDays = 0;
boolean leapyear;
switch (month){
case 1:Month = "january";
case 3:Month = "march";
case 5:Month = "may";
case 7:Month = "july";
case 8:Month = "august";
case 10:Month = "october";
case 12:Month = "december";
	numOfDays = 31;
System.out.print("The month is: " +Month+ " it has " +numOfDays+ "days");
	break;
case 4: Month = "april";
case 6:Month = "june";
case 9:Month = "september";
case 11:Month = "november";
	numOfDays = 30;
System.out.print("the month is:" + Month + "    it has " +numOfDays+ "days");
	break;
case 2:Month = "febuary";

String result = (month == 2) ? "yes" : "no";
leapyear = input.nextBoolean();
if (leapyear){
	numOfDays = 29;
}
 else
{
numOfDays = 28;
}
System.out.print("the month is:" + Month + "it has " +numOfDays + "days");
	  }
}

}