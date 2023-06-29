import java.util.Scanner;

public class BinaryToDecimal {
	public static int binToDec(int bin) {
		int dec=0,pw=1;
		do {
			int d=bin%10;
			dec=dec+d*pw;
			pw=pw*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number");
		int bin=sc.nextInt();
		int bd= binToDec(bin);
		System.out.println("Convert Binary to Decimal  "+ bd);

	}

}
