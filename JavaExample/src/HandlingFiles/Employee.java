package HandlingFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	String name,company;
	int sal;

	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.name="Nikhil";
		e1.company="Microsoft";
		e1.sal=1000000000;
		
		try {
			FileOutputStream fos = new FileOutputStream("Object.txt");
			ObjectOutputStream ois= new ObjectOutputStream(fos);
		    ois.write Object(e1);
		    System.out.println();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

}
