package NormalMethod;

import java.util.Scanner;

//Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. 
//In other words, prime numbers can't be divided by other numbers than itself or 1.
//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.


public class PrimeNumber {
	public static boolean isPrime(int x)
	{
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbrs");
		int n=sc.nextInt();
		boolean rs= isPrime(n);
		if(rs==true)
		{
			System.out.println(n+" is Prime");
		}
		else
		{
			System.out.println(n+" is Not prime");
		}
		

	}

}
