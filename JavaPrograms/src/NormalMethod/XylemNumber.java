package NormalMethod;

import java.util.Scanner;

// "Xylem and Phloem"
// A number N will be a xylem number if the sum of its extreme (first and last) digits is equal to 
//the sum of mean (all digits except first and last) digits. If the sum of extreme digits is not equal 
//to the sum of mean digits, the number is called phloem number.
//Sum of extreme digits = Sum of mean digits
//For Example:- 34326= 3+6=4+3+2=>9=9 is Xylem Number
            // 173156= 1+6=7+3+1+5=> 7!=16 Phloem Number or Not a Xylem number

public class XylemNumber {
	public static boolean isXylem(int n)
	{
		int ms=0,ls=0;
		ls=ls+n%10;
		n=n/10;
		while(n>9)
		{
			int r=n%10;
			ms=ms+r;
			n=n/10;
		}
		ls=ls+n;
		if(ls==ms)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		boolean rs= isXylem(n);
		if(rs==true)
		{
			System.out.println(n+" is xylem num");
			
		}
		else
		{
			System.out.println(n+" is not xylem num it is Phloem Number");
		}
		
   
	}

}
