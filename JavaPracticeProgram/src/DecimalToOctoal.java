import java.util.Scanner;

public class DecimalToOctoal {
	public static String decToOct(int n)
	{
		String st=" ";
		while(n>0)
		{
			int r =n%8;
			st=st+r;
			n=n/8;
		}
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the Number :-");
		int n =sc.nextInt();
		String rs=decToOct(n);
		System.out.println("Convert Decimal to Octoal"+ rs);

	}

}
