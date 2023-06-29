import java.util.Scanner;

public class DuckNumber {
	public static boolean isDuck(int n)
	{ int count=0;
		while(n!=0)
		 {
			int rem=n%10;
			 if(rem!=0)
			 {
				 count++;
				 break;
			 }
			 n=n/10;
		 }
	     if(count>0) 
		{
	    	 
	    	 return true;
		}
	     else
	     {
	    	 return false;
	     }
		 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rs = isDuck(n);
		if(rs==true)
		{
			System.out.println(n+" is Duck Number");
		}
		else
		{
			System.out.println(n+" is Not Duck Number");
		}
	}

}
