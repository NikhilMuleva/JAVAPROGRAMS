package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList al1= new ArrayList();
		al1.add("Rahul");
		al1.add("Virat");
		al1.add("Rohit");
		al1.add("MSD");
		al1.add("Raina");	
		
		Iterator i =al1.iterator();
		System.out.println(i);
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
