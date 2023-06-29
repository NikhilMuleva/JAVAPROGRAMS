package Polymorj;

public class Daughter extends Father {
	@Override
	public void drink()
	{
		System.out.println("Water");
	}


	public static void main(String[] args) {
		Father f = new Son();
		f.drink();
		
		

	}

}
