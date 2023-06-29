package Thread;
public class Multi extends Thread {
	@ Override
	public void run()
	{
		int n=5;
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+n+"="+(n*i)+"  " + getName());
		}
	}

}
