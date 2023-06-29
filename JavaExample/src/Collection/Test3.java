package Collection;

import java.util.HashSet;
import java.util.LinkedList;

public class Test3 {

	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		l1.add("hello");
		l1.add("nikhil");
		l1.add("muleva");
		l1.add("hello");
		l1.add("Handsome");
		l1.add("nikhil");
		System.out.println(l1);
		
		HashSet h1=new HashSet(l1);
		System.out.println(h1);
		h1.add("nikhil");
		System.out.println(h1);
		

	}

}
