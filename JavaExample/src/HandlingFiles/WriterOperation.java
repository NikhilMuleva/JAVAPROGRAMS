package HandlingFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterOperation {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {
		 fw = new FileWriter("F:\\demo.txt");
		String data="Hello I am Nikhil"+"\n"+"i am Happy";
		fw.write(data);
		System.out.println("Write The Operation is Done");
		}
		catch (IOException e) {
			System.out.println("File Not Found");
		}
		finally {
			try {
				fw.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
