import java.util.Scanner;

public class PerfectNumberInRange {
	public  static boolean isPerfect(int n)
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
		{
			return false;
		}
	}
	

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number");
	  int n =sc.nextInt();
	  for(int i=1;i<=n;i++)
	  {
		  boolean rs =isPerfect(i);
		  if(rs==true)
		  {
			  System.out.println(i+" ");
		  }
	  }

	}

}
