import java.util.Scanner;

//Write a program to the read the month number from the user print and how many days in that month number
public class MonthDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month Number");
		int m = sc.nextInt();

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			System.out.println("31 days are This Month");
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.println("30 Days in this month");
		} else if (m == 2) {
			System.out.println("28 or 29 days in this month");
		}

	}

}
