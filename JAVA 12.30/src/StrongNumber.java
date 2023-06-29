//Define a method return True if the Number is strong Number otherwise return false?
import java.util.Scanner;
public class StrongNumber {
	static int fact(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	static boolean isStrong(int x)
	{
		int sum=0,temp=x;
		do
		{
			int d=x%10;
			sum=sum+fact(d);
			x=x/10;
		} while(x!=0);
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n =sc.nextInt();
		boolean rs=isStrong(n);
		if(rs==true)
		{
			System.out.println(n+" is Strong Number");
		}
		else
		{
			System.out.println(n+ " is Not Strong number");
		}
		
	}

}
