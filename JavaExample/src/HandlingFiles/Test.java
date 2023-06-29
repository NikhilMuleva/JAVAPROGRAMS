package HandlingFiles;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		File f1= new File("F:\\demo.txt");
		try {
			f1.createNewFile();
			System.out.println("File Created");
		}
		catch (IOException e) {
			System.out.println("File Not Found");
		}
		
		if(f1.exists())
		{
			System.out.println("path: "+f1.getAbsolutePath());
			System.out.println("Name: "+f1.getName());
			System.out.println("size: "+f1.length());
			System.out.println("Readable: "+f1.canRead());
			System.out.println("Writable: "+f1.canWrite());
		}
		

	}

}
