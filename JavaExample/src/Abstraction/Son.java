package Abstraction;

public class Son implements Father,Mother {
	Son()
	{
		super();
		System.out.println("Son");
	}
	
	@Override
	public void careF()
	{
		System.out.println("Father");
	}
	@Override
	public void careM()
	{
		System.out.println("Mother");
	}
	

	public static void main(String[] args) {
		Son s = new Son();
		s.careF();
		s.careM();

	}

}
