
public class Demo {
	String drink="CheckPost Coffee";
	void Jspider()
	{
		String drink="Jspider Coffee";
		System.out.println("Jsp"+drink);
		System.out.println("jsp"+this.drink);
	}
	void company()
	{
	 System.out.println("Cpmpany"+drink);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.Jspider();
		d.company();

	}

}
