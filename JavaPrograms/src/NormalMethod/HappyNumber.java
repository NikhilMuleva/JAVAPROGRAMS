package NormalMethod;

import java.util.Scanner;

//"Happy Numbers:=" A digit is called happy if the sum of the square of the digit gives 1 after the sequence of steps, and 
//in each step, the number is replaced by the previous sum of the square. 
//Let's understand it with an example:
//13-> 1^2 + 3^2 = 10
//10-> 1^2 + 0^2 = 1
//Above, we see that the number eventually gives us 1 as the output, and hence the number 13 is a happy number.

public class HappyNumber {
	public static boolean happyNumbers(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int d=n%10;
				sum=sum+d*d;
				n=n/10;
			
			}
			  n=sum;
		}
		if(n==7||n==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=happyNumbers(n);
		if(rs==true)
		{
			System.out.println(n+" Is Happy Number");
		}
		else
		{
			System.out.println(n+" Is not Happy Number");
		}

	}

}
