import java.util.Scanner;

public class XylemPhloemNumber {
	public static boolean isXylemPhloem(int n)
	{
		 int ms=0,ls=0;
		 ls=ls+n%10;
		 n=n/10;
		 while(n>9)
		 {
			 int rem=n%10;
			 ms=ms+rem;
			 n=n/10;
		 }
		 ls=ls+n;
		 if(ls==ms)
			 return true;
		 else
			 return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n =sc.nextInt();
		boolean rs = isXylemPhloem(n);
		if(rs==true)
		{
			System.out.println(n+" is Xylem Number");
		}
		else
		{
			System.out.println(n+" is Phloem Number");
		}
	}

}
