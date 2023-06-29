package NormalMethod;

import java.util.Scanner;

public class FibonacciNumber {
	public static void fib(int n)
	{
		int f1=0,f2=1 ;
		while(n>0)
		{
			System.out.println(f1+" ");
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
	    fib(n);
		System.out.println("The Numbr of Fiboanci: "+n+ " ");

	}

}
