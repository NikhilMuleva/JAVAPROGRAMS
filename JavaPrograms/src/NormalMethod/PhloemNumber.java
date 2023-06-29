package NormalMethod;

import java.util.Scanner;

public class PhloemNumber {
	public static void phloemNum(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(isPhloem(i))
			{
				System.out.println(i+ " ");
			}
		}
	}
	public static boolean isPhloem(int n)
	{
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int d=n%10;
			sum=sum+(d*d);
		    n =n/10;
		}
	  return sum==temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		System.out.println("Phloem numbers of 1 to "+ n+ ": ");
		phloemNum(n);
		
	}
	

}
