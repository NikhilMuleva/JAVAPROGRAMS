package NormalMethod;

import java.util.Scanner;

public class SumOfDigit {
	public static int sumOfDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum =sum+r;
			n=n/10;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Numbers: ");
	int n=sc.nextInt();
	int s=sumOfDigit(n);
	System.out.println("Sum of The Digit "+n+ " is "+s);
}
}
