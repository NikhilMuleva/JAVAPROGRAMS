import java.util.Scanner;

//A neon number is a number where the sum of the digits of its square is equal to the original number itself. 
//In other words, when you square a neon number and sum its digits, you get the original number.
//
//For example, let's consider the number 9. When we square 9, we get 81. 
//If we sum the digits of 81 (which are 8 and 1), the result is 9, which is the original number.
//Or
//A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.


public class NeonNumber {
	public static boolean isNeon(int n)
	{
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		return sum==n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=isNeon(n);
		if(rs==true)
		{
			System.out.println(n+" is Neon Number");
		}
		else {
			System.out.println(n+" is Not Neon Number");
		}

	}

}
