public class EvenSum{
public static void main(String[] args){
int sum=0;
int j = 0;
for (int i=2; i<=40; i+=2){
j = i;
sum += j;
System.out.print("\t"+j);
}
System.out.print("\n\tthe sum is =" + sum);
	}
}