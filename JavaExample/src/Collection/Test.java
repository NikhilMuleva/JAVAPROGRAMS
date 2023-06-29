package Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Nik");
		a1.add("Niksss");
		a1.add("raju");
		a1.add("pappu");
		a1.add("gour");
		a1.add("Nemo");
		System.out.println(a1);
		a1.add(1,"muleva");
		System.out.println(a1);
		
		LinkedList l1= new LinkedList(a1);
		System.out.println(l1);

	}

}
