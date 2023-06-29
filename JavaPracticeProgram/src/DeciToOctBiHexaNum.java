import java.util.Scanner;

//Write a java program to convert Octoal ,Binary and HexaDecimal Number?
public class DeciToOctBiHexaNum {
	public static String convert(int dec,int base)
	{
		String st="0123456789ABCDEF";
		String rs=" ";
		do {
			int d=dec%base;
			rs= rs+st.charAt(d);
			dec= dec/base;
		}while(dec!=0);
		return rs;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int dec=sc.nextInt();
		String bin =convert(dec,2);
		System.out.println("Binary equalent is :"+ bin);
		
		String oct = convert(dec,8);
		System.out.println("Octoal equalent is : "+oct);
		
		String hex=convert(dec,16);
		System.out.println("Hexadecimal  equalent is: "+hex);
		
	}

}
