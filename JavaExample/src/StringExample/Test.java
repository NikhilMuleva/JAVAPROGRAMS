package StringExample;

public class Test {

	public static void main(String[] args) {
		String s1= "Java";
		String s2="Java";
		String s3 = new String("Java");
		String s4 = new String("java");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();
	}

}
