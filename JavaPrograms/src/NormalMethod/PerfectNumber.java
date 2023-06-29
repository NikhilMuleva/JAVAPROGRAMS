package NormalMethod;

import java.util.Scanner;

//Perfect Number:-A number whose sum of factors (excluding the number itself) is equal to
//the number is called a perfect number.
//In other words, if the sum of positive divisors (excluding the number itself) of a number equals the number 
//itself is called a perfect number. 
//Example:6=>1+2+3 => is Perfect Number
//        10=>1+2+5+10 => is Not perfect Number
public class PerfectNumber {
	public static boolean isPerfect(int x)
	{
		int sum=0;
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==x)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		boolean p = isPerfect(n);
		if (p == true) {
			System.out.println(n + " is Perfect Number");
		} else {
			System.out.println(n + " is  not Perfect Number");
		}
	}

}
