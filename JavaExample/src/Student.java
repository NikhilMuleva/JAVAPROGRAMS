//Example of Encapsulation 
public class Student {
	private String name;
	private int age;
	private double perc;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setPerc(double perc)
	{
		this.perc=perc;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
		
	}
	public double getPerc() {
		return perc;
	}

	public static void main(String[] args) {
		Student s= new Student();
		s.setName("nikhil");
		s.setAge(22);
		s.setPerc(83.31);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getPerc());
		
	}

}
