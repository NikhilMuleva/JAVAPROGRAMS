import java.util.Scanner;

//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
//Example:153: 1power3 + 5power3 + 3power3 = 1 + 125+ 27 = 153
///    125: 1power3 + 2power3 + 5power3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)


public class Armstrong {
	public static boolean isArmstrong(int n)
	{
		int temp=n;
		int p=0;
		while(n>0)
		{
			int rem=n%10;
			p=p+(rem*rem*rem);
			n=n/10;
		}
		return temp==p;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs= isArmstrong(n);
		if(rs== true)
		{
			System.out.println(n+" is Armstrong number");
		}
		else
		{
			System.out.println(n+" is Not Armstrong Number");
		}
		
		//Print 1 to n Armstrong number in the range
//		for(int i=1;i<=n;i++)
//		{
//			boolean rs =isArmstrong(i);
//			if(rs==true)
//			{
//				System.out.println(i+" ");
//			}
//		}
	}

}
