import java.util.Scanner;

public class HappyNum {
	public static boolean isHappy(int n)
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
		if(n==1 || n==7)
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
//		boolean rs=isHappy(n);
//		if(rs==true)
//		{
//			System.out.println(n+" Is Happy Number");
//		}
//		else {
//			System.out.println(n+" is Not Happy Number");
//			
//		}
//		
		//Print 1 to n Happy Numbers
		for(int i=1;i<=n;i++)
		{
			boolean rs = isHappy(i);
			if(rs==true)
			{
				System.out.println(i+" ");
			}
		}
	}

}
