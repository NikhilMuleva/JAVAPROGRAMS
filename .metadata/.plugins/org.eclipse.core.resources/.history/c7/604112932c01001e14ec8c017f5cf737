package NormalMethod;
//The sum of Prime Numbers within n
import java.util.Scanner;

public class PrimeNumberSum {
	public static int isPrimeSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			boolean rs= isPrime(i);
			if(n%i==0)
			{
				sum=sum+i;
			}
			
		}
		return sum;
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Numbers ");
		int n =sc.nextInt();
		int ps = isPrimeSum(n);
		System.out.println("The sum of prime "+n+" is "+ps);
	}

}
