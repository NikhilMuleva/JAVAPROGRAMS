package NormalMethod;

import java.util.Scanner;

public class XylemAndPhloemNumber {
	public static boolean isXylemPhloem(int num)
	{
		int sum=0;
		int temp=num;
		while(temp>0)
		{
			int digit=temp%10;
			sum=sum+(digit*digit*digit);
			temp = temp/10;
			
		}
		return sum==num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		if(isXylemPhloem(num))
		{
			System.out.println(num+" is Xylem Number");
		}
		else
		{
			System.out.println(num+" is Phloem Number");
		}
		

	}

}
