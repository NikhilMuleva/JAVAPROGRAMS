import java.util.Scanner;
public class ZeroOrNotZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n>=0 && n<=0)
		{
			System.out.println(n+" is Zero Number");
		}
		else
		{
			System.out.println(n+" is NonZero Number");
		}
	}

}
