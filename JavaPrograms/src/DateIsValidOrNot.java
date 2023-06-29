import java.util.Scanner;

//Read the Data from the user read the formate "DD MM YY" and print the date is valid or not 

public class DateIsValidOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the( DD MM YY)");
		int d =sc.nextInt();
		int m =sc.nextInt();
		int y =sc.nextInt();
		if(d<1||m<1||y<1||d>31||d>12)
		{
			System.out.println("Date is Invalid");
		}
		else if((m==4||m==6||m==8||m==9||m==11)&& d>30)
		{
			System.out.println("Date is Inavlid");
		}
		else if(m==2 && d>29)
		{
			System.out.println("Date is invalid");
		}
		else
		{
			System.out.println("Date is valid");
		}
		
	}

}
