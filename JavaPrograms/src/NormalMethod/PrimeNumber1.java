package NormalMethod;
//Write a Java program to print all the prime numbers within n?

import java.util.Scanner;

public class PrimeNumber1 {
	public static boolean isPrime(int x)
	{
		for(int i=2;i*i<=x;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	
	public static int countPrime(int n)
	{
		int count =0;
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(n);
			if(rs==true)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n =sc.nextInt();
		int pc=countPrime(n);
		System.out.println("Prime :"+pc);
		for(int i=1;i<=n;i++)
		{
			boolean rs = isPrime(i);
			if(rs==true)
			{
				System.out.print(i+ " ");
			}
		}
				

	}

}
