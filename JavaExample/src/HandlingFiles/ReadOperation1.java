package HandlingFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadOperation1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\demo.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				char c=(char)i;
				System.out.print(c);
			}
		}
		catch (Throwable e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}

	}

}
