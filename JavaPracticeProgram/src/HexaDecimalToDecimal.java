import java.util.Scanner;

public class HexaDecimalToDecimal {
	public static double hexaToDec(String hx) {
		double decNum=0;
		int pow=0;
		for(int i=hx.length()-1;i>=0;i--)
		{
			char hxChar=hx.charAt(i);
			int digit=Character.digit(hxChar, 16);
			decNum=decNum+ digit*Math.pow(16, pow);
			pow++;
		}
		return decNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Hexadecimal number");
		String hx = sc.next();
		double decNum= hexaToDec(hx);
		System.out.println("Convert Hexa To Decimal :"+decNum);
	}

}
