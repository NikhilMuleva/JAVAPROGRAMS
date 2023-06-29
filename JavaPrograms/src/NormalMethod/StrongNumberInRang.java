package NormalMethod;

import java.util.Scanner;

public class StrongNumberInRang {
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
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			boolean rs= isStrong(i);
			if(rs==true)
			{
				System.out.println(i+ " Is Strong Number");
			}
			
		}

	}

}
