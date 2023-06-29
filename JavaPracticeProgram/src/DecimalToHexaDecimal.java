import java.util.Scanner;

public class DecimalToHexaDecimal {
	public static String decToHexa(int n)
	{
		String hx=" ";
		while(n>0)
		{
			int r =n%10;
			if(r<10)
			{
				hx=hx+r;
			}
			else {
				hx=(char)(r+55)+hx;
			}
			
		}
		return hx;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		String rs= decToHexa(n);
		System.out.println("Convert Decimal to HexaDecimal: "+rs);

	}

}
