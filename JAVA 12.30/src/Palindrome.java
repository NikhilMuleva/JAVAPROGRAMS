import java.util.Scanner;
public class Palindrome {
	static boolean isPalindrome(int n)
	{
		int rev=0,t=n;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==t)
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
		System.out.println("Enter the Number:");
		int n =sc.nextInt();
		boolean rs =isPalindrome(n);
		if(rs==true)
		{
			System.out.println(n+ " is Palindrome");
		}
		else
		{
			System.out.println(n+ " is Not Palindrome");
		}

	}

}
