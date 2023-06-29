package HandlingFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoRead {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\nik.txt");
			Scanner sc = new Scanner(fr);
	        while(sc.hasNextLine())
	        {
	        	System.out.println(sc.nextLine());
	        }
	        sc.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");

		}

	}

}
