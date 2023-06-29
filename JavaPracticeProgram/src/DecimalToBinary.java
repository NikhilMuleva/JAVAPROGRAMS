import java.util.Scanner;

public class DecimalToBinary {
	public static String decToBi(int n)
	{
		String st=" ";
		while(n>0)
		{
			int r=n%2;
			st=st+r;
			n=n/2;
		}
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		String rs=decToBi(n);
		System.out.println("Conver the Number Decimal to Binary: "+rs);
	}

}
