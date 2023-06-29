//Print all the Prime Number within n Ranges?
import java.util.Scanner;
public class PrimeNumber1 {
	static boolean isPrime(int x)
	{
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			boolean rs= isPrime(i);
			if(rs==true)
			{
				System.out.println(i+" ");
			}
		}
	}

}
