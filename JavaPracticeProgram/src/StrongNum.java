import java.util.Scanner;

public class StrongNum {
	public static int fact(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
			
		}
		return fact;
	}
	
	public static  boolean isStrong(int n)
	{
		int sum=0,temp=n;
		do {
			int d=n%10;
			sum=sum+fact(d);
			n=n/10;
		}while(n!=0);
		return sum==temp;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean rs = isStrong(n);
		if (rs == true) {
			System.out.println(n + " Is Strong number");
		} else {
			System.out.println(n + " Is Not strong nunber");
		}
	}

}
