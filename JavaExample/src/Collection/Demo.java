package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		ArrayList al1= new ArrayList();
		al1.add("Rahul");
		al1.add("Virat");
		al1.add("Rohit");
		al1.add("MSD");
		al1.add("Raina");		

		ListIterator l1=al1.listIterator(al1.size());
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
	}

}
