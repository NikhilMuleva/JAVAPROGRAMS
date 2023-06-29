import java.util.Scanner;

public class PrimeNumberCount {
	static boolean isPrime(int x)
	{
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	static int primeCount(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc .nextInt();
		int pc=primeCount(n);
		System.out.println("Number of prime Number with in "+n+" is "+pc);

	}

}
