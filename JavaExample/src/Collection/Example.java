package Collection;

import java.util.*;

public class Example {

	public static void main(String[] args) {
		 Test<String> list = new Test<>();
	        list.add("apple");
	        list.add("banana");
	        list.add("cherry");
	        list.add("date");
	        list.add("elderberry");
	        list.add("fig");
	        list.add("grape");
	        list.add("honeydew");

	        // add some duplicates using a HashSet
	        HashSet<String> duplicates = new HashSet<>();
	        duplicates.add("banana");
	        duplicates.add("date");
	        duplicates.add("fig");
	        duplicates.add("grape");

	        for (String duplicate : duplicates) {
	            list.add(duplicate);
	        }

	        System.out.println(list);

	}

}
