package NormalMethod;

import java.util.Scanner;

public class PrimeNumberCount {
	

	public static int countPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			boolean rs = isPrime(i);
			if (rs==true)
			{
				count++;
			}
		
		}
		return count;
	}

	 static boolean isPrime(int x) {
		for(int i=2;i*i<=x;i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range");
		int n = sc.nextInt();
		int pc = countPrime(n);
		System.out.println("The Number of count " + n + "  is prime number" + pc);
	}

}
