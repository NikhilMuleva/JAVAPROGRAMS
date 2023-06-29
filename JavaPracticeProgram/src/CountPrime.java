import java.util.Scanner;

public class CountPrime {
	public static int countPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			boolean rs =isPrime(i);
			if(rs==true)
			{
				count++;
			}
		}
		return count;
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
			
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		int pc =countPrime(n);
		System.out.println("the Number of count Prime number is :"+ pc);
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
			{
				System.out.println(i+" ");
			}
			
		}
	}

}
