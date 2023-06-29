package NormalMethod;

import java.util.Scanner;

//Palindrome number in java: A palindrome number is a number that is same after reverse.
//For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
//It can also be a string like LOL, MADAM etc.



public class Palindrome {
	public static boolean isPalindrome(int n)
	{
		int rev=0,t=n;
		
		do{
			int  rem=n%10;
			 rev=rev*10+rem;
			 n=n/10;
		}while(n!=0);
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
		System.out.println("Enter The Number: ");
		int n=sc.nextInt();
		boolean rs= isPalindrome(n);
		if(rs==true)
		{
			System.out.println(n+ " is palindrome");
		}
		else
		{
			System.out.println(n+ " is Not Palindrome");
		}
		
		
	}

}
