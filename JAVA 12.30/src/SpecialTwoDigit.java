import java.util.Scanner;

public class SpecialTwoDigit {
	static boolean isSpecial(int n)
	{
		int d1=n%10;
		int d2=n/10;
		int sum=d1*d2+d1+d2;
		if(sum==n)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rs=isSpecial(n);
		if(rs==true)
		{
			System.out.println("Special two Digitnumbers");
		}
		else
		{
			System.out.println(" Not Special two Digitnumbers");
		}
	}

}
