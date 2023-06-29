package NormalMethod;

import java.util.Scanner;

// Strong Number: A Number that can be represented as the sum of the factorial of it's 
//individual digits is known as a Strong Number.
//A number can be said as a strong number when 
//Or
//The sum of the factorial of the individual digits is equal to the number.
//Example:- 145=> 1+24+120=>145

public class StrongNumber {
	public static int fact(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
		
	}
	
	public static boolean isStrong(int x)
	{
		int sum=0,temp=x;
		do {
			int d=x%10;
			sum=sum+fact(d);
			x=x/10;
		}while(x!=0);
		return sum==temp;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int n=sc.nextInt();
		boolean rs= isStrong(n);
		if(rs==true)
		{
			System.out.println(n+" Is Strong Number");
		}
		else
		{
			System.out.println(n+" Is Not Strong Number");
		}
		
	}

}
