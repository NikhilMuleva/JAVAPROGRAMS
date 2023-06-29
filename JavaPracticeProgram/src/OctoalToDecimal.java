import java.util.Scanner;

public class OctoalToDecimal {
	public static int octToDec(int oct)
	{
		int dec=0,pw=1;
		do {
			int d=oct%10;
			dec=dec+d*pw;
			pw=pw*8;
			oct=oct/10;
		}while(oct!=0);
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octoal Number");
		int oct = sc.nextInt();
		int od = octToDec(oct);
		System.out.println("Convert Octoal to Decimal: " + od);
	}

}
