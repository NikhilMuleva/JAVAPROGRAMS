package Polymorj;

public class Son extends Father {
	//@Override
//	//public void drink()
//	{
//		System.out.println("Tea");
//		
//	}
	public static void main(String[] args) {
		Father f =new Son();
		f.drink();
		Son s= new Son();
		s.drink();
	}


}
