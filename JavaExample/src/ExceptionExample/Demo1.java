package ExceptionExample;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Try block start");
			System.out.println(100/0);// Arithemetic Exception
			int x[]= {};
			System.out.println(x[2]);//Array Index Exception
			System.out.println("Try block end");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index Exception");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Arithemetic Exception");

		}
		
		catch (Throwable e) {
			System.out.println("This is an Exception");
		}
		
		

	}

}
