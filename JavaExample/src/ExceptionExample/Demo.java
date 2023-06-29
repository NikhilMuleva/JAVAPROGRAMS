package ExceptionExample;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		System.out.println("Start the Part");
		try
		{
			System.out.println("Try block start");
			System.out.println(100/0);
		}
		
		
		
		catch (ArithmeticException e) {
			System.out.println("Catch block ");
			
		}
		System.out.println("End of the Part");

		{
			System.out.println("Finally Blcok");

			
		}
		

	}

}
