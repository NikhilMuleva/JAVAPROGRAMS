package HandlingFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class DemoWrite {

	public static void main(String[] args) {
		FileWriter fw =null;
		try {
			fw= new FileWriter("F:\\nik.txt");
			String data="Hello Nikhil "+"\n"+"How Are you ?";
			fw.write(data);
			System.out.println("Write Operation is Done");
		}
		catch (IOException e) {
			System.out.println("File not found");
		}
		finally {
			try {
				fw.close();
				
			} catch (  Exception e) {
				e.printStackTrace();
			}
		}
	

	}

}
