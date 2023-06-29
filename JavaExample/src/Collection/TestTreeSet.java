package Collection;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("hello");
		t.add("Banglore");
		t.add("rajestan");
		
		t.add("Pune");
		t.add("quuu");
		
		t.contains("hello");
		System.out.println(t);
		t.clear();
		
		
		System.out.println(t);
	}

}
