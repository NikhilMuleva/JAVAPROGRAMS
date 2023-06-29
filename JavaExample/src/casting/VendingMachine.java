package casting;

public class VendingMachine  {
	Object order(int input)
	{
		if(input==1)
		{
			return new Coffe();
		}
		else
		{
			return new Tea();
		}
	}


	public static void main(String[] args) {
		VendingMachine v = new VendingMachine();
		Object x=v.order(1);
		if(x instanceof Coffe)
		{
			Coffe c= (Coffe)x;
			c.coffDetails();
		}
		else
		{
			Tea t =(Tea)x;
			t.teaDetails();
		}
	}

}
