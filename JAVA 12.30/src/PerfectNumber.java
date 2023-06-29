import java.util.Scanner;
public class PerfectNumber {
	static boolean isPerfect(int x)
	{
		int sum=0;
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==x)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n= sc.nextInt();
		boolean rs= isPerfect(n);
		if(rs==true)
		{
			System.out.println(n+" is Perfect Number");
		}
		else
		{
			System.out.println(n+" is Not Perfect Number");
		}
	}

}
