import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=isPrime(n);
		if(rs==true)
		{
			System.out.println(n+" Is prime");
		}
		else
		{
			System.out.println(n+" Is Not prime");
		}
	}

}
