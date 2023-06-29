package NormalMethod;

public class xy {
	public static void main(String[] args) {
		int number = 4455; // Change this value to test different numbers

		if (isXylemNumber(number)) {
			System.out.println(number + " is a Xylem number");
		} else {
			System.out.println(number + " is a Phloem number");
		}
	}

	public static boolean isXylemNumber(int num) {
		int sum = 0;
		int temp = num;

		while (temp > 0) {
			int digit = temp % 10;
			sum += digit * digit * digit;
			temp /= 10;
		}

		return sum == num;
	}

}
