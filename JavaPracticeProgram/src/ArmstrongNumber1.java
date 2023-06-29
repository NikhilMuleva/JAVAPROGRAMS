import java.util.Scanner;

public class ArmstrongNumber1 {
	public static int countDigit(int n)
	{
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	public static int pow(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}
	public static boolean isArmstrong(int n)
	{
		int sum=0,temp=n;
		int dc=countDigit(n);
		do {
			int d=n%10;
			sum=sum+pow(d,dc);
			n=n/10;
		}while(n!=0);
		return sum==temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs = isArmstrong(n);
		if(rs==true)
		{
			System.out.println(n+" is Armstrong number");
		}
		else
		{
			System.out.println(n+" is Not Armstrong number");
		}
		
		
		// Print the Armstrong Number 1 to N?
//		for(int i=1;i<=n;i++)
//		{
//			boolean rs = isArmstrong(i);
//			if(rs==true)
//			{
//				System.out.println("The Armstrong  Number of 1 to "+i+" ");
//			}
//		}
	}

}
