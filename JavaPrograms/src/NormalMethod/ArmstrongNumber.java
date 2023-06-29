package NormalMethod;

import java.util.Scanner;

//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
//Example:153: 1power3 + 5power3 + 3power3 = 1 + 125+ 27 = 153
///    134: 1power3 + 2power3 + 5power3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
public class ArmstrongNumber {
	public static boolean isArmstrong(int n)
	{
		int rem;
		int temp=n;
		int p=0;
		while(n>0)
		{
			rem=n%10;
			p=p+(rem*rem*rem);
			n=n/10;
		}
		return temp==p;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n= sc.nextInt();
		boolean b= isArmstrong(n);
		if(b==true)
		{
			System.out.println(n+" is armstrong");
		}
		else
		{
			System.out.println(n+" is Not armstrong");
		}
		
//		//print 1 to n armstong number
//		for(int i=1;i<=n;i++)
//		{
//			boolean b =isArmstrong(i);
//			if(b==true)
//			{
//				System.out.println("the number of "+n +" is Armstrong number"+ i);
//			}
//		}
		
	}

}
