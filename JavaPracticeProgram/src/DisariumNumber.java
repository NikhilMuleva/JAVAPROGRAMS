import java.util.Scanner;

public class DisariumNumber {
	public static int countDigit(int n) {
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
	public static boolean isDisarium(int n)
	{
		int temp=n,sum=0;
		int dc=countDigit(n);
		do {
			int d=n%10;
			sum=sum+pow(d,dc);
			dc--;
			n=n/10;
			
		}while(n!=0);
		return sum==temp;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs =isDisarium(n);
		if(rs==true)
		{
			System.out.println(n+" is disarium number");
		}
		else
		{
			System.out.println(n+" is not disarium number");
		}
		
		
		//Print the Disarium Number 1 To N Range
//		for(int i=1;i<=n;i++)
//		{
//			boolean rs = isDisarium(i);
//			if(rs==true)
//			{
//				System.out.println("The Disarium Number of 1 to "+i+" ");
//			}
//		}
	}

}
