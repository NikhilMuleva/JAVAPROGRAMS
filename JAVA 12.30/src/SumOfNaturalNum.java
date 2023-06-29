//sum of first N natural Number?
import java.util.Scanner;
public class SumOfNaturalNum {
	static int sumOfNatural(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		int s=sumOfNatural(n);
		System.out.println("sum Of " +n+" Natural num is sum: "+s);
	}

}
