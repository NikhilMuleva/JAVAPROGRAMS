package HandlingFiles;

import java.io.File;
import java.io.IOException;

public class DemoTest {

	public static void main(String[] args) {
		File f= new File("F:\\nik.txt");
		try {
			f.createNewFile();
			System.out.println("File Craeted");
		}
		catch (IOException e) {
			System.out.println("File Not found");
			
		}

		if(f.exists())
		{
			System.out.println("path: "+f.getAbsolutePath());
			System.out.println("name: "+f.getName());
			System.out.println("Length: "+f.length());
			System.out.println("Readable: "+f.canRead());
			System.out.println("Writeable: "+f.canWrite());
		}
		
	}

}
