package ExceptionExample;

import java.util.Scanner;
import java.util.*;

public class ATM {
	static void withDraw()
	{
		System.out.println("Start WithDraw");
		Scanner sc = new Scanner(System.in);
		int balance = 500000;
		int pin =1234;
		System.out.println("Enter the pin");
		int enteredPin =sc.nextInt();
		if(enteredPin == pin)
		{
			System.out.println("Enter the amount to withdraw");
			int amt =sc.nextInt();
			if(amt>=balance)
			{
				InsufficientBalanceException ibe =new InsufficientBalanceException();
				 throw ibe;
			}
			else
			{
				System.out.println("Removed Card");
				System.out.println("Wait for cash");
			}
		}
		else
		{ 
			IncorrectPinException ipe= new IncorrectPinException();
			throw ipe;
		}
		System.out.println("End the withdraw");
	}
	public static void main(String[] args) {
		System.out.println("Start ");
		withDraw();
		System.out.println("end");
	}
	
}
