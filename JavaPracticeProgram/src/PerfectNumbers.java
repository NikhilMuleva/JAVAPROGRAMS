import java.util.Scanner;

public class PerfectNumbers {
	public static boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(sum==n)
		{
			return true;
		}
		else
			return false;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number");
		int n=sc.nextInt();
		boolean rs = isPerfect(n);
		if(rs==true)
		{
			System.out.println(n+" is perfect Number");
		}
		else {
			System.out.println(n+" is not Perfect Number");
		}

	}

}
