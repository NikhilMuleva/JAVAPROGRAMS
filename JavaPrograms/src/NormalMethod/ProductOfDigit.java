package NormalMethod;

import java.util.Scanner;

public class ProductOfDigit { 
	public static int sumOfProductDigit(int x)
	{
		int sum=1;
		while(x>0)
		{
			int r=x%10;
			sum=sum*r;
			
			x =x/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n =sc.nextInt();
		int p=sumOfProductDigit(n);
		System.out.println("sum of  product digit "+n+" is "+p);
	}

}
