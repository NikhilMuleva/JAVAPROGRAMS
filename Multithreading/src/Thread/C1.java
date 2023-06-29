package Thread;
public class C1 {

	public static void main(String[] args) {
		MyThread t0=new MyThread();
		t0.start();
		MyThread t1= new MyThread();
		t1.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

}
