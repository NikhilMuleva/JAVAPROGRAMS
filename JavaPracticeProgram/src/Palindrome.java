import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int n)
	{
		int rev=0,t=n;
		do {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}while(n!=0);
	   if(rev==t)
	   {
		   return true;
		   
	   }
	   else {
		   return false;
	   }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		boolean rs=isPalindrome(n);
		if(rs==true)
		{
			System.out.println(n+" is Palindrome");
		}
		else
		{
			System.out.println(n+" is Not Palindrome");
		}
		

	}

}
