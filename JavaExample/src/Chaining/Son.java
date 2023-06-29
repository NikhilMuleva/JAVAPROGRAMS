package Chaining;

public class Son extends Father {
	Son()
	{
		super(2.5);
		System.out.println("Sons Constructor");
	}

	public static void main(String[] args) {
		Son s = new Son();
	}

}
