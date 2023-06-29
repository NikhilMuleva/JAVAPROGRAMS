package Collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Set s= new HashSet();
		s.add("Banglore");
		s.add("rajestan");
		s.add(null);
		s.add("Pune");
		s.add("quuu");
		s.add(null);
		s.add(null);
		System.out.println(s);

	}

}
